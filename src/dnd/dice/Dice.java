package dnd.dice;

import java.util.Random;

public class Dice {
	private int maxSize;
	private Random random;

	public Dice(int diceSize) {
		if (diceSize < 0) {
			this.maxSize = diceSize;
		}
		this.random = new Random();
	}

	public int rollDice(int numberOfDiceRolled) {
		int amountRolled;
		amountRolled = (this.random.nextInt(this.maxSize) +1) * numberOfDiceRolled;
		return amountRolled;
	}
}
