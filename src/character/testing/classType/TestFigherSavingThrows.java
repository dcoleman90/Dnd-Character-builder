package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.classType.Fighter;

class TestFigherSavingThrows {

	// Abilities
	Strength str = new Strength();
	Dexterity dex = new Dexterity();
	Constitution con = new Constitution();
	Intelligence intell = new Intelligence();
	Wisdom wis = new Wisdom();
	Charisma charima = new Charisma();
	Fighter fight = new Fighter(1);
	
	@Test
	void testSavingThrowsTRUE_Prof() {
		assertTrue(this.fight.isClassSavingThrow(this.con));
		assertTrue(this.fight.isClassSavingThrow(this.str));
	}

	@Test
	void testSavingThrowsFalseProf() {
		assertFalse(this.fight.isClassSavingThrow(this.dex));
		assertFalse(this.fight.isClassSavingThrow(this.intell));
		assertFalse(this.fight.isClassSavingThrow(this.charima));
		assertFalse(this.fight.isClassSavingThrow(this.wis));

	}
}
