package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.UnArmored;

class TestUnArmored {
	private UnArmored unsafeAdventuring;
	
	public void setup() {
		this.unsafeAdventuring = new UnArmored();
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup();
		assertEquals(this.unsafeAdventuring.getArmorClass(), 10);
	}
	
	/**
	 * Till a more elegant solution is found - too tired to figure it out now - the
	 * max dex bonus is 1000
	 */
	@Test
	void testMaxDexModifer() {
		this.setup();
		assertEquals(1000, this.unsafeAdventuring.isThereMaxDexBonus());
	}

	@Test
	void testMaxDexModiferBoolean() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isMaxDexBonus());
	}


	@Test
	void testWeightShouldReturn8_0() {
		this.setup();
		assertEquals(this.unsafeAdventuring.getWeight(), 0.0, 0.000001);
	}
	
	@Test
	void testIsSpecial() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isSpecial());
	}
	
	@Test
	void testIsStealthDisadvantage() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isStealthDisadvantage());
	}
	
	@Test
	void testStrengthRequirement() {
		this.setup();
		assertEquals(0, this.unsafeAdventuring.getStrengthScoreRequirement());
	}
	
	@Test
	void testArmorName() {
		this.setup();
		assertEquals("Unarmored ", this.unsafeAdventuring.getName());
	}
	
	@Test
	void testArmorCost() {
		this.setup();
		assertEquals("N/A ", this.unsafeAdventuring.getCost());
	}
	
	@Test
	void testIsLightArmor() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isLightArmor());
	}
	
	@Test
	void testIsMediumArmor() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isMediumArmor());
	}
	
	@Test
	void testIsHeavyArmor() {
		this.setup();
		assertEquals(false, this.unsafeAdventuring.isHeavyArmor());
	}

}
