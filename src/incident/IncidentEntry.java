package incident;

import java.util.Calendar;
import java.util.Date;

public class IncidentEntry {
	

	private String title;
	private Integer referenceNo;
	private Date dateTime;
	private String text;
	private IncidentEntryType type;
	private Integer userID;
	
	private static Integer refNoCounter = 0;
	
	
	public IncidentEntry(String title, String text, 
			IncidentEntryType type, Integer userID) {
		super();
		this.title = title;
		this.referenceNo = refNoCounter++;
		this.dateTime = Calendar.getInstance().getTime();
		this.text = text;
		this.type = type;
		this.userID = userID;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the referenceNo
	 */
	public Integer getReferenceNo() {
		return referenceNo;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the type
	 */
	public IncidentEntryType getType() {
		return type;
	}

	/**
	 * @return the userID
	 */
	public Integer getUserID() {
		return userID;
	}

}
