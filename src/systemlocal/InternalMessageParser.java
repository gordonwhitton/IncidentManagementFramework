package systemlocal;

import incident.IncidentPriority;
import incident.IncidentType;
import incident.SecurityLabel;
import incidentutility.IncidentFactory;
import incidentutility.IncidentsStore;
import systemremote.RemoteIncidentListener;

public class InternalMessageParser {
	
	@SuppressWarnings("unused")
	private RemoteIncidentListener remote;
	@SuppressWarnings("unused")
	private LocalIncidentListener local;
	private static InternalMessageParser theInstance;
	
	private InternalMessageParser(){
		remote = RemoteIncidentListener.getInstance();
		local = LocalIncidentListener.getInstance();
	}
	
	public static InternalMessageParser getInstance(){
		if(theInstance == null){
			theInstance = new InternalMessageParser();
		}
		return theInstance;
	}
	
	public void doParseRemoteMessage(String message){
		SecurityLabel sl = null;
		IncidentPriority ip = null;
		IncidentType it = null;
		String title = null;
		String description = null;
		String systemName = null;

		//perform work on message string
		IncidentsStore store = IncidentsStore.getInstance();
		switch (ip){
		case HIGH : store.addIncident(IncidentFactory.createHighPriorityIncident(sl, 
				it, title, description, systemName)); break;
		case MEDIUM : store.addIncident(IncidentFactory.createMediumPriorityIncident(sl, 
				it, title, description, systemName)); break;
		case LOW : store.addIncident(IncidentFactory.createLowPriorityIncident(sl, 
				it, title, description, systemName)); break;
		}
	}
	
	public void doParseLocalMessage(String message){
		SecurityLabel sl = null;
		IncidentPriority ip = null;
		IncidentType it = null;
		String title = null;
		String description = null;
		String systemName = null;

		//perform work on message string
		IncidentsStore store = IncidentsStore.getInstance();
		switch (ip){
		case HIGH : store.addIncident(IncidentFactory.createHighPriorityIncident(sl, 
				it, title, description, systemName)); break;
		case MEDIUM : store.addIncident(IncidentFactory.createMediumPriorityIncident(sl, 
				it, title, description, systemName)); break;
		case LOW : store.addIncident(IncidentFactory.createLowPriorityIncident(sl, 
				it, title, description, systemName)); break;
		}
	}
}
