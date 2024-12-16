package game;

import java.util.Random;

public class Dice {
	int count;
	
	Dice(int n) {
		count = n;
	}
	
	public int rollDice() {
		System.out.println("Rolling dice...");
		int totalSum=0;
        Random random = new Random();
        int min = 1;
        int max = 6;
		for(int i=1;i<=count;i++) {
			totalSum += random.nextInt((max - min) + 1) + min;
		}
		
		System.out.println("got "+totalSum + " on the dice");
		return totalSum;
	}
}
