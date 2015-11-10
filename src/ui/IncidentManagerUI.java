package ui;

import java.util.ArrayList;

import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentType;
import incident.SecurityLabel;
import incidentstate.InvalidStateChangeException;
import users.AdministrativeUser;
import users.BasicUser;
import users.ISIRTUser;
import users.InvalidUserException;
import users.ManagerUser;
import users.OSGUser;
import users.UserPasswordHash;

public class IncidentManagerUI {
	
	public static Boolean closeIncident(Incident incident) throws InvalidStateChangeException{
		return CloseIncidentUI.setIncidentClosed(incident);
	}
	
	public static Incident createNewHighPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return CreateNewIncidentUI.createNewHighPriorityIncident(securityLabel, incidentType, title, description, systemName);
	}
	
	public static Incident createNewMediumPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return CreateNewIncidentUI.createNewMediumPriorityIncident(securityLabel, incidentType, title, description, systemName);
	}
	
	public static Incident createNewLowPriorityIncident(SecurityLabel securityLabel, IncidentType incidentType,
			String title, String description, String systemName){
				return CreateNewIncidentUI.createNewLowPriorityIncident(securityLabel, incidentType, title, description, systemName);
	}

	public static IncidentEntry createCreateEntry(Incident incident,String title, 
			String text, BasicUser user){
		return EnterIncidentInfoUI.createCreateEntry(incident, title, text, user);
	}

	public static IncidentEntry createDetectionEntry(Incident incident,String title, 
			String text, BasicUser user){
		return EnterIncidentInfoUI.createDetectionEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createReportingEntry(Incident incident,String title, 
			String text, BasicUser user){
		return EnterIncidentInfoUI.createReportingEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createInformationCollectionEntry(Incident incident,String title, 
			String text, OSGUser user){
		return EnterIncidentInfoUI.createInformationCollectionEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createAssessment1Entry(Incident incident,String title, 
			String text, OSGUser user){
		return EnterIncidentInfoUI.createAssessment1Entry(incident, title, text, user);
	}
	
	public static IncidentEntry createAssessment2Entry(Incident incident,String title, 
			String text, ManagerUser user){
		return EnterIncidentInfoUI.createAssessment2Entry(incident, title, text, user);
	}
	
	public static IncidentEntry createImmediateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return EnterIncidentInfoUI.createImmediateResponseEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createLateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return EnterIncidentInfoUI.createLateResponseEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createForensicAnalysisEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return EnterIncidentInfoUI.createForensicAnalysisEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createCommunicationsEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return EnterIncidentInfoUI.createCommunicationsEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createReviewEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return EnterIncidentInfoUI.createReviewEntry(incident, title, text, user);
	}

	public static Boolean linkTwoIncidents(BasicUser user, Incident incident1, Incident incident2) throws InvalidUserException{
		return LinkTwoIncidentsUI.addIncidentLink(user, incident1, incident2);
	}
	
	public static void performAssessment1(OSGUser user, Incident incident, String title, String text){
		PerformAssessmentUI.setAssessment1(user, incident, title, text);
	}
	
	public static void performAssessment2(OSGUser user, Incident incident, String title, String text){
		PerformAssessmentUI.setAssessment2(user, incident, title, text);
	}
	
	public static ArrayList<Incident> readClosedIncidents(){
		return ReadClosedIncidentsUI.getClosedIncidents();
	}
	
	public static ArrayList<Incident> readIncidentsInDateOrder(){
		return ReadIncidentsInDateOrderUI.getDateOrderIncidents();
	}
	
	public static ArrayList<Incident> readIncidentsInPriorityOrder(){
		return ReadIncidentsInPriorityOrderUI.getOpenIncidents();
	}
	
	public static ArrayList<Incident> readOpenIncidents(){
		return ReadOpenIncidentsUI.getOpenIncidents();
	}
	
	public static void sendForReview(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		SendForReviewUI.setReview(user, incident);
	}
	
	public static void setCrisis(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		SetCrisisUI.setCrisis(user, incident);
	}
	
	public static Boolean setNextPhase(Incident incident, BasicUser user){
		return SetNextPhaseUI.setNextPhase(incident, user);
	}
	
	public static void setUnderControl(AdministrativeUser user, Incident incident) throws InvalidUserException, InvalidStateChangeException{
		SetUnderControlUI.setUnderControl(user, incident);
	}
	
	public static Boolean userLogOn(BasicUser user, UserPasswordHash passwordHash){
		return UserLogOnUI.doUserLogOn(user, passwordHash);
	}
}
