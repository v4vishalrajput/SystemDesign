package main;

import client.Car;
import client.Formula1;
import context.Vehicle;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Vehicle car=new Car();
		Vehicle f1=new Formula1();
		
		car.drive();
		f1.drive();
			
	}

}
