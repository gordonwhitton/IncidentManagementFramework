package ui;

import incident.Incident;
import users.AdministrativeUser;
import users.OSGUser;

public class PerformAssessmentUI {
	
	public static void setAssessment1(OSGUser user, 
			Incident incident, String title, String text){
		new EnterIncidentInfoUI();
		EnterIncidentInfoUI.createAssessment1Entry(incident, title, text, user);
	}
	
	public static void setAssessment2(AdministrativeUser user, 
			Incident incident, String title, String text){
		new EnterIncidentInfoUI();
		EnterIncidentInfoUI.createAssessment1Entry(incident, title, text, user);
	}
}

