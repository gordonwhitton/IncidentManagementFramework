package incidentstate;

import incident.Incident;

public class IncidentResponseState extends IncidentState{

	@Override
	public String getState() {
		return "Response";
	}

	public void setIsCrisis(Incident incident){
		incident.setState(new IncidentCrisisState());
	}
	
	public void setIsUnderControl(Incident incident){
		incident.setState(new IncidentUnderControlState());
	}

	@Override
	public void setNextPhase(Incident incident){
		//assume is under control
		incident.setState(new IncidentUnderControlState());
	}

	@Override
	public void setClosed(Incident incident) {
		incident.setState(new IncidentClosedState());
	}
}
