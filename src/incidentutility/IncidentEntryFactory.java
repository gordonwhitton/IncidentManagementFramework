package incidentutility;

import users.AdministrativeUser;
import users.BasicUser;
import users.ISIRTUser;
import users.ManagerUser;
import users.OSGUser;
import incident.Incident;
import incident.IncidentEntry;
import incident.IncidentEntryType;

public class IncidentEntryFactory {
	
	//note the final argument in each method - specific type of user required
	//the factory also links users with incidents - a user making an entry
	//will be linked as a listener to the respective incident.

	public static IncidentEntry createCreateEntry(Incident incident,String title, 
			String text, BasicUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.CREATE, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createDetectionEntry(Incident incident,String title, 
			String text, BasicUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.DETECTION, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createReportingEntry(Incident incident,String title, 
			String text, BasicUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.REPORTING, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createInformationCollectionEntry(Incident incident,String title, 
			String text, OSGUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.INFORMATION_COLLECTION, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createAssessment1Entry(Incident incident,String title, 
			String text, AdministrativeUser user){
		IncidentEntry entry = new IncidentEntry(title, 
				text, IncidentEntryType.ASSESSMENT_1, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createAssessment2Entry(Incident incident,String title, 
			String text, ManagerUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.ASSESSMENT_2, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createImmediateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.IMMEDIATE_RESPONSE, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createLateResponseEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.LATE_RESPONSE, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createForensicAnalysisEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.FORENSIC_ANALYSIS, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createCommunicationsEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.COMMUNICATIONS, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
	
	public static IncidentEntry createReviewEntry(Incident incident,String title, 
			String text, ISIRTUser user){
		IncidentEntry entry = new IncidentEntry(title, text, IncidentEntryType.REVIEW, user.getId());
		incident.addEntry(entry);
		//add user as listener to incident
		incident.doAttach(user);
		return entry;
	}
}
