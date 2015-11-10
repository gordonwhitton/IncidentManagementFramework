package systemremote;

import java.util.ArrayList;

public interface Mailbox {
	
	public void doAttach(SMTPMailboxListener obs);
	public void doDetach(SMTPMailboxListener obs);
	public void doNotify();
	public ArrayList<SMTPMessage> getMessagesInbox();
	public void doNewMessage(String recipeint, String body);
	public void clearInbox();

}
