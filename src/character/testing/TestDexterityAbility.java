package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Dexterity;

class TestDexterityAbility {

Ability dexterity = new Dexterity();

/**
 * This test will insure that the default ability scores returns 10
 */
@Test
void testAbilityGetScoreWithDefaultScores() {
	assertEquals(this.dexterity.getScore(), 10);
}

/**
 * This test will check the constructor by calling the getScore method
 * All values called will be positive 
 */
@Test
void testAbilitySecondConstructorWithPositiveValues() {
	Ability dexterity3 = new Dexterity(3);
	assertEquals(dexterity3.getScore(), 3);
	Ability dexterity30 = new Dexterity(30);
	assertEquals(dexterity30.getScore(), 30);
	Ability dexterity300 = new Dexterity(300);
	assertEquals(dexterity300.getScore(), 300);
}


/**
 * This test will check the constructor by calling the getScore method
 * All values called will be Negative
 */
@Test
void testAbilitySecondConstructorWithNegativeValues() {
	Ability dexterity5 = new Dexterity(-5);
	assertEquals(dexterity5.getScore(), -5);
	Ability dexterity50 = new Dexterity(-50);
	assertEquals(dexterity50.getScore(), -50);
	Ability dexterity500 = new Dexterity(-500);
	assertEquals(dexterity500.getScore(), -500);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 */
@Test
void testAbilityAddScore() {
	assertEquals(this.dexterity.getScore(), 10);
	this.dexterity.addScore(5);
	assertEquals(this.dexterity.getScore(), 15);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 * Negative values tested
 */
@Test
void testAbilityAddScoreWithNegativeValues() {
	assertEquals(this.dexterity.getScore(), 10);
	this.dexterity.addScore(-6);
	assertEquals(this.dexterity.getScore(), 4);
	
}
}

