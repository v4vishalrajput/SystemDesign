package decorator;

import base.Pizza;

public class CapsicumDecorator extends ToppingDecorator{

	private Pizza basePizza;
	
	public CapsicumDecorator(Pizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public void discription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+70;
	}

}
