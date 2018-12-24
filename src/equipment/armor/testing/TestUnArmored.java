package equipment.armor.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import equipment.armor.UnArmored;

class TestUnArmored {
	private UnArmored unsafeAdventuring;
	
	public void setup(int dexMod) {
		this.unsafeAdventuring = new UnArmored(dexMod);
	}

	@Test
	void testStandardSetupWithADexBonusOf5() {
		this.setup(5);
		assertEquals(this.unsafeAdventuring.getArmorClass(), 15);
	}

	@Test
	void testStandardSetupWithADexBonusOf3() {
		this.setup(3);
		assertEquals(this.unsafeAdventuring.getArmorClass(), 13);
	}

	@Test
	void testStandardSetupWithADexBonusOf1() {
		this.setup(1);
		assertEquals(this.unsafeAdventuring.getArmorClass(), 11);
	}

	@Test
	void testWeightShouldReturn8_0() {
		this.setup(0);
		assertEquals(this.unsafeAdventuring.getWeight(), 0.0, 0.000001);
	}
	
	@Test
	void testIsSpecial() {
		this.setup(0);
		assertEquals(false, this.unsafeAdventuring.isSpecial());
	}
	
	@Test
	void testIsStealthDisadvantage() {
		this.setup(0);
		assertEquals(false, this.unsafeAdventuring.isStealthDisadvantage());
	}
	
	@Test
	void testStrengthRequirement() {
		this.setup(1);
		assertEquals(0, this.unsafeAdventuring.getStrengthScoreRequirement());
	}
	
	@Test
	void testArmorName() {
		this.setup(1);
		assertEquals("Unarmored ", this.unsafeAdventuring.getName());
	}
	
	@Test
	void testArmorCost() {
		this.setup(1);
		assertEquals("N/A ", this.unsafeAdventuring.getCost());
	}
	
	@Test
	void testIsLightArmor() {
		this.setup(1);
		assertEquals(false, this.unsafeAdventuring.isLightArmor());
	}
	
	@Test
	void testIsMediumArmor() {
		this.setup(1);
		assertEquals(false, this.unsafeAdventuring.isMediumArmor());
	}
	
	@Test
	void testIsHeavyArmor() {
		this.setup(1);
		assertEquals(false, this.unsafeAdventuring.isHeavyArmor());
	}

}
