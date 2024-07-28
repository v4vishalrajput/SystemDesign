package vehicle_factory;

import vehicle.Alto;
import vehicle.Audi;
import vehicle.Mercedes;
import vehicle.Swift;
import vehicle.Vehicle;

public class OrdinaryVehicleFactory extends VehicleFactory {

	
	public Vehicle getVehicle(String name) {
		// TODO Auto-generated method stub
		switch(name) {
		case "ALTO":
			return new Alto();
		case "SWIFT":
			return new Swift();
		default:
			return null;
		}
	}
	
}
