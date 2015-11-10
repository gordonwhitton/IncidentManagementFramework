package incidentalgorithm;

import incident.Incident;
import incidentutility.IncidentsStore;

import java.util.ArrayList;

public class IncidentsClosedStrategy implements GetIncidentsStrategy{

	@SuppressWarnings("unused")
	private IncidentsStore store;
	private ArrayList<Incident> result;
	
	@Override
	public ArrayList<Incident> getIncidents(IncidentsStore store) {

		this.store = store;
		result = new ArrayList<Incident>();
		doCalculateOrder();
		doFilterMessages();
		
		return result;
	}

	@Override
	public void doCalculateOrder() {
		// code goes here
		
	}

	@Override
	public void doFilterMessages() {
		// code goes here
	}
}
