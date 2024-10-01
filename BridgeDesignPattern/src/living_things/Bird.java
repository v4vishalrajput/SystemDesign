package living_things;

import implementor.BreatheImplementor;

public class Bird extends LivingThing {

	public Bird(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		super.breatheImplementor.breatheProcess();
	}

}
