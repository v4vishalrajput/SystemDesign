package command;

import appliances.AirConditioner;

public class TurnOnCommand implements Command{
 private AirConditioner ac;
 
 public TurnOnCommand(AirConditioner ac) {
	 this.ac = ac;
 }

@Override
public void execute() {
	// TODO Auto-generated method stub
	ac.turnOn();
}
 
 
 
}
