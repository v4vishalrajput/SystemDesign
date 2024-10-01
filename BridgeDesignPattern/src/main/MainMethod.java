package main;

import implementor.LungsBreatheImplementor;
import implementor.SkinBreatheImplementor;
import living_things.Bird;
import living_things.Frog;
import living_things.LivingThing;

public class MainMethod {
	
public static void main(String[] args) {
	LivingThing bird = new Bird(new LungsBreatheImplementor());
	bird.breathe();
	
	LivingThing frog = new Frog(new SkinBreatheImplementor());
	frog.breathe();
}
}
