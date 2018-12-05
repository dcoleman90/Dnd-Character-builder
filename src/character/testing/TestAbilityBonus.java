package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.build.AbilityBonus;

class TestAbilityBonus {
	AbilityBonus ab = new AbilityBonus();
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
	assertEquals(5, ab.returnBonus(strenght20));	
	assertEquals(-2, ab.returnBonus(str5));
	assertEquals(-1, ab.returnBonus(dex8));
	assertEquals(-7, ab.returnBonus(conMin5));
	assertEquals(-1, ab.returnBonus(wis8));
	}

}
