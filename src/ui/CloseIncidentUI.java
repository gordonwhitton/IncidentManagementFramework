package ui;

import incident.Incident;
import incidentstate.InvalidStateChangeException;

public class CloseIncidentUI {
	public static Boolean setIncidentClosed(Incident incident) throws InvalidStateChangeException{
		incident.setIncidentClosed();
		return true;
	}
}
