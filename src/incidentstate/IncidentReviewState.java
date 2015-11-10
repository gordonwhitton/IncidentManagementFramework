package incidentstate;

import java.util.HashSet;
import java.util.Set;

import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentEntryType;

public class IncidentReviewState extends IncidentState{

	@Override
	public String getState() {
		return "Review";
	}

	@Override
	public void setNextPhase(Incident incident) throws InvalidStateChangeException {
	
		Set<IncidentEntryType> types = new HashSet<IncidentEntryType>();
		
		for (IncidentEntry entry : incident.getIncidentEntries()){
			types.add(entry.getType());
		}
		
		if(types.contains(IncidentEntryType.REVIEW)){
			incident.setState(new IncidentClosedState());
		}
		else{
			throw new InvalidStateChangeException("Necessary prerequisite entries have not been entered.");
		}
	}

	@Override
	public void setClosed(Incident incident) throws InvalidStateChangeException {
		incident.setState(new IncidentClosedState());
	}
}
