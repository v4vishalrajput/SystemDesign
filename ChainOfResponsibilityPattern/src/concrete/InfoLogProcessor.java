package concrete;

import abstact.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
	
	private final String logType = "INFO";

	public InfoLogProcessor(LogProcessor nextProcessor) {
		// TODO Auto-generated constructor stub
		super(nextProcessor);
	}

	@Override
	public void execute(String type, String msg) {
		// TODO Auto-generated method stub
     if(logType.equalsIgnoreCase(type)) {
    	 System.out.println("INFO: "+ msg);
     }else {
    	 super.executeNext(type, msg);
     }
	}

}
