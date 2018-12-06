package dnd.dice.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dnd.dice.Dice;

class testMultipleDice {

	/**
	 * This test class should test the out put of different Multiple different dice
	 * and insure that they return the expected results
	 */
	@Test
	void testTwoDiceSize2() {
		Dice twoD2 = new Dice(2);
		assertEquals(2, twoD2.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD2.rollDice(2) && twoD2.rollDice(2) <= 4);

		}
	}

	@Test
	void testTwoDiceSize4() {
		Dice twoD4 = new Dice(4);
		assertEquals(4, twoD4.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD4.rollDice(2) && twoD4.rollDice(2) <= 8);

		}
	}

	@Test
	void testTwoDiceSize6() {
		Dice twoD6 = new Dice(6);
		assertEquals(6, twoD6.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD6.rollDice(2) && twoD6.rollDice(2) <= 12);

		}
	}

	@Test
	void testTwoDiceSize8() {
		Dice twoD8 = new Dice(8);
		assertEquals(8, twoD8.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD8.rollDice(2) && twoD8.rollDice(2) <= 16);

		}
	}

	@Test
	void testTwoDiceSize10() {
		Dice twoD10 = new Dice(10);
		assertEquals(10, twoD10.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD10.rollDice(2) && twoD10.rollDice(2) <= 20);

		}
	}

	@Test
	void testTwoDiceSize12() {
		Dice twoD22 = new Dice(12);
		assertEquals(12, twoD22.diceSize());

		for (int count = 0; count < 222000; count++) {
			assertTrue(2 <= twoD22.rollDice(2) && twoD22.rollDice(2) <= 24);

		}
	}

	@Test
	void testTwoDiceSize20() {
		Dice twoD20 = new Dice(20);
		assertEquals(20, twoD20.diceSize());

		for (int count = 0; count < 20000; count++) {
			assertTrue(2 <= twoD20.rollDice(2) && twoD20.rollDice(2) <= 40);

		}
	}
}
