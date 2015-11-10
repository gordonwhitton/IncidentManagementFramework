package ui;

import incident.Incident;
import incidentutility.IncidentLinkException;
import incidentutility.IncidentsStore;
import users.BasicUser;
import users.InvalidUserException;

public class LinkTwoIncidentsUI {
	
	public static Boolean addIncidentLink(BasicUser user, Incident incident1, Incident incident2) throws InvalidUserException, IncidentLinkException{
		return IncidentsStore.getInstance().addIncidentLink(user, incident1, incident2);
	}
}
