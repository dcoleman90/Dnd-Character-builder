package character.testing.equipment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Dexterity;
import character.abilities.Strength;
import character.equipment.WeaponGreatAxe;

class TestWeaponGreatAxe {
	WeaponGreatAxe ax = new WeaponGreatAxe();
	Strength str = new Strength(20);
	Dexterity dex = new Dexterity(100);

	
	/**
	 * This set of test will insure that the GreatAxe returns all the expected
	 * results
	 */
	@Test
	void testGreatAxeDiceSlashAndReach() {
		assertEquals(this.ax.isReach(), false);
		assertEquals(this.ax.getDiceSize(), 12);
		assertEquals(this.ax.getDamageType().getDamageType(), "Damage Slashing ");
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= this.ax.getDamage() && this.ax.getDamage() <= 12);
			
		}
	}
	
	@Test
	void testGreatAxeTwoHandedHeavyLightRangeSpecialThrown() {
		assertEquals(this.ax.isThrown(), false);
		assertEquals(this.ax.isTwoHanded(), true);
		assertEquals(this.ax.isHeavy(), true);
		assertEquals(this.ax.isLight(), false);
		assertEquals(this.ax.isRange(), false);
		assertEquals(this.ax.isSpecial(), false);
	}
	
	@Test
	void testGreatAxeVersatileFinesseSetBonusDamage() {
		assertEquals(this.ax.isVersatile(), false);
		assertEquals(this.ax.isFinesse(), false);
		this.ax.setDamageBonus(str);
		assertEquals(this.ax.getDamageBonus(), 5);
	}
	
	@Test
	void testGreatAxeWithDexBonusShouldReturn0() {
		this.ax.setDamageBonus(dex);
		assertEquals(this.ax.getDamageBonus(), 0);
		assertEquals(this.ax.getWeight(), 7.0, 0.000001);
	}
	
	

}
