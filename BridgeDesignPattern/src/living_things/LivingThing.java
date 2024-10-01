package living_things;

import implementor.BreatheImplementor;

public abstract class LivingThing {
	
	BreatheImplementor breatheImplementor;
	
	public LivingThing(BreatheImplementor breatheImplementor) {
		this.breatheImplementor = breatheImplementor;
	}
	
	public abstract void breathe();

}
