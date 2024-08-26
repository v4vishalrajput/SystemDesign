package abstact;

public abstract class LogProcessor {
	
	
	private LogProcessor nextProcessor;
	
	public LogProcessor(LogProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}
	
	public void executeNext(String type, String msg) {
		if(this.nextProcessor!=null) {
			this.nextProcessor.execute(type, msg);
		}
	}
	
	public abstract void execute(String type, String msg);
	

}
