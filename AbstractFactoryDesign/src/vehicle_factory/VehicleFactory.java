package vehicle_factory;

import vehicle.Vehicle;

public abstract class VehicleFactory {
  
	public abstract Vehicle getVehicle(String name); 
}
