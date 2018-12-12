package character.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Intelligence;

class TestIntelligenceAbility {

Ability intelligence = new Intelligence();

/**
 * This test will insure that the default ability scores returns 10
 */
@Test
void testAbilityGetScoreWithDefaultScores() {
	assertEquals(this.intelligence.getScore(), 10);
}

/**
 * This test will check the constructor by calling the getScore method
 * All values called will be positive 
 */
@Test
void testAbilitySecondConstructorWithPositiveValues() {
	Ability intelligence1 = new Intelligence(1);
	assertEquals(intelligence1.getScore(), 1);
	Ability intelligence10 = new Intelligence(10);
	assertEquals(intelligence10.getScore(), 10);
	Ability intelligence100 = new Intelligence(100);
	assertEquals(intelligence100.getScore(), 10);
}


/**
 * This test will check the constructor by calling the getScore method
 * All values called will be Negative
 */
@Test
void testAbilitySecondConstructorWithNegativeValues() {
	Ability intelligence9 = new Intelligence(-9);
	assertEquals(intelligence9.getScore(), 10);
	Ability intelligence90 = new Intelligence(-90);
	assertEquals(intelligence90.getScore(), 10);
	Ability intelligence900 = new Intelligence(-900);
	assertEquals(intelligence900.getScore(), 10);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 */
@Test
void testAbilityAddScore() {
	assertEquals(this.intelligence.getScore(), 10);
	this.intelligence.addScore(9);
	assertEquals(this.intelligence.getScore(), 19);
}

/**
 * This test will insure that the addScore method successfully adds the accepted value to the ability score
 * Negative values tested
 */
@Test
void testAbilityAddScoreWithNegativeValues() {
	assertEquals(this.intelligence.getScore(), 10);
	this.intelligence.addScore(-25);
	assertEquals(this.intelligence.getScore(), 1);
	
}
}

