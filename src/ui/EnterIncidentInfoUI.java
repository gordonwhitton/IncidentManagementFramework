package ui;

import users.AdministrativeUser;
import users.BasicUser;
import users.ISIRTUser;
import users.ManagerUser;
import users.OSGUser;
import incident.Incident;
import incident.IncidentEntry;
import incidentutility.IncidentEntryFactory;

public class EnterIncidentInfoUI {
	public static IncidentEntry createCreateEntry(Incident incident,
			String title, String text, BasicUser user){
		return IncidentEntryFactory.createCreateEntry(incident, 
				title, text, user);
	}

	public static IncidentEntry createDetectionEntry(Incident incident,
			String title, String text, BasicUser user){
		return IncidentEntryFactory.createDetectionEntry(incident, 
				title, text, user);
	}
	
	public static IncidentEntry createReportingEntry(Incident incident,
			String title, String text, BasicUser user){
		return IncidentEntryFactory.createReportingEntry(incident, 
				title, text, user);
	}
	
	public static IncidentEntry createInformationCollectionEntry(Incident incident,
			String title, String text, OSGUser user){
		return IncidentEntryFactory.createInformationCollectionEntry(incident, 
				title, text, user);
	}
	
	public static IncidentEntry createAssessment1Entry(Incident incident,
			String title, String text, AdministrativeUser user){
		return IncidentEntryFactory.createAssessment1Entry(incident, 
				title, text, user);
	}
	
	public static IncidentEntry createAssessment2Entry(Incident incident,String title, 
			String text, ManagerUser user){
		return IncidentEntryFactory.createAssessment2Entry(incident, title, text, user);
	}
	
	public static IncidentEntry createImmediateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return IncidentEntryFactory.createImmediateResponseEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createLateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return IncidentEntryFactory.createLateResponseEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createForensicAnalysisEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return IncidentEntryFactory.createForensicAnalysisEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createCommunicationsEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return IncidentEntryFactory.createCommunicationsEntry(incident, title, text, user);
	}
	
	public static IncidentEntry createReviewEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		return IncidentEntryFactory.createReviewEntry(incident, title, text, user);
	}
}
