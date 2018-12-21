package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.classType.Fighter;

class TestProficiencyBonus {
	Fighter fi = new Fighter(1);

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels1to4() {
		assertEquals(2, fi.getProficiencyBonus());
		fi.setLevel(2);
		assertEquals(2, fi.getProficiencyBonus());
		fi.setLevel(3);
		assertEquals(2, fi.getProficiencyBonus());
		fi.setLevel(4);
		assertEquals(2, fi.getProficiencyBonus());
	}

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels5to8() {
		fi.setLevel(5);
		assertEquals(3, fi.getProficiencyBonus());
		fi.setLevel(6);
		assertEquals(3, fi.getProficiencyBonus());
		fi.setLevel(7);
		assertEquals(3, fi.getProficiencyBonus());
		fi.setLevel(8);
		assertEquals(3, fi.getProficiencyBonus());
	}

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels9to12() {
		fi.setLevel(9);
		assertEquals(4, fi.getProficiencyBonus());
		fi.setLevel(10);
		assertEquals(4, fi.getProficiencyBonus());
		fi.setLevel(11);
		assertEquals(4, fi.getProficiencyBonus());
		fi.setLevel(12);
		assertEquals(4, fi.getProficiencyBonus());
	}
	

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels13to16() {
		fi.setLevel(13);
		assertEquals(5, fi.getProficiencyBonus());
		fi.setLevel(14);
		assertEquals(5, fi.getProficiencyBonus());
		fi.setLevel(15);
		assertEquals(5, fi.getProficiencyBonus());
		fi.setLevel(16);
		assertEquals(5, fi.getProficiencyBonus());
		
	}
	

	/**
	 * Test Proficiency bonus - needs to insure correct bonus is applied to the right
	 * levels
	 */
	@Test
	void testProfBonusLevels17to20() {
		fi.setLevel(17);
		assertEquals(6, fi.getProficiencyBonus());
		fi.setLevel(18);
		assertEquals(6, fi.getProficiencyBonus());
		fi.setLevel(19);
		assertEquals(6, fi.getProficiencyBonus());
		fi.setLevel(20);
		assertEquals(6, fi.getProficiencyBonus());
	}
	
	
}
