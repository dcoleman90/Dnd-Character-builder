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

}
