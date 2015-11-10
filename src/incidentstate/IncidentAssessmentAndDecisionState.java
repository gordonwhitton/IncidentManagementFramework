package incidentstate;

import java.util.HashSet;
import java.util.Set;

import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentEntryType;

public class IncidentAssessmentAndDecisionState extends IncidentState{

	@Override
	public String getState() {
		return "AssessmentAndDecision";
	}

	@Override
	public void setNextPhase(Incident incident) throws InvalidStateChangeException {

		if(incident.getIsFalsePositive()){
			setClosed(incident);
		}
		else{
			Set<IncidentEntryType> types = new HashSet<IncidentEntryType>();

			for (IncidentEntry entry : incident.getIncidentEntries()){
				types.add(entry.getType());
			}

			if(types.contains(IncidentEntryType.INFORMATION_COLLECTION)
					&& types.contains(IncidentEntryType.ASSESSMENT_1)
					&& types.contains(IncidentEntryType.ASSESSMENT_2)){
				incident.setState(new IncidentResponseState());
			}
			else{
				throw new InvalidStateChangeException("Necessary prerequisite entries have not been entered.");
			}
		}
	}

	@Override
	public void setClosed(Incident incident) {
		incident.setState(new IncidentClosedState());
	}
}
