package systemlocal;


public class LocalIncidentListener implements SystemAdapterListener{

	
	private LocalIncidentListener(){
		parser = InternalMessageParser.getInstance();
	}
	
	private static LocalIncidentListener theInstance;
	@SuppressWarnings("unused")
	private InternalMessageParser parser;
	
	public static LocalIncidentListener getInstance(){
		if(theInstance == null){
			theInstance = new LocalIncidentListener();
		}
		return theInstance;
	}

	@Override
	public void doUpdate() {
		//operates in similar way to RemoteIncidentListner
	}
}
