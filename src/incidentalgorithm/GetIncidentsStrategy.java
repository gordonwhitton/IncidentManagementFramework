package incidentalgorithm;

import incident.Incident;
import incidentutility.IncidentsStore;

import java.util.ArrayList;

public interface GetIncidentsStrategy {
	
	public ArrayList<Incident> getIncidents(IncidentsStore store);
	public void doCalculateOrder();
	public void doFilterMessages();

}
