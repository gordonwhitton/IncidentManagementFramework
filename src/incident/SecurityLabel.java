package incident;

public enum SecurityLabel {
	TOP_SECRET("Top Secret"),
	SECRET("Secret"),
	CONFIDENTIAL("Confidential"),
	RESTRICTED("Restricted"),
	UNCLASSIFIED("Unclassified");

    /**
     * @param text
     */
    private SecurityLabel(final String text) {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() {
        return text;
    }
}
