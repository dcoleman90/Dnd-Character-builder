package character.testing.race;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.background.Background;
import character.background.BackgroundOutlander;
import character.classType.ClassType;
import character.classType.Rogue;
import character.race.Human;
import character.race.WoodElf;
import character.build.Character;

class TestRaceSetRace {
	Human human = new Human();
	WoodElf woodelf = new WoodElf();
	ClassType rogue = new Rogue();
	Background outlander = new BackgroundOutlander();
	
	Ability str = new Strength();
	Ability intell = new Intelligence();
	Ability dex = new Dexterity();
	Ability con = new Constitution();
	Ability wis = new Wisdom();
	Ability charisma = new Charisma();

	
	/**
	 * This method insures that all the ability scores are reset whenever a different race is constructed
	 */
	@Test
	void testSetRaceHumanToWoodElf() {
		Character ted = new Character(1, this.rogue, this.outlander, this.human);
		
		assertEquals(11, ted.getStrScore());
		assertEquals(11, ted.getCharismaScore());
		assertEquals(11, ted.getWisScore());
		assertEquals(11, ted.getConScore());
		assertEquals(11, ted.getDexScore());
		assertEquals(11, ted.getIntellScore());
		
		ted.setRace(woodelf);

		assertEquals(10, ted.getStrScore());
		assertEquals(10, ted.getCharismaScore());
		assertEquals(11, ted.getWisScore());
		assertEquals(10, ted.getConScore());
		assertEquals(12, ted.getDexScore());
		assertEquals(10, ted.getIntellScore());
	}

}
