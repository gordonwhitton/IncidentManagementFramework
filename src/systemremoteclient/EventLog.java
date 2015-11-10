package systemremoteclient;

public interface EventLog {
	public void doAttach(LogListener obs);
	public void doDetach(LogListener obs);
	public void doNotify();

}
