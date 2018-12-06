package dnd.dice.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dnd.dice.Dice;

class TestDice {

	/**
	 * This test class should test the out put of different dice and insure that
	 * they return the expected results
	 */
	@Test
	void testOneDiceSize2() {
		Dice oneD2 = new Dice(2);
		assertEquals(2, oneD2.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD2.rollDice(1) && oneD2.rollDice(1) <=2);
			
		}
	}
	
	@Test
	void testOneDiceSize4() {
		Dice oneD4 = new Dice(4);
		assertEquals(4, oneD4.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD4.rollDice(1) && oneD4.rollDice(1) <=4);
			
		}
	}

	@Test
	void testOneDiceSize6() {
		Dice oneD6 = new Dice(6);
		assertEquals(6, oneD6.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD6.rollDice(1) && oneD6.rollDice(1) <=6);
			
		}
	}
	
	@Test
	void testOneDiceSize8() {
		Dice oneD8 = new Dice(8);
		assertEquals(8, oneD8.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD8.rollDice(1) && oneD8.rollDice(1) <=8);
			
		}
	}
	
	@Test
	void testOneDiceSize10() {
		Dice oneD10 = new Dice(10);
		assertEquals(10, oneD10.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD10.rollDice(1) && oneD10.rollDice(1) <=10);
			
		}
	}
	
	@Test
	void testOneDiceSize12() {
		Dice oneD12 = new Dice(12);
		assertEquals(12, oneD12.diceSize());
		
		for(int count = 0; count < 112000; count++) {
			assertTrue(1<= oneD12.rollDice(1) && oneD12.rollDice(1) <=12);
			
		}
	}

	@Test
	void testOneDiceSize20() {
		Dice oneD20 = new Dice(20);
		assertEquals(20, oneD20.diceSize());
		
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= oneD20.rollDice(1) && oneD20.rollDice(1) <=20);
			
		}
	}




}
