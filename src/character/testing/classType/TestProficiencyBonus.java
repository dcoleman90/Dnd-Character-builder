package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.classType.Fighter;

class TestProficiencyBonus {
	Fighter fi = new Fighter();

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels1to4() {
		assertEquals(2, fi.getProficiencyBonus(1));
		assertEquals(2, fi.getProficiencyBonus(2));
		assertEquals(2, fi.getProficiencyBonus(3));
		assertEquals(2, fi.getProficiencyBonus(4));
	}

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels5to8() {
		assertEquals(3, fi.getProficiencyBonus(5));
		assertEquals(3, fi.getProficiencyBonus(6));
		assertEquals(3, fi.getProficiencyBonus(7));
		assertEquals(3, fi.getProficiencyBonus(8));
	}

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels9to12() {
		assertEquals(4, fi.getProficiencyBonus(9));
		assertEquals(4, fi.getProficiencyBonus(10));
		assertEquals(4, fi.getProficiencyBonus(11));
		assertEquals(4, fi.getProficiencyBonus(12));
	}
	

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels13to16() {
		assertEquals(5, fi.getProficiencyBonus(13));
		assertEquals(5, fi.getProficiencyBonus(14));
		assertEquals(5, fi.getProficiencyBonus(15));
		assertEquals(5, fi.getProficiencyBonus(16));
	}
	

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels17to20() {
		assertEquals(6, fi.getProficiencyBonus(17));
		assertEquals(6, fi.getProficiencyBonus(18));
		assertEquals(6, fi.getProficiencyBonus(19));
		assertEquals(6, fi.getProficiencyBonus(20));
	}
	
	
}
