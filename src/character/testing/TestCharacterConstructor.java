package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import character.background.Background;
import character.background.BackgroundOutlander;
import character.build.Character;
import character.classType.Fighter;
import character.race.Human;
import character.race.Race;

import org.junit.jupiter.api.Test;

class TestCharacterConstructor {
	Race human = new Human();
	Background outlander = new BackgroundOutlander();
	Fighter fighter = new Fighter();
	Character hero = new Character(1, fighter, outlander, human);

	/**
	 * This test will check the default constructor by comparing the toString method
	 * to the hard coded value
	 */
	@Test
	void testDefaultConstructerToString() {
		assertEquals(hero.toString(),
				"Human, Speed 30, Between 4 and 7 feet tall \n11 Strength 11 Dexterity 11 Constitution 11 Intelligence 11 Wisdom 11 Charisma ");
	}

	/**
	 * This test will check the default constructor - the character should return
	 * scores of all 11
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
