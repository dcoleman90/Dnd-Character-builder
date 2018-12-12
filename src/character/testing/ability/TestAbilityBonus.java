package character.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;

class TestAbilityBonus {
	Ability strenght20 = new Strength(20);
	Ability str5 = new Strength(5);
	Ability int1 = new Intelligence(1);
	Ability dex8 = new Dexterity(8);
	Ability conMin5 = new Constitution(-5);
	Ability wis8 = new Wisdom(8);
	Ability s1 = new Strength(1);
	Ability s2 = new Strength(2);
	Ability s3 = new Strength(3);
	Ability s4 = new Strength(4);
	Ability s5 = new Strength(5);
	Ability s6 = new Strength(6);
	Ability s7 = new Strength(7);
	Ability s8 = new Strength(8);
	Ability s9 = new Strength(9);
	Ability s10 = new Strength(10);
	Ability s11 = new Strength(11);
	Ability s12 = new Strength(12);
	Ability s13 = new Strength(13);
	Ability s14 = new Strength(14);
	Ability s15 = new Strength(15);
	Ability s16 = new Strength(16);
	Ability s17 = new Strength(17);
	Ability s18 = new Strength(18);
	Ability s19 = new Strength(19);
	Ability s20 = new Strength(20);
	Ability s21 = new Strength(21);
	Ability s22 = new Strength(22);
	Ability s23 = new Strength(23);
	Ability s24 = new Strength(24);
	Ability s25 = new Strength(25);
	Ability s26 = new Strength(26);
	Ability s27 = new Strength(27);
	Ability s28 = new Strength(28);
	Ability s29 = new Strength(29);
	Ability s30 = new Strength(30);
	
	/**
	 * Test Ability Bonus with common variables 
	 */
	@Test
	void testAbilityBonusStrenght() {
	assertEquals(5, strenght20.getAbilityBonus());	
	assertEquals(-3, str5.getAbilityBonus());
	assertEquals(-1, dex8.getAbilityBonus());
	assertEquals(0, conMin5.getAbilityBonus());
	assertEquals(-1, wis8.getAbilityBonus());
	assertEquals(-5, int1.getAbilityBonus());
	}
	
	@Test
	void testAbility1_5() {
		assertEquals(-5, s1.getAbilityBonus());
		assertEquals(-4, s2.getAbilityBonus());
		assertEquals(-4, s3.getAbilityBonus());
		assertEquals(-3, s4.getAbilityBonus());
		assertEquals(-3, s5.getAbilityBonus());
	}
	
	@Test
	void testAbility6_10() {
		assertEquals(-2, s6.getAbilityBonus());
		assertEquals(-2, s7.getAbilityBonus());
		assertEquals(-1, s8.getAbilityBonus());
		assertEquals(-1, s9.getAbilityBonus());
		assertEquals(-0, s10.getAbilityBonus());
	}

	@Test
	void testAbility11_15() {
		assertEquals(0, s11.getAbilityBonus());
		assertEquals(1, s12.getAbilityBonus());
		assertEquals(1, s13.getAbilityBonus());
		assertEquals(2, s14.getAbilityBonus());
		assertEquals(2, s15.getAbilityBonus());
	}
	
	@Test
	void testAbility16_20() {
		assertEquals(3, s16.getAbilityBonus());
		assertEquals(3, s17.getAbilityBonus());
		assertEquals(4, s18.getAbilityBonus());
		assertEquals(4, s19.getAbilityBonus());
		assertEquals(5, s20.getAbilityBonus());
	}
	
	@Test
	void testAbility21_25() {
		assertEquals(5, s21.getAbilityBonus());
		assertEquals(6, s22.getAbilityBonus());
		assertEquals(6, s23.getAbilityBonus());
		assertEquals(7, s24.getAbilityBonus());
		assertEquals(7, s25.getAbilityBonus());
	}
	
	@Test
	void testAbility26_30() {
		assertEquals(8, s26.getAbilityBonus());
		assertEquals(8, s27.getAbilityBonus());
		assertEquals(9, s28.getAbilityBonus());
		assertEquals(9, s29.getAbilityBonus());
		assertEquals(10, s30.getAbilityBonus());
	}
}
