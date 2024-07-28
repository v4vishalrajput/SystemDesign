package factory;

import product.Circle;
import product.Shape;
import product.Square;

public class ShapeFactory {

	public static Shape getShape(String input) {
		
		switch(input) {
		
		case "CIRCLE":
			return new Circle();
		case "SQUARE":
			return new Square();
		default:
			return null;
		
		}
		
	}
	
}
