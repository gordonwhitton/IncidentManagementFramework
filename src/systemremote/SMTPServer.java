package systemremote;

import java.util.ArrayList;

public class SMTPServer {
	
	private ArrayList<Mailbox> mailboxes;
	@SuppressWarnings("unused")
	private String serverDetails;
	
	public SMTPServer(String serverDetails) {
		super();
		this.serverDetails = serverDetails;
		this.mailboxes = new ArrayList<Mailbox>();
		getServerComponents();
	}

	public Mailbox getMailbox(String address){
		return null;
	}
	
	public Boolean addMailbox(String address){
		return mailboxes.add(new SMTPMailbox(address, new ArrayList<SMTPMessage>(), new ArrayList<SMTPMessage>()));
	}
	
	private void getServerComponents(){
		//code here linking object to actual server
	}

}
