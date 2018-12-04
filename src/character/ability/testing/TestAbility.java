package character.ability.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Strength;

class TestAbility {

	Ability strength = new Strength();
	
	/**
	 * This test will insure that the default ability scores returns 10
	 */
	@Test
	void testAbilityGetScoreWithDefaultScores() {
		assertEquals(strength.getScore(), 10);
	}

}
