package incident;


public enum IncidentType {
	
	MW("Malware"),
	NA("Network Attacks"),
	ID("Information Destruction"),
	CS("Content Security"),
	FF("Facilitiees Faults"),
	DI("Disaster"),
	OT("Others");

    /**
     * @param text
     */
    private IncidentType(final String text) {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() {
        return text;
    }
}