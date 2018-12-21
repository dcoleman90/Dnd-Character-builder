package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.background.Background;
import character.background.BackgroundOutlander;
import character.classType.ClassType;
import character.classType.Fighter;
import character.classType.Rogue;
import character.race.Human;
import character.race.Race;
import character.build.Character;

class TestSavingThrowProfiecencies {
	ClassType rogue = new Rogue(1);
	ClassType fighter = new Fighter(1);
	Race human = new Human();
	Background outlander = new BackgroundOutlander();
	Character drew = new Character(rogue, outlander, human);
	Character ali = new Character(fighter, outlander, human);
	
	
	@Test
	void testRogueSavingThrowProfDexAndIntell() {
		assertEquals(2, drew.getDexSavingThrow());
		assertEquals(2, drew.getIntellSavingThrow());
	}
	
	@Test
	void testRogueSavingThrowNotProf() {
		assertEquals(0, drew.getStrSavingThrow());
		assertEquals(0, drew.getWisSavingThrow());
		assertEquals(0, drew.getConSavingThrow());
		assertEquals(0, drew.getCharismaSavingThrow());
	}
	
	@Test
	void testFighterSavingThrowConAndStr() {
		assertEquals(2, ali.getStrSavingThrow());
		assertEquals(2, ali.getConSavingThrow());
	}
	
	@Test
	void testFigherSavingThrowsNotProf() {
		assertEquals(0, ali.getWisSavingThrow());
		assertEquals(0, ali.getDexSavingThrow());
		assertEquals(0, ali.getIntellSavingThrow());
		assertEquals(0, ali.getCharismaSavingThrow());
	}

}
