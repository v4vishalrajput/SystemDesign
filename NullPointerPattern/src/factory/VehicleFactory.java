package factory;

import vehicle.Car;
import vehicle.NullObject;
import vehicle.Vehicle;

public class VehicleFactory {

	
	public Vehicle getVehicle(String vehicle) {
		
		if("CAR".equalsIgnoreCase(vehicle)) {
			return new Car();
		}else {
			return new NullObject();
		}
	}
	
}
