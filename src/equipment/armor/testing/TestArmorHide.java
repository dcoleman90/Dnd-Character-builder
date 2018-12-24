package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.ArmorHide;

class TestArmorHide {
	private ArmorHide hide;

	public void setup(int dexMod) {
		this.hide = new ArmorHide(dexMod);
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup(5);
		assertEquals(this.hide.getArmorClass(), 14);
	}

	@Test
	void testStandardSetupWithADexBonusOf3() {
		this.setup(3);
		assertEquals(this.hide.getArmorClass(), 14);
	}

	@Test
	void testStandardSetupWithADexBonusOf1() {
		this.setup(1);
		assertEquals(this.hide.getArmorClass(), 13);
	}

	@Test
	void testWeightShouldReturn8_0() {
		this.setup(0);
		assertEquals(this.hide.getWeight(), 12.0, 0.000001);
	}
	
	@Test
	void testIsSpecial() {
		this.setup(0);
		assertEquals(false, this.hide.isSpecial());
	}
	
	@Test
	void testIsStealthDisadvantage() {
		this.setup(0);
		assertEquals(false, this.hide.isStealthDisadvantage());
	}
	
	@Test
	void testGetDexModShouldBeSameAsSetUpInt() {
		this.setup(1);
		assertEquals(1, this.hide.getDexMod());
	}
	
	@Test
	void testStrengthRequirement() {
		this.setup(1);
		assertEquals(0, this.hide.getStrengthScoreRequirement());
	}
	
	@Test
	void testArmorName() {
		this.setup(1);
		assertEquals("Hide Armor ", this.hide.getName());
	}
	
	@Test
	void testArmorCost() {
		this.setup(1);
		assertEquals("10 Gold Pieces ", this.hide.getCost());
	}

	@Test
	void testIsLightArmor() {
		this.setup(1);
		assertEquals(false, this.hide.isLightArmor());
	}
	
	@Test
	void testIsMediumArmor() {
		this.setup(1);
		assertEquals(true, this.hide.isMediumArmor());
	}
	
	@Test
	void testIsHeavyArmor() {
		this.setup(1);
		assertEquals(false, this.hide.isHeavyArmor());
	}
	
}
