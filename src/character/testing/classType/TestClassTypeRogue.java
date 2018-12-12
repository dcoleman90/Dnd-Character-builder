package character.testing.classType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.classType.Rogue;
import character.skills.Acrobatics;
import character.skills.AnimalHandling;
import character.skills.Arcana;
import character.skills.Athletics;
import character.skills.Deception;
import character.skills.History;
import character.skills.Insight;
import character.skills.Intimidation;
import character.skills.Investigation;
import character.skills.Medicine;
import character.skills.Nature;
import character.skills.Perception;
import character.skills.Performance;
import character.skills.Religion;
import character.skills.SleightOfHand;
import character.skills.Stealth;
import character.skills.Survival;

public class TestClassTypeRogue {
	Rogue rogue = new Rogue();

	// Allowed Skills for Rogues
	Athletics ath = new Athletics(0);
	Deception decp = new Deception(0);
	Acrobatics acro = new Acrobatics(0);
	Investigation inv = new Investigation(0);
	Insight insight = new Insight(0);
	Intimidation intim = new Intimidation(0);
	Perception perc = new Perception(0);
	Performance perf = new Performance(0);
	SleightOfHand sOH = new SleightOfHand(0);
	Stealth stealth = new Stealth(0);

	// not allowed skills
	Arcana arca = new Arcana(0);
	History hist = new History(0);
	AnimalHandling ah = new AnimalHandling(0);
	Survival surv = new Survival(0);
	Medicine med = new Medicine(0);

	Nature nat = new Nature(0);
	Religion relg = new Religion(0);

	// Abilities
	Strength str = new Strength();
	Dexterity dex = new Dexterity();
	Constitution con = new Constitution();
	Intelligence intell = new Intelligence();
	Wisdom wis = new Wisdom();
	Charisma charima = new Charisma();

	/**
	 * This test will insure the correct skills are labeled as Rogue skills
	 * 
	 * Split into for for easier diagnoses
	 * 
	 * 
	 */
	@Test
	void testProficientSkillsAthHistAcroAnimalHand() {
		assertTrue(rogue.isClassSkill(this.ath));
		assertFalse(rogue.isClassSkill(this.hist));
		assertTrue(rogue.isClassSkill(this.acro));
		assertFalse(rogue.isClassSkill(this.ah));
	}

	@Test
	void testProficientSkillsInsightIntimPercSurvial() {
		assertTrue(rogue.isClassSkill(this.insight));
		assertTrue(rogue.isClassSkill(this.intim));
		assertTrue(rogue.isClassSkill(this.perc));
		assertFalse(rogue.isClassSkill(this.surv));
	}

	@Test
	void testNotProficientSkillsArcaDecpInvMedNat() {
		assertFalse(rogue.isClassSkill(this.arca));
		assertTrue(rogue.isClassSkill(this.decp));
		assertTrue(rogue.isClassSkill(this.inv));
		assertFalse(rogue.isClassSkill(this.med));
		assertFalse(rogue.isClassSkill(this.nat));
	}

	@Test
	void testNotProficientSkillsPerfRelgSohStealth() {
		assertTrue(rogue.isClassSkill(this.perf));
		assertFalse(rogue.isClassSkill(this.relg));
		assertTrue(rogue.isClassSkill(this.sOH));
		assertTrue(rogue.isClassSkill(this.stealth));
	}

	/**
	 * These next test insure that the hitpoints are set accordingly
	 */

	@Test
	void testSetHitPointsWithLevelOneRogueWithOneCon() {
		Rogue rogue = new Rogue();
		rogue.setHitPoints(1, 1);
		assertEquals(rogue.getHitPoints(), 9);
	}

	@Test
	void testSetHitPointsWithLevel2RogueWith1Con() {
		for (int count = 0; count < 10000; count++) {
			this.rogue.setHitPoints(2, 1);
			assertTrue(11 <= this.rogue.getHitPoints() && this.rogue.getHitPoints() <= 18);
		}
	}

	@Test
	void testSetHitPointsWithLevel2RogueWith5Con() {
		for (int count = 0; count < 10000; count++) {
			this.rogue.setHitPoints(2, 5);
			assertTrue(19 <= this.rogue.getHitPoints() && this.rogue.getHitPoints() <= 26);
		}
	}

	@Test
	void testSetHitPointsWithLevel5RogueWith1Con() {
		for (int count = 0; count < 10000; count++) {
			this.rogue.setHitPoints(5, 1);
			assertTrue(17 <= this.rogue.getHitPoints() && this.rogue.getHitPoints() <= 45);
		}
	}

	@Test
	void testSavingThrowsTRUE_Prof() {
		assertTrue(this.rogue.isClassSavingThrow(this.dex));
		assertTrue(this.rogue.isClassSavingThrow(this.intell));
	}

	@Test
	void testSavingThrowsFalseProf() {
		assertFalse(this.rogue.isClassSavingThrow(this.str));
		assertFalse(this.rogue.isClassSavingThrow(this.con));
		assertFalse(this.rogue.isClassSavingThrow(this.charima));
		assertFalse(this.rogue.isClassSavingThrow(this.wis));

	}

}
