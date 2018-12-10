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
import character.race.WoodElf;
import character.size.Medium;

class TestWoodElf {
	WoodElf me = new WoodElf();
	Ability str = new Strength();
	Ability intell = new Intelligence();
	Ability dex = new Dexterity();
	Ability con = new Constitution();
	Ability wis = new Wisdom();
	Ability charisma = new Charisma();

	@Test
	void testSpecialAbility() {
		assertEquals("Wood Elves live a long time and have keen senses and intuition ", me.specialAbility());
	}

	@Test
	void testGetSize() {
		Medium med = new Medium();
		assertEquals(med.getClass(), me.getSize().getClass());
	}

	@Test
	void testGetSpeedDefault() {
		assertEquals(35, this.me.getSpeed());
	}

	@Test
	void testGetSpeedCustom() {
		me.setSpeed(-1000);
		assertEquals(35, this.me.getSpeed());
		me.setSpeed(55);
		assertEquals(55, this.me.getSpeed());
	}

	@Test
	void testHeightDesc() {
		me.setSizeText("I am 6ft");
		assertEquals("I am 6ft", me.getSize().getHeightDescription());
	}

	@Test
	void testDefaultToString() {
		assertEquals("WoodElf, Speed 35, Between 4 and 7 feet tall ", me.toString());
	}

	@Test
	void testGetAbilityModifier() {
		assertEquals(0, me.abilityScoreAlterations(str));
		assertEquals(0, me.abilityScoreAlterations(charisma));
		assertEquals(1, me.abilityScoreAlterations(wis));
		assertEquals(0, me.abilityScoreAlterations(con));
		assertEquals(2, me.abilityScoreAlterations(dex));
		assertEquals(0, me.abilityScoreAlterations(intell));

	}

}
