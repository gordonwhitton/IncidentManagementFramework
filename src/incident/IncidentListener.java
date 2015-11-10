package incident;

import incidentstate.IncidentState;

public interface IncidentListener {
	public void doUpdate(Incident incident, IncidentState state);
}
