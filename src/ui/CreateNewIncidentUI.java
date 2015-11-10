package ui;

import incident.Incident;
import incident.IncidentType;
import incident.SecurityLabel;
import incidentutility.IncidentFactory;

public class CreateNewIncidentUI {
		
	public static Incident createNewHighPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return IncidentFactory.createHighPriorityIncident(securityLabel, incidentType, 
						title, description, systemName);
	}
	
	public static Incident createNewMediumPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return IncidentFactory.createMediumPriorityIncident(securityLabel, incidentType, 
						title, description, systemName);
	}
	
	public static Incident createNewLowPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return IncidentFactory.createLowPriorityIncident(securityLabel, incidentType, 
						title, description, systemName);
	}
	

}
