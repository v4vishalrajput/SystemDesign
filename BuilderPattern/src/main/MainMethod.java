package main;

import builder.CarBuilder;
import builder.ManualBuilder;
import director.Director;
import product.Car;
import product.Manual;

public class MainMethod {

	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		CarBuilder carBuilder = new CarBuilder();
		ManualBuilder manualBuilder = new ManualBuilder();
		
		Car car = director.constructCar(carBuilder);
		Manual manual = director.constructManual(manualBuilder);
		
		System.out.println(car);
		System.out.println();
		System.out.println(manual);
		
	}
}
