package main;

import vehicle.Vehicle;
import vehicle_factory.VehicleFactory;
import vehicle_factorys_factory.VehicleFactorysFactory;

public class MainMethod {

	public static void main(String[] args) {
		VehicleFactory luxuryFactory= VehicleFactorysFactory.getVehicleFactory("LUXURY");
		Vehicle mercedes = luxuryFactory.getVehicle("MERCEDES");
		mercedes.getDescription();
		
		VehicleFactory ordinaryFactory=VehicleFactorysFactory.getVehicleFactory("ORDINARY");
		Vehicle alto = ordinaryFactory.getVehicle("ALTO");
		alto.getDescription();
	}
	
}
