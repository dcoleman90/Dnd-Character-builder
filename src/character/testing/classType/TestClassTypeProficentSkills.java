package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import character.classType.Fighter;
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

class TestClassTypeProficentSkills {
	Fighter fight = new Fighter(1);

	// Allowed Skills for fighters
	Athletics ath = new Athletics(0);
	History hist = new History(0);
	Acrobatics acro = new Acrobatics(0);
	AnimalHandling ah = new AnimalHandling(0);
	Insight insight = new Insight(0);
	Intimidation intim = new Intimidation(0);
	Perception perc = new Perception(0);
	Survival surv = new Survival(0);
	
	// not allowed skills
	Arcana arca = new Arcana(0);
	Deception decp = new Deception(0);
	Investigation inv = new Investigation(0);
	Medicine med = new Medicine(0);
	Nature nat = new Nature(0);
	Performance perf = new Performance(0);
	Religion relg = new Religion(0);
	SleightOfHand sOH = new SleightOfHand(0);
	Stealth stealth = new Stealth(0);
	
	/**
	 * This test will insure that Athletics History Acrobatics and AnimalHandling
	 * all return as class skills
	 */
	@Test
	void testProficientSkillsAthHistAcroAnimalHand() {
		assertTrue(fight.isClassSkill(this.ath));
		assertTrue(fight.isClassSkill(this.hist));
		assertTrue(fight.isClassSkill(this.acro));
		assertTrue(fight.isClassSkill(this.ah));
	}

	/**
	 * This test will insure that Insight Intimidation Perception and survival all
	 * return as class skills
	 */
	@Test
	void testProficientSkillsInsightIntimPercSurvial() {
		assertTrue(fight.isClassSkill(this.insight));
		assertTrue(fight.isClassSkill(this.intim));
		assertTrue(fight.isClassSkill(this.perc));
		assertTrue(fight.isClassSkill(this.surv));
	}
	
	/**
	 * These test should return false as they are not allowed by fighters
	 */
	@Test
	void testNotProficientSkillsArcaDecpInvMedNat() {
		assertFalse(fight.isClassSkill(this.arca));
		assertFalse(fight.isClassSkill(this.decp));
		assertFalse(fight.isClassSkill(this.inv));
		assertFalse(fight.isClassSkill(this.med));
		assertFalse(fight.isClassSkill(this.nat));
	}
	
	/**
	 * These test should return false as they are not allowed by fighters
	 */
	@Test
	void testNotProficientSkillsPerfRelgSohStealth() {
		assertFalse(fight.isClassSkill(this.perf));
		assertFalse(fight.isClassSkill(this.relg));
		assertFalse(fight.isClassSkill(this.sOH));
		assertFalse(fight.isClassSkill(this.stealth));
	}
	
	
	

}
