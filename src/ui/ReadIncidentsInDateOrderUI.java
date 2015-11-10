package ui;

import incident.Incident;
import incidentalgorithm.GetIncidentsType;
import incidentutility.IncidentsStore;

import java.util.ArrayList;

public class ReadIncidentsInDateOrderUI {
	public static ArrayList<Incident> getDateOrderIncidents(){
		IncidentsStore store = IncidentsStore.getInstance();
		return store.getIncidents(GetIncidentsType.DATE_ORDER);
	}
}
