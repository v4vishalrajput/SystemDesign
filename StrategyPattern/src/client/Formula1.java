package client;

import context.Vehicle;
import design.strategy.SportsDriveStrategy;

public class Formula1 extends Vehicle{
 
	public Formula1() {
		super(new SportsDriveStrategy());
	}
}
