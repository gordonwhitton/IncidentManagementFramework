package incidentutility;

import incident.Incident;

public class IncidentLink {
	private Incident incident1;
	private Incident incident2;
	
	/**
	 * @return the incident1
	 */
	public Incident getIncident1() {
		return incident1;
	}
	/**
	 * @return the incident2
	 */
	public Incident getIncident2() {
		return incident2;
	}
	
	public IncidentLink(Incident incident1, Incident incident2) throws IncidentLinkException {
		super();
		if (incident1 != incident2){
			this.incident1 = incident1;
			this.incident2 = incident2;
		}
		else{
			throw new IncidentLinkException();
		}
	}

	public void setLinkIncidents(Incident incident1, Incident incident2){
		this.incident1 = incident1;
		this.incident2 = incident2;
	}
	
	public void setUnlinkIncidents(Incident incident1, Incident incident2){
		this.incident1 = null;
		this.incident2 = null;
	}
}
