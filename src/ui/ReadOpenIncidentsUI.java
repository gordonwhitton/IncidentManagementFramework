package ui;

import java.util.ArrayList;

import incident.Incident;
import incidentutility.IncidentsStore;

import incidentalgorithm.GetIncidentsType;

public class ReadOpenIncidentsUI {
	public static ArrayList<Incident> getOpenIncidents(){
		IncidentsStore store = IncidentsStore.getInstance();
		return store.getIncidents(GetIncidentsType.OPEN);
	}

}
