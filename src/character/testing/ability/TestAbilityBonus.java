package character.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Strength;
import character.abilities.Wisdom;

class TestAbilityBonus {
	Ability strenght20 = new Strength(20);
	Ability str5 = new Strength(5);
	Ability dex8 = new Dexterity(8);
	Ability conMin5 = new Constitution(-5);
	Ability wis8 = new Wisdom(8);
	
	/**
	 * Test Ability Bonus with common variables 
	 */
	@Test
	void testAbilityBonusStrenght() {
	assertEquals(5, strenght20.getAbilityBonus());	
	assertEquals(-2, str5.getAbilityBonus());
	assertEquals(-1, dex8.getAbilityBonus());
	assertEquals(-7, conMin5.getAbilityBonus());
	assertEquals(-1, wis8.getAbilityBonus());
	}

}
