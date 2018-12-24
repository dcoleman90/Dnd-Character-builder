package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.ArmorPadded;

class TestPaddedArmor {
	private ArmorPadded padded;

	public void setup() {
		this.padded = new ArmorPadded();
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup();
		assertEquals(this.padded.getArmorClass(), 11);
	}

	/**
	 * Till a more elegant solution is found - too tired to figure it out now - the
	 * max dex bonus is 1000
	 */
	@Test
	void testMaxDexModifer() {
		this.setup();
		assertEquals(1000, this.padded.getMaxDexBonus());
	}

	@Test
	void testMaxDexModiferBoolean() {
		this.setup();
		assertEquals(false, this.padded.isMaxDexBonus());
	}

	@Test
	void testWeightShouldReturn8_0() {
		this.setup();
		assertEquals(this.padded.getWeight(), 8.0, 0.000001);
	}

	@Test
	void testIsSpecial() {
		this.setup();
		assertEquals(false, this.padded.isSpecial());
	}

	@Test
	void testIsStealthDisadvantage() {
		this.setup();
		assertEquals(true, this.padded.isStealthDisadvantage());
	}

	@Test
	void testStrengthRequirement() {
		this.setup();
		assertEquals(0, this.padded.getStrengthScoreRequirement());
	}

	@Test
	void testArmorName() {
		this.setup();
		assertEquals("Padded Armor ", this.padded.getName());
	}

	@Test
	void testArmorCost() {
		this.setup();
		assertEquals("5 Gold Pieces ", this.padded.getCost());
	}

	@Test
	void testIsLightArmor() {
		this.setup();
		assertEquals(true, this.padded.isLightArmor());
	}

	@Test
	void testIsMediumArmor() {
		this.setup();
		assertEquals(false, this.padded.isMediumArmor());
	}

	@Test
	void testIsHeavyArmor() {
		this.setup();
		assertEquals(false, this.padded.isHeavyArmor());
	}

}
