package builder;

import product.Car;

public class CarBuilder implements Builder{
 
	private Car car;

	public CarBuilder() {
		super();
		this.car = new Car();
	}

	@Override
	public CarBuilder setVendor(String vendor) {
		
		car.setVendor(vendor);
		
		return this;
		
	}

	@Override
	public CarBuilder setSeats(int seats) {
		car.setSeats(seats);
		return this;
		
	}

	@Override
	public CarBuilder setModel(String model) {
		car.setModel(model);
		return this;
	}

	@Override
	public CarBuilder setEngineCapacity(String engineCapacity) {
		car.setEngineCapacity(engineCapacity);
		return this;
	}

	@Override
	public void reset() {
		car=new Car();
		
	}
	
	public CarBuilder setOwner(String name) {
		car.setOwner(name);
		return this;
	}
	
	public Car build() {
		return car;
	}
	
}
