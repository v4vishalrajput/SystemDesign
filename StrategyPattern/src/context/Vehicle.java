package context;

import design.strategy.DriveStrategy;

public class Vehicle {

	private DriveStrategy strategy;
	
	public Vehicle(DriveStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void drive() {
		strategy.drive();
	}
	
}
