package incidentutility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import users.AdministrativeUser;
import users.BasicUser;
import users.InvalidUserException;

import incident.Incident;
import incidentalgorithm.GetIncidentsStrategy;
import incidentalgorithm.GetIncidentsType;
import incidentalgorithm.IncidentsClosedStrategy;
import incidentalgorithm.IncidentsDateOrderStrategy;
import incidentalgorithm.IncidentsOpenStrategy;
import incidentalgorithm.IncidentsPriorityOrderStrategy;

public class IncidentsStore {
	private ArrayList<Incident> incidents;
	private ArrayList<IncidentLink> incidentLinks;
	private static IncidentsStore theInstance;
	
	private IncidentsStore() {
		super();
		this.incidents = new ArrayList<Incident>();
		this.incidentLinks = new ArrayList<IncidentLink>();
	}

	public static IncidentsStore getInstance(){
		
		if(theInstance == null){
			theInstance = new IncidentsStore();
		}
		
		return theInstance;
	}
	
	public ArrayList<Incident> getIncidents(GetIncidentsType type){

		GetIncidentsStrategy strategy = null;
		
		switch(type){
		case OPEN :strategy = new IncidentsOpenStrategy(); break;
		case CLOSED :strategy = new IncidentsClosedStrategy(); break;
		case DATE_ORDER :strategy = new IncidentsDateOrderStrategy(); break;
		case PRIORITY_ORDER :strategy = new IncidentsPriorityOrderStrategy(); break;
		default: break;
		}

		return strategy.getIncidents(this);
	}

	public Incident getIncident(Integer referenceNo){
		for (Incident i : incidents){
			if(i.getReferenceNo() == referenceNo){
				return i;
			}
		}
		return null;
	}
	
	public Boolean addIncident(Incident incident){
		return incidents.add(incident);
	}

	public Set<Incident> getLinkedIncidents(Incident incident){
		// use a Set here as we are only interested in unique results
		Set<Incident> results = new HashSet<Incident>();
		
		for(IncidentLink l : incidentLinks){
			if(incident.equals(l.getIncident1())){
				results.add(l.getIncident2());
			}
			if(incident.equals(l.getIncident2())){
				results.add(l.getIncident1());
			}
		}
		return results;
	}
	
	public Boolean addIncidentLink(BasicUser user, 
			Incident incident1, Incident incident2) 
					throws InvalidUserException, IncidentLinkException{
		
		if(user instanceof AdministrativeUser){
			return incidentLinks.add(new IncidentLink(incident1, incident2));
		}
		else{
			throw new InvalidUserException("Invalid User");
		}
	}
}
