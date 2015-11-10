package ui;

import incident.Incident;
import incidentalgorithm.GetIncidentsType;
import incidentutility.IncidentsStore;

import java.util.ArrayList;

public class ReadIncidentsInPriorityOrderUI {
	public static ArrayList<Incident> getOpenIncidents(){
		IncidentsStore store = IncidentsStore.getInstance();
		return store.getIncidents(GetIncidentsType.PRIORITY_ORDER);
	}
}
