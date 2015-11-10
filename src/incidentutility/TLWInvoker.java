package incidentutility;

import java.util.ArrayList;

public class TLWInvoker {

	private ArrayList<TLWCommand> commands;
	private static TLWInvoker theInstance;
	
	private TLWInvoker(){
		commands = new ArrayList<TLWCommand>();
	}
	
	public static TLWInvoker getInstance(){
		if(theInstance == null){
			theInstance = new TLWInvoker();
		}
		return theInstance;
	}

	public void doStoreCommand(){
		for(TLWCommand c : commands){
			c.execute();
		}
	}
	
	public Boolean addCommand(TLWCommand c){
		return commands.add(c);
	}
}
