package incidentutility;

import incident.Incident;

public class WriteToFileCommand implements TLWCommand{

	private Incident incident;
	
	public WriteToFileCommand(Incident incident){
		this.incident = incident;
	}
	
	@Override
	public void execute() {
		TransactionLogWriter.doWriteIncidentToFile(incident);
	}
}
