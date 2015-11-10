package systemremote;

import java.util.ArrayList;

public class SMTPMailbox implements Mailbox{
	
	private String address;
	private ArrayList<SMTPMessage> messagesInbox;
	private ArrayList<SMTPMessage> messagesOutbox;
	private ArrayList<SMTPMailboxListener> listners;
	
	public SMTPMailbox(String address, ArrayList<SMTPMessage> messagesInbox, ArrayList<SMTPMessage> messagesOutbox) {
		super();
		this.address = address;
		this.messagesInbox = messagesInbox;
		this.messagesOutbox = messagesOutbox;
		listners = new ArrayList<SMTPMailboxListener>();
	}

	public ArrayList<SMTPMessage> getMessagesInbox(){
		getMessagesFromServer();
		return messagesInbox;
	}
	
	public void doNewMessage(String recipeint, String body){
		SMTPMessage m = new SMTPMessage(body, address, recipeint);
		m.doSend();
		messagesOutbox.add(m);
	}

	@Override
	public void doAttach(SMTPMailboxListener obs) {
		listners.add(obs);
		
	}

	@Override
	public void doDetach(SMTPMailboxListener obs) {
		listners.remove(obs);
		
	}
	
	private void getMessagesFromServer(){
		//code here to extract messages according to timer
	}

	@Override
	public void doNotify() {
		for(SMTPMailboxListener l : listners){
			l.doUpdate();
		}
		
	}

	@Override
	public void clearInbox() {
		messagesInbox.clear();
	}

}
