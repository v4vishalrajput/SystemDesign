package vehicle_factory;

import vehicle.Audi;
import vehicle.Mercedes;
import vehicle.Vehicle;

public class LuxuryVehicleFactory extends VehicleFactory{

	@Override
	public Vehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		switch(name) {
		case "MERCEDES":
			return new Mercedes();
		case "AUDI":
			return new Audi();
		default:
			return null;
		}
	}

}
