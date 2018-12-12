package character.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Wisdom;

class TestWisdomAbility {

Ability wisdom = new Wisdom();

/**
 * This test will insure that the default ability scores returns 10
 */
@Test
void testAbilityGetScoreWithDefaultScores() {
	assertEquals(this.wisdom.getScore(), 10);
}

/**
 * This test will check the constructor by calling the getScore method
 * All values called will be positive 
 */
@Test
void testAbilitySecondConstructorWithPositiveValues() {
	Ability wisdom1 = new Wisdom(1);
	assertEquals(wisdom1.getScore(), 1);
	Ability wisdom10 = new Wisdom(10);
	assertEquals(wisdom10.getScore(), 10);
	Ability wisdom100 = new Wisdom(100);
	assertEquals(wisdom100.getScore(), 10);
}


/**
 * This test will check the constructor by calling the getScore method
 * All values called will be Negative
 */
@Test
void testAbilitySecondConstructorWithNegativeValues() {
	Ability wisdom6 = new Wisdom(-6);
	assertEquals(wisdom6.getScore(), 10);
	Ability wisdom60 = new Wisdom(-60);
	assertEquals(wisdom60.getScore(), 10);
	Ability wisdom600 = new Wisdom(-600);
	assertEquals(wisdom600.getScore(), 10);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 */
@Test
void testAbilityAddScore() {
	assertEquals(this.wisdom.getScore(), 10);
	this.wisdom.addScore(6);
	assertEquals(this.wisdom.getScore(), 16);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 * Negative values tested
 */
@Test
void testAbilityAddScoreWithNegativeValues() {
	assertEquals(this.wisdom.getScore(), 10);
	this.wisdom.addScore(-15);
	assertEquals(this.wisdom.getScore(), 1);
	
}
}

