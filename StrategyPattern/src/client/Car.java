package client;

import context.Vehicle;
import design.strategy.ClassicDriveStrategy;

public class Car extends Vehicle{
  public Car() {
	  super(new ClassicDriveStrategy());
  }
}
