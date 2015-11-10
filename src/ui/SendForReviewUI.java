package ui;

import incident.Incident;
import incidentstate.InvalidStateChangeException;
import users.AdministrativeUser;
import users.InvalidUserException;

public class SendForReviewUI {
	public static void setReview(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		incident.setReview(user);
	}
}
