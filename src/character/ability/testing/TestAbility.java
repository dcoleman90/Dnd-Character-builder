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
		assertEquals(this.strength.getScore(), 10);
	}
	
	/**
	 * This test will check the constructor by calling the getScore method
	 * All values called will be positive 
	 */
	@Test
	void testAbilitySecondConstructorWithPositiveValues() {
		Ability strength2 = new Strength(2);
		assertEquals(strength2.getScore(), 2);
		Ability strength20 = new Strength(20);
		assertEquals(strength20.getScore(), 20);
		Ability strength200 = new Strength(200);
		assertEquals(strength200.getScore(), 200);
	}

	
	/**
	 * This test will check the constructor by calling the getScore method
	 * All values called will be Negative
	 */
	@Test
	void testAbilitySecondConstructorWithNegativeValues() {
		Ability strength7 = new Strength(-7);
		assertEquals(strength7.getScore(), -7);
		Ability strength70 = new Strength(-70);
		assertEquals(strength70.getScore(), -70);
		Ability strength700 = new Strength(-700);
		assertEquals(strength700.getScore(), -700);
	}
	
	/**
	 * This test will insure that the addScore method successfully adds the accepted value to the ability score
	 */
	@Test
	void testAbilityAddScore() {
		assertEquals(this.strength.getScore(), 10);
		this.strength.addScore(5);
		assertEquals(this.strength.getScore(), 15);
	}
	
	/**
	 * This test will insure that the addScore method successfully adds the accepted value to the ability score
	 * Negative values tested
	 */
	@Test
	void testAbilityAddScoreWithNegativeValues() {
		assertEquals(this.strength.getScore(), 10);
		this.strength.addScore(-6);
		assertEquals(this.strength.getScore(), 4);
		
	}
}
