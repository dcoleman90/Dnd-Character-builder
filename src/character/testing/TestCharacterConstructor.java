package character.testing;

import static org.junit.jupiter.api.Assertions.*;
import character.build.Character;

import org.junit.jupiter.api.Test;

class TestCharacterConstructor {
	Character hero = new Character();
	
	/**
	 * This test will check the default constructor by comparing the toString method to the hard coded value
	 */
	@Test
	void testDefaultConstructerToString() {
		assertEquals(hero.toString(), "11 Strength 11 Dexterity 11 Constitution 11 Intelligence 11 Wisdom 11 Charisma ");
	}
	
	/**
	 * This test will check the default constructor - the character should return scores of all 11
	 */
	@Test
	void testDefaultConstructerByCallingGettersAll11() {
		assertEquals(hero.getCharismaScore(), 11);
		assertEquals(hero.getConScore(), 11);
		assertEquals(hero.getDexScore(), 11);
		assertEquals(hero.getStrScore(), 11);
		assertEquals(hero.getIntellScore(), 11);
		assertEquals(hero.getWisScore(), 11);
	}

}
