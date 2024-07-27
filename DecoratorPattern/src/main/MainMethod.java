package main;

import base.Margerita;
import base.Pizza;
import decorator.CapsicumDecorator;
import decorator.CheeseDecorator;

public class MainMethod {

	public static void main(String[] args) {
		
		Pizza cheeseMargerita= new CheeseDecorator(new Margerita());
		
		System.out.println(cheeseMargerita.cost());
		
		Pizza capsicumCheeseMargerita=new CapsicumDecorator(cheeseMargerita);
		
		System.out.println(capsicumCheeseMargerita.cost());
		
	}

}
