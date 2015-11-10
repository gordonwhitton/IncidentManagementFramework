package incidentutility;

import incident.Incident;
import incident.IncidentPriority;
import incident.IncidentType;
import incident.SecurityLabel;

public class IncidentFactory {
	
	public static Incident createHighPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
		// return an instance of the initial state
		Incident result = new Incident(securityLabel, IncidentPriority.HIGH, incidentType,
				 title,  description,  systemName);
		addIncidentToIncidentStore(result);
		return result;
	}
	
	public static Incident createMediumPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
		// return an instance of the initial state
		Incident result = new Incident(securityLabel, IncidentPriority.MEDIUM, incidentType,
				 title,  description,  systemName);
		addIncidentToIncidentStore(result);
		return result;
	}
	
	public static Incident createLowPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
		// return an instance of the initial state
		Incident result = new Incident(securityLabel, IncidentPriority.LOW, incidentType,
				 title,  description,  systemName);
		addIncidentToIncidentStore(result);
		return result;
	}
	
	private static void addIncidentToIncidentStore(Incident incident){
		IncidentsStore.getInstance().addIncident(incident);
	}
}
