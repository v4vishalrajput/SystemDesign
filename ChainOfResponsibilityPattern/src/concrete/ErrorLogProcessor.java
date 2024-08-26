package concrete;

import abstact.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
	
	private final String logType = "ERROR";

	public ErrorLogProcessor(LogProcessor nextProcessor) {
		// TODO Auto-generated constructor stub
		super(nextProcessor);
	}

	@Override
	public void execute(String type, String msg) {
		// TODO Auto-generated method stub
     if(logType.equalsIgnoreCase(type)) {
    	 System.out.println("ERROR: "+ msg);
     }else {
    	 super.executeNext(type, msg);
     }
	}

}