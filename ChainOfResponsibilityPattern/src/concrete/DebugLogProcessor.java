package concrete;

import abstact.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
	
	private final String logType = "DEBUG";

	public DebugLogProcessor(LogProcessor nextProcessor) {
		// TODO Auto-generated constructor stub
		super(nextProcessor);
	}

	@Override
	public void execute(String type, String msg) {
		// TODO Auto-generated method stub
     if(logType.equalsIgnoreCase(type)) {
    	 System.out.println("DEBUG: "+ msg);
     }else {
    	 super.executeNext(type, msg);
     }
	}

}
