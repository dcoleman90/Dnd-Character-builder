package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.ArmorHide;

class TestArmorHide {
	private ArmorHide hide;

	public void setup() {
		this.hide = new ArmorHide();
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup();
		assertEquals(this.hide.getArmorClass(), 12);
	}

	@Test
	void testMaxDexModifer() {
		this.setup();
		assertEquals(2, this.hide.getMaxDexBonus());
	}
	
	@Test
	void testMaxDexModiferBoolean() {
		this.setup();
		assertEquals(true, this.hide.isMaxDexBonus());
	}
	
	@Test
	void testWeightShouldReturn12_0() {
		this.setup();
		assertEquals(this.hide.getWeight(), 12.0, 0.000001);
	}
	
	@Test
	void testIsSpecial() {
		this.setup();
		assertEquals(false, this.hide.isSpecial());
	}
	
	@Test
	void testIsStealthDisadvantage() {
		this.setup();
		assertEquals(false, this.hide.isStealthDisadvantage());
	}
	
		
	@Test
	void testStrengthRequirement() {
		this.setup();
		assertEquals(0, this.hide.getStrengthScoreRequirement());
	}
	
	@Test
	void testArmorName() {
		this.setup();
		assertEquals("Hide Armor ", this.hide.getName());
	}
	
	@Test
	void testArmorCost() {
		this.setup();
		assertEquals("10 Gold Pieces ", this.hide.getCost());
	}

	@Test
	void testIsLightArmor() {
		this.setup();
		assertEquals(false, this.hide.isLightArmor());
	}
	
	@Test
	void testIsMediumArmor() {
		this.setup();
		assertEquals(true, this.hide.isMediumArmor());
	}
	
	@Test
	void testIsHeavyArmor() {
		this.setup();
		assertEquals(false, this.hide.isHeavyArmor());
	}
	
}
