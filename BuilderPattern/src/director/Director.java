package director;

import builder.CarBuilder;
import builder.ManualBuilder;
import product.Car;
import product.Manual;

public class Director {

	public Car constructCar(CarBuilder builder) {
		return builder.setVendor("Tesla").setModel("X").setSeats(4).setOwner("Vishal").setEngineCapacity("800HP").build();
	}
	
	public Manual constructManual(ManualBuilder builder) {
		return builder.setVendor("Tesla").setModel("X").setSeats(4).setEngineCapacity("800HP").build();
	}
	
}
