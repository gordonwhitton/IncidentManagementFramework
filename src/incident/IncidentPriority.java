package incident;

public enum IncidentPriority {
	HIGH("High"),
	MEDIUM("Medium"),
	LOW("Low");

    /**
     * @param text
     */
    private IncidentPriority(final String text) {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() {
        return text;
    }
}
