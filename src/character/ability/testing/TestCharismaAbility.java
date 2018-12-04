package character.ability.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Charisma;

class TestCharismaAbility {

Ability charisma = new Charisma();

/**
 * This test will insure that the default ability scores returns 12
 */
@Test
void testAbilityGetScoreWithDefaultScores() {
	assertEquals(this.charisma.getScore(), 10);
}

/**
 * This test will check the constructor by calling the getScore method
 * All values called will be positive 
 */
@Test
void testAbilitySecondConstructorWithPositiveValues() {
	Ability charisma1 = new Charisma(1);
	assertEquals(charisma1.getScore(), 1);
	Ability charisma12 = new Charisma(12);
	assertEquals(charisma12.getScore(), 12);
	Ability charisma122 = new Charisma(122);
	assertEquals(charisma122.getScore(), 122);
}


/**
 * This test will check the constructor by calling the getScore method
 * All values called will be Negative
 */
@Test
void testAbilitySecondConstructorWithNegativeValues() {
	Ability charisma6 = new Charisma(-6);
	assertEquals(charisma6.getScore(), -6);
	Ability charisma62 = new Charisma(-62);
	assertEquals(charisma62.getScore(), -62);
	Ability charisma622 = new Charisma(-622);
	assertEquals(charisma622.getScore(), -622);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 */
@Test
void testAbilityAddScore() {
	assertEquals(this.charisma.getScore(), 10);
	this.charisma.addScore(6);
	assertEquals(this.charisma.getScore(), 16);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 * Negative values tested
 */
@Test
void testAbilityAddScoreWithNegativeValues() {
	assertEquals(this.charisma.getScore(), 10);
	this.charisma.addScore(-15);
	assertEquals(this.charisma.getScore(), -5);
	
}
}

