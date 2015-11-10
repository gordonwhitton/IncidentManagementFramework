package users;

import incident.Incident;
import incident.IncidentListener;
import incidentstate.IncidentState;

public abstract class BasicUser implements IncidentListener{
	
	
	@Override
	public void doUpdate(Incident incident, IncidentState state){
		// code here to receive update of state
	}
	
	public BasicUser(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	protected String name;
	protected Integer id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
