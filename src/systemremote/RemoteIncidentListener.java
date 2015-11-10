package systemremote;

import systemlocal.InternalMessageParser;

public class RemoteIncidentListener implements SMTPMailboxListener{
	
	private SMTPServer mailserver;
	private Mailbox mailbox;
	private static RemoteIncidentListener theInstance;
	private InternalMessageParser parser;
	
	private RemoteIncidentListener(){
		parser = InternalMessageParser.getInstance();
		//assume we are getting actual server here
		mailserver = new SMTPServer("server config details");
		mailbox = mailserver.getMailbox("Remote system mailbox address");
	}

	public static RemoteIncidentListener getInstance(){
		if(theInstance == null){
			theInstance = new RemoteIncidentListener();
		}
		return theInstance;
	}

	@Override
	public void doUpdate() {
		for(SMTPMessage m : mailbox.getMessagesInbox()){
			parser.doParseRemoteMessage(m.getMessageText());
		}
		mailbox.clearInbox();
	}
}
