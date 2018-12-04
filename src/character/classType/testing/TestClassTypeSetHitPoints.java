package character.classType.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.classType.ClassType;
import character.classType.Fighter;

class TestClassTypeSetHitPoints {

	/**
	 * This method will test the ClassType method SetHitPoints with a level one fighter
	 */
	@Test
	void testSetHitPointsWithLevelOneFighterWithOneCon() {
		Fighter fighter = new Fighter();
		fighter.setHitPoints(1, 1);
		assertEquals(fighter.getHitPoints(), 11);
	}
	
	/**
	 * This method will test 10000 fighter creation attempts to insure the hitpoints fall in the expected range
	 */
	@Test
	void testSetHitPointsWithLevel2FighterWith1Con() {
		for(int count = 0; count < 10000; count++) {
			Fighter fighter = new Fighter();
			fighter.setHitPoints(2, 1);
			assertTrue(13 <= fighter.getHitPoints() && fighter.getHitPoints() <= 22);
		}
	}
	
	/**
	 * This method will test 10000 fighter creation attempts to insure the hitpoints fall in the expected range
	 */
	@Test
	void testSetHitPointsWithLevel2FighterWith5Con() {
		for(int count = 0; count < 10000; count++) {
			Fighter fighter = new Fighter();
			fighter.setHitPoints(2, 5);
			assertTrue(21 <= fighter.getHitPoints() && fighter.getHitPoints() <= 30);
		}
	}
	/**
	 * This method will test 10000 fighter creation attempts to insure the hitpoints fall in the expected range
	 */
	@Test
	void testSetHitPointsWithLevel5FighterWith1Con() {
		for(int count = 0; count < 10000; count++) {
			Fighter fighter = new Fighter();
			fighter.setHitPoints(5, 1);
			assertTrue(19 <= fighter.getHitPoints() && fighter.getHitPoints() <= 55);
		}
	}
	
}
