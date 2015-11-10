/**
 * 
 */
package incident;

import incidentstate.IncidentClosedState;
import incidentstate.IncidentCrisisState;
import incidentstate.IncidentDetectionAndReportState;
import incidentstate.IncidentState;
import incidentstate.IncidentUnderControlState;
import incidentstate.InvalidStateChangeException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import users.AdministrativeUser;
import users.BasicUser;
import users.ISIRTUser;
import users.InvalidUserException;

public class Incident { 
	
	protected SecurityLabel securityLabel;
	protected IncidentPriority incidentPriority;
	protected IncidentType incidentType;
	protected String title;
	protected Integer referenceNo;
	protected String description;
	protected String systemName;
	protected Date dateTime;
	protected ArrayList<IncidentEntry> incidentEntries;
	protected Boolean isFalsePositive;
	private static Integer refNoCounter = 0;
	private ArrayList<IncidentListener> listners;
	private IncidentState state;
	
		public Incident(SecurityLabel securityLabel,
			IncidentPriority incidentPriority, IncidentType incidentType,
			String title, String description, String systemName) {
		super();
		this.securityLabel = securityLabel;
		this.incidentPriority = incidentPriority;
		this.incidentType = incidentType;
		this.title = title;
		this.referenceNo = refNoCounter++;
		this.description = description;
		this.systemName = systemName;
		this.dateTime = Calendar.getInstance().getTime();
		this.incidentEntries = new ArrayList<IncidentEntry>();
		this.isFalsePositive = false;
		this.state = new IncidentDetectionAndReportState();
		this.listners = new ArrayList<IncidentListener>();
	}
	public SecurityLabel getSecurityLabel() {
		return securityLabel;
	}
	public void setSecurityLabel(SecurityLabel securityLabel) {
		this.securityLabel = securityLabel;
	}
	public IncidentPriority getIncidentPriority() {
		return incidentPriority;
	}
	public void setIncidentPriority(IncidentPriority incidentPriority) {
		this.incidentPriority = incidentPriority;
	}
	public IncidentType getIncidentType() {
		return incidentType;
	}
	public void setIncidentType(IncidentType incidentType) {
		this.incidentType = incidentType;
	}
	public String getTitle() {
		return title;
	}

	public Integer getReferenceNo() {
		return referenceNo;
	}

	public String getDescription() {
		return description;
	}

	public String getSystemName() {
		return systemName;
	}
	
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	
	public Date getDateTime() {
		return dateTime;
	}

	public ArrayList<IncidentEntry> getIncidentEntries() {
		return incidentEntries;
	}

	public Boolean getIsFalsePositive() {
		return isFalsePositive;
	}
	
	public void setIsFalsePositive(Boolean isFalsePositive) throws InvalidStateChangeException {
		this.isFalsePositive = isFalsePositive;
		setIncidentClosed();
	}
	public Boolean getIsOpen() {
		return !(state instanceof IncidentClosedState);
	}
	
	public void setIncidentClosed() throws InvalidStateChangeException{
		state.setClosed(this);
	}
	
	public void doAttach(IncidentListener obs){
		listners.add(obs);
	}
	
	public void doDetach(IncidentListener obs){
		listners.remove(obs);
	}
	
	public void doNotify(){
		for (IncidentListener l : listners){
			l.doUpdate(this, state);
		}
	}
	
	public void setState(IncidentState state){
		this.state = state;
		//notify all listeners of state change
		doNotify();
	}
	
	public void setNextPhase() throws InvalidStateChangeException{
		state.setNextPhase(this);
	}
	
	public Boolean addEntry(IncidentEntry entry){
		return incidentEntries.add(entry);
	}
	
	public void setCrisis(AdministrativeUser user) throws InvalidUserException, InvalidStateChangeException{
		
		if(user != null && user instanceof ISIRTUser){
			try{
				((IncidentUnderControlState) state).setIsCrisis(this);
			}
			catch(ClassCastException  e){
				throw new InvalidStateChangeException(e);
			}
		}
		else{
			throw new InvalidUserException("User " + user.toString() + " does not have correct permissions.");
		}
	}
	
	public void setUnderControl(AdministrativeUser user) throws InvalidUserException, InvalidStateChangeException{
		
		if(user != null && user instanceof ISIRTUser){
			try{
				((IncidentCrisisState) state).setIsUnderControl(this);
			}
			catch(ClassCastException  e){
				throw new InvalidStateChangeException(e);
			}
		}
		else{
			throw new InvalidUserException("User " + user.toString() + " does not have correct permissions.");
		}
	}
	
	public void setReview(BasicUser user) throws InvalidUserException, InvalidStateChangeException{
		
		if(user != null && user instanceof ISIRTUser){
			try{
				((IncidentUnderControlState) state).setNextPhase(this);
			}
			catch(ClassCastException  e){
				throw new InvalidStateChangeException(e);
			}
		}
		else{
			throw new InvalidUserException("User " + user.toString() + " does not have correct permissions.");
		}
	}
}
