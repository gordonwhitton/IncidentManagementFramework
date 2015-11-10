package systemremote;

public class SMTPMessage {
	private String body;
	@SuppressWarnings("unused")
	private String sender;
	@SuppressWarnings("unused")
	private String recipient;
	
	public SMTPMessage(String body, String sender, String recipient) {
		super();
		this.body = body;
		this.sender = sender;
		this.recipient = recipient;
	}

	public String getMessageText(){
		return body;
	}
	
	public void doSend(){
		//sending mechanism goes here
	}

}
