package incidentutility;

import incident.Incident;
import incident.IncidentListener;
import incidentstate.IncidentState;

public class IncidentPhaseChangeListener implements IncidentListener{

	@Override
	public void doUpdate(Incident incident, IncidentState state) {
		//ignore state argument
		TLWCommand writeToFile = new WriteToFileCommand(incident);
		TLWInvoker invoker = TLWInvoker.getInstance();
		invoker.addCommand(writeToFile);
		//command to run at later time
	}

}
