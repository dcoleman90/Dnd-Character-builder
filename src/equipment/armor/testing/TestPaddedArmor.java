package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.ArmorPadded;


class TestPaddedArmor {
	private ArmorPadded padded;

	public void setup(int dexMod) {
		this.padded = new ArmorPadded(dexMod);
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup(5);
		assertEquals(this.padded.getArmorClass(), 16);
	}

	@Test
	void testStandardSetupWithADexBonusOf3() {
		this.setup(3);
		assertEquals(this.padded.getArmorClass(), 14);
	}

	@Test
	void testStandardSetupWithADexBonusOf1() {
		this.setup(1);
		assertEquals(this.padded.getArmorClass(), 12);
	}

	@Test
	void testWeightShouldReturn8_0() {
		this.setup(0);
		assertEquals(this.padded.getWeight(), 8.0, 0.000001);
	}
	
	@Test
	void testIsSpecial() {
		this.setup(0);
		assertEquals(false, this.padded.isSpecial());
		assertEquals(true, this.padded.isStealthDisadvantage());
	}
	
	@Test
	void testIsStealthDisadvantage() {
		this.setup(0);
		assertEquals(true, this.padded.isStealthDisadvantage());
	}
	
	@Test
	void testGetDexModShouldBeSameAsSetUpInt() {
		this.setup(1);
		assertEquals(1, this.padded.getDexMod());
	}
	
	@Test
	void testStrengthRequirement() {
		this.setup(1);
		assertEquals(0, this.padded.getStrengthScoreRequirement());
	}
	
	@Test
	void testArmorName() {
		this.setup(1);
		assertEquals("Padded Armor ", this.padded.getName());
	}
	
	@Test
	void testArmorCost() {
		this.setup(1);
		assertEquals("5 Gold pieces ", this.padded.getCost());
	}

}
