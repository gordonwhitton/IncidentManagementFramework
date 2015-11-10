package ui;

import incident.Incident;
import incidentalgorithm.GetIncidentsType;
import incidentutility.IncidentsStore;

import java.util.ArrayList;

public class ReadClosedIncidentsUI {
	public static ArrayList<Incident> getClosedIncidents(){
		IncidentsStore store = IncidentsStore.getInstance();
		return store.getIncidents(GetIncidentsType.CLOSED);
	}
}
