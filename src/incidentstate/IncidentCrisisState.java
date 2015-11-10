package incidentstate;

import incident.Incident;

public class IncidentCrisisState extends IncidentState{

	@Override
	public String getState() {
		return "Crisis";
	}
	
	public void setIsUnderControl(Incident incident){
		incident.setState(new IncidentUnderControlState());
	}

	@Override
	public void setNextPhase(Incident incident) {
		incident.setState(new IncidentUnderControlState());
	}

	@Override
	public void setClosed(Incident incident) throws InvalidStateChangeException{
		throw new InvalidStateChangeException("Invalid State Change attempted.");
	}
}
