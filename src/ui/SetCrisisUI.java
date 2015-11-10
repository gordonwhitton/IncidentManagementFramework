package ui;

import incident.Incident;
import incidentstate.InvalidStateChangeException;
import users.AdministrativeUser;
import users.InvalidUserException;

public class SetCrisisUI {
	public static void setCrisis(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		incident.setCrisis(user);
	}
}
