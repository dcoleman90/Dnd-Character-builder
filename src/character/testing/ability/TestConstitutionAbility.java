package character.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Constitution;

class TestConstitutionAbility {

Ability constitution = new Constitution();

/**
 * This test will insure that the default ability scores returns 10
 */
@Test
void testAbilityGetScoreWithDefaultScores() {
	assertEquals(this.constitution.getScore(), 10);
}

/**
 * This test will check the constructor by calling the getScore method
 * All values called will be positive 
 */
@Test
void testAbilitySecondConstructorWithPositiveValues() {
	Ability constitution1 = new Constitution(1);
	assertEquals(constitution1.getScore(), 1);
	Ability constitution10 = new Constitution(10);
	assertEquals(constitution10.getScore(), 10);
	Ability constitution100 = new Constitution(100);
	assertEquals(constitution100.getScore(), 10);
}


/**
 * This test will check the constructor by calling the getScore method
 * All values called will be Negative
 */
@Test
void testAbilitySecondConstructorWithNegativeValues() {
	Ability constitution6 = new Constitution(-6);
	assertEquals(constitution6.getScore(), 10);
	Ability constitution60 = new Constitution(-60);
	assertEquals(constitution60.getScore(), 10);
	Ability constitution600 = new Constitution(-60);
	assertEquals(constitution600.getScore(), 10);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 */
@Test
void testAbilityAddScore() {
	assertEquals(this.constitution.getScore(), 10);
	this.constitution.addScore(6);
	assertEquals(this.constitution.getScore(), 16);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 * Negative values tested
 */
@Test
void testAbilityAddScoreWithNegativeValues() {
	assertEquals(this.constitution.getScore(), 10);
	this.constitution.addScore(-15);
	assertEquals(this.constitution.getScore(), 1);
	
}
}

