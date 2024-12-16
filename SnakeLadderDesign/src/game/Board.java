package game;

import java.util.HashMap;

public class Board {
	int size;
	HashMap<Integer, Jump> snakes;
	HashMap<Integer, Jump> ladders;

	Board(int n, int noOfSnakes, int noOfLadders) {
		size = n;
		snakes  = new HashMap<>();
		ladders = new HashMap<>();
		addSnakes(noOfSnakes);
		addLadders(noOfLadders);
	}

	private void addSnakes(int noOfSnakes) {

		while (noOfSnakes > 0) {
			int head = 1 + (int) (Math.random() * (size * size * 1.0));
			int tail = 1 + (int) (Math.random() * (size * size * 1.0));

			if (tail >= head || snakes.containsKey(head) || ladders.containsKey(head))
				continue;

			Jump snake = new Jump(head, tail);
			snakes.put(head, snake);
			noOfSnakes--;

		}
	}

	private void addLadders(int noOfLadders) {

		while (noOfLadders > 0) {
			int head = 1 + (int) (Math.random() * (size * size * 1.0));
			int tail = 1 + (int) (Math.random() * (size * size * 1.0));

			if (head >= tail || snakes.containsKey(head) || ladders.containsKey(head))
				continue;

			Jump ladder = new Jump(head, tail);
			ladders.put(head, ladder);
			noOfLadders--;

		}
	}
	
	public int getNewPosition(int prevPosition, int moves) {
		int newPosition = prevPosition+moves;
		
		if(snakes.containsKey(newPosition)) {
			newPosition = snakes.get(newPosition).tail;
			System.out.println("Bitten by Snake, moved from "+prevPosition +" to "+ newPosition);
		} else if(ladders.containsKey(newPosition)) {
			newPosition = ladders.get(newPosition).tail;
			System.out.println("Climbed on Ladder, moved from "+prevPosition +" to "+ newPosition);
		}
		
		return newPosition;
	}

}
