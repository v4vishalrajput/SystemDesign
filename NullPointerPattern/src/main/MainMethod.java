package main;

import factory.VehicleFactory;
import vehicle.Car;
import vehicle.Vehicle;

public class MainMethod {
	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		getVehicleDetails(factory.getVehicle("jkj"));
	}

	public static void getVehicleDetails(Vehicle vehicle) {
		
		System.out.println("Tank Capacity : "+vehicle.getTankCapacity());
		System.out.println("Seat Capacity : "+vehicle.getSeatCapacity());
	}

}
