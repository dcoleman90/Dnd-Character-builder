package equipment.weapon.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import character.abilities.Dexterity;
import character.abilities.Strength;
import equipment.weapon.WeaponGreatclub;

public class TestWeaponGreatClub {
	WeaponGreatclub greatClub = new WeaponGreatclub();
	Strength str = new Strength(20);
	Dexterity dex = new Dexterity(100);

	
	/**
	 * This set of test will insure that the GreatgreatClube returns all the expected
	 * results
	 */
	@Test
	void testGreatgreatClubeDiceSlashAndReach() {
		assertEquals(this.greatClub.isReach(), false);
		assertEquals(this.greatClub.getDiceSize(), 8);
		assertEquals(this.greatClub.getDamageType().getDamageType(), "Damage Bludgeoning ");
		for(int count = 0; count < 10000; count++) {
			assertTrue(1<= this.greatClub.getDamage() && this.greatClub.getDamage() <= 8);
			
		}
	}
	
	@Test
	void testGreatgreatClubeTwoHandedHeavyLightRangeSpecialThrown() {
		assertEquals(this.greatClub.isThrown(), false);
		assertEquals(this.greatClub.isTwoHanded(), true);
		assertEquals(this.greatClub.isHeavyWeapon(), true);
		assertEquals(this.greatClub.isLightWeapon(), false);
		assertEquals(this.greatClub.isRange(), false);
		assertEquals(this.greatClub.isSpecial(), false);
	}
	
	@Test
	void testGreatgreatClubeVersatileFinesseSetBonusDamage() {
		assertEquals(this.greatClub.isVersatile(), false);
		assertEquals(this.greatClub.isFinesse(), false);
		this.greatClub.setDamageBonus(str);
		assertEquals(this.greatClub.getDamageBonus(), 5);
	}
	
	@Test
	void testGreatgreatClubeWithDexBonusShouldReturn0() {
		this.greatClub.setDamageBonus(dex);
		assertEquals(this.greatClub.getDamageBonus(), 0);
		assertEquals(this.greatClub.getWeight(), 10.0, 0.000001);
	}
	
	@Test
	void testGreatgreatClubeIsMartial() {
		assertFalse(this.greatClub.isMartial());
		assertTrue(this.greatClub.isSimple());
	}
	
	

}
