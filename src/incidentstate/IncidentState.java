package incidentstate;

import incident.Incident;

public abstract class IncidentState {
	public abstract void setNextPhase(Incident incident) throws InvalidStateChangeException;
	public abstract void setClosed(Incident incident) throws InvalidStateChangeException;
	public abstract String getState();
}
