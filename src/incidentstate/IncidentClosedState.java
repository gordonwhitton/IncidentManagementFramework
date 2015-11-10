package incidentstate;

import incident.Incident;

public class IncidentClosedState extends IncidentState{

	@Override
	public String getState() {
		return "Closed";
	}

	@Override
	public void setNextPhase(Incident incident) {
		//state change here takes incident back to beginning
		incident.setState(new IncidentDetectionAndReportState());
	}

	@Override
	public void setClosed(Incident incident) throws InvalidStateChangeException {
		throw new InvalidStateChangeException("Invalid State Change attempted.");
	}
}
