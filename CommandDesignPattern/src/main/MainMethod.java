package main;

import appliances.AirConditioner;
import command.TurnOffCommand;
import command.TurnOnCommand;
import remote.Remote;

public class MainMethod {
public static void main(String[] args) {
	AirConditioner ac = new AirConditioner();
	Remote remote = new Remote();
	
	remote.setCommand(new TurnOnCommand(ac));
	remote.pressButton();
	
	remote.setCommand(new TurnOffCommand(ac));
	remote.pressButton();
	
	remote.undo();
	remote.undo();
}
}
