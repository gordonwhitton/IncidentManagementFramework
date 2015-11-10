package incidentstate;

import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentEntryType;
import java.util.HashSet;
import java.util.Set;

public class IncidentUnderControlState extends IncidentState{

	@Override
	public String getState() {
		return "UnderControl";
	}

	public void setIsCrisis(Incident incident){
		incident.setState(new IncidentCrisisState());
	}

	@Override
	public void setNextPhase(Incident incident) throws InvalidStateChangeException {
		Set<IncidentEntryType> types = new HashSet<IncidentEntryType>();
		
		for (IncidentEntry entry : incident.getIncidentEntries()){
			types.add(entry.getType());
		}
		
		if(types.contains(IncidentEntryType.LATE_RESPONSE)
				&& types.contains(IncidentEntryType.FORENSIC_ANALYSIS)
				&& types.contains(IncidentEntryType.COMMUNICATIONS)){
			incident.setState(new IncidentReviewState());
		}
		else{
			throw new InvalidStateChangeException("Necessary prerequisite entries have not been entered.");
		}
	}

	@Override
	public void setClosed(Incident incident) throws InvalidStateChangeException {
		throw new InvalidStateChangeException("Invalid State Change attempted.");
	}
}
