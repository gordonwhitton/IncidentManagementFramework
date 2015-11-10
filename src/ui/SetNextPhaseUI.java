package ui;

import users.BasicUser;
import incident.Incident;
import incidentstate.InvalidStateChangeException;

public class SetNextPhaseUI {
	
	public static Boolean setNextPhase(Incident incident, BasicUser user){
		//only users of specific type will be able to perform this operation
		try {
			incident.setNextPhase();
		} catch (InvalidStateChangeException e) {
			return false;
		}
		return true;
	}
}
