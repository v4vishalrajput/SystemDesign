package vehicle_factorys_factory;

import vehicle_factory.LuxuryVehicleFactory;
import vehicle_factory.OrdinaryVehicleFactory;
import vehicle_factory.VehicleFactory;

public class VehicleFactorysFactory {

	public static VehicleFactory getVehicleFactory(String type) {
		
		switch(type) {
		case "LUXURY":
			return new LuxuryVehicleFactory();
		case "ORDINARY":
			return new OrdinaryVehicleFactory();
		default:
			return null;
		}
	}
	
}
