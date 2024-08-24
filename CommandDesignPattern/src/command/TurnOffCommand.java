package command;

import appliances.AirConditioner;

public class TurnOffCommand implements Command {

	
	private AirConditioner ac;
	
	public TurnOffCommand(AirConditioner ac) {
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.turnOff();
		
	}

	

}
