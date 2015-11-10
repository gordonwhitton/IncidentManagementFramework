package systemlocal;

public interface SystemAdapter {
	
	public void doAttach(SystemAdapterListener obs);
	public void doDetach(SystemAdapterListener obs);
	public void doNotify();

}
