package incidentstate;

import java.util.HashSet;
import java.util.Set;

import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentEntryType;

public class IncidentDetectionAndReportState extends IncidentState{

	@Override
	public String getState() {
		return "DetectionAndReport";
	}

	@Override
	public void setNextPhase(Incident incident) 
			throws InvalidStateChangeException {
		
		Set<IncidentEntryType> types = new HashSet<IncidentEntryType>();
		
		for (IncidentEntry entry : incident.getIncidentEntries()){
			types.add(entry.getType());
		}
		
		if(types.contains(IncidentEntryType.CREATE)
				&& types.contains(IncidentEntryType.DETECTION)
				&& types.contains(IncidentEntryType.REPORTING)){
			incident.setState(new IncidentAssessmentAndDecisionState());
		}
		else{
			throw new InvalidStateChangeException
			("Necessary prerequisite entries have not been entered.");
		}
	}

	@Override
	public void setClosed(Incident incident) {
		incident.setState(new IncidentClosedState());
	}
}
