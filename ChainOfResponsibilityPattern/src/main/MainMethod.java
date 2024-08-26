package main;

import abstact.LogProcessor;
import concrete.DebugLogProcessor;
import concrete.ErrorLogProcessor;
import concrete.InfoLogProcessor;

public class MainMethod {

	public static void main(String[] args) {
		
		LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logProcessor.execute("Debug", "Amount credited successfully.");
		
	}
	
}
