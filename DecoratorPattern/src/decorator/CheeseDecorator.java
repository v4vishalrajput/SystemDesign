package decorator;

import base.Pizza;

public class CheeseDecorator extends ToppingDecorator{

	private Pizza basePizza;
	
	public CheeseDecorator(Pizza basePizza) {
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
		return basePizza.cost()+50;
	}

}
