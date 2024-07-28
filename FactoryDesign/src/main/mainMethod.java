package main;

import factory.ShapeFactory;
import product.Shape;

public class mainMethod {
	public static void main(String[] args) {
		
		Shape circle = ShapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape square = ShapeFactory.getShape("SQUARE");
		square.draw();
		
	}
}
