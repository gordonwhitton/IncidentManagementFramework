package ui;

import incident.Incident;
import incidentstate.InvalidStateChangeException;
import users.AdministrativeUser;
import users.InvalidUserException;

public class SetUnderControlUI {
	public static void setUnderControl(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		incident.setUnderControl(user);
	}
}
