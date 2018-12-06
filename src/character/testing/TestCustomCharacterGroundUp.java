package character.testing;

import static org.junit.jupiter.api.Assertions.*;
import character.build.Character;
import character.classType.Fighter;
import character.race.Human;
import character.race.Race;
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

import org.junit.jupiter.api.Test;

class TestCustomCharacterGroundUp {
	Fighter fighter = new Fighter();
	Race human = new Human();
	Character frank = new Character("Frank", 12, 12, 12, 12, 12, 12, human, fighter, 1);

	// Allowed Skills for fighters
	Athletics ath = new Athletics(0);
	History hist = new History(0);
	Acrobatics acro = new Acrobatics(0);
	AnimalHandling ah = new AnimalHandling(0);
	Insight insight = new Insight(0);
	Intimidation intim = new Intimidation(0);
	Perception perc = new Perception(0);
	Survival surv = new Survival(0);
	// not allowed skills fighters
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
	 * Test ability scores are what is expected after being modified by the human
	 * template
	 */
	@Test
	void testBuildACharacterFromGroundUpTestingGetAbilityScores() {
		assertEquals(13, frank.getCharismaScore());
		assertEquals(13, frank.getConScore());
		assertEquals(13, frank.getDexScore());
		assertEquals(13, frank.getIntellScore());
		assertEquals(13, frank.getStrScore());
		assertEquals(13, frank.getWisScore());
	}

	/**
	 * Test that skill scores are what is expected BEFORE getting class skills
	 */
	@Test
	void testBuildACharacterFromGroundUpTestingGetSkillScores() {
		assertEquals(1, frank.getSkills().getAcrobatic().getSkill());
		assertEquals(1, frank.getSkills().getAnimalHandle().getSkill());
		assertEquals(1, frank.getSkills().getArcana().getSkill());
		assertEquals(1, frank.getSkills().getAthletic().getSkill());
		assertEquals(1, frank.getSkills().getDeception().getSkill());
		assertEquals(1, frank.getSkills().getHistory().getSkill());
		assertEquals(1, frank.getSkills().getInsight().getSkill());
		assertEquals(1, frank.getSkills().getIntimidation().getSkill());
		assertEquals(1, frank.getSkills().getInvestigation().getSkill());
		assertEquals(1, frank.getSkills().getMedicine().getSkill());
		assertEquals(1, frank.getSkills().getNature().getSkill());
		assertEquals(1, frank.getSkills().getPerception().getSkill());
		assertEquals(1, frank.getSkills().getPerformance().getSkill());
		assertEquals(1, frank.getSkills().getPersuasion().getSkill());
		assertEquals(1, frank.getSkills().getReligion().getSkill());
		assertEquals(1, frank.getSkills().getSleightOfHand().getSkill());
		assertEquals(1, frank.getSkills().getStealth().getSkill());
		assertEquals(1, frank.getSkills().getSurvival().getSkill());
	}

	/**
	 * Test if skills are allowed to be proficient - due to being a fighter
	 */
	@Test
	void testProficientSkillsAllowedFigher() {
		assertTrue(frank.checkProficentSkill(this.ath));
		assertTrue(frank.checkProficentSkill(this.hist));
		assertTrue(frank.checkProficentSkill(this.acro));
		assertTrue(frank.checkProficentSkill(this.ah));
		assertTrue(frank.checkProficentSkill(this.insight));
		assertTrue(frank.checkProficentSkill(this.intim));
		assertTrue(frank.checkProficentSkill(this.perc));
		assertTrue(frank.checkProficentSkill(this.surv));
	}

	/**
	 * Test skills that are NOT allowed to be proficient - due to being a fighter
	 */
	@Test
	void testNotProficientSkillsFigher() {
		assertFalse(frank.checkProficentSkill(this.arca));
		assertFalse(frank.checkProficentSkill(this.decp));
		assertFalse(frank.checkProficentSkill(this.inv));
		assertFalse(frank.checkProficentSkill(this.med));
		assertFalse(frank.checkProficentSkill(this.nat));
		assertFalse(frank.checkProficentSkill(this.perf));
		assertFalse(frank.checkProficentSkill(this.relg));
		assertFalse(frank.checkProficentSkill(this.sOH));
		assertFalse(frank.checkProficentSkill(this.stealth));
	}

	/**
	 * Test add perc and surv skills to be prof - and gain proficiency
	 * 
	 * Performance is NOT allowed and should not gain a bonus
	 * History IS allowed - but is the third added and fighters only gain 2 proficiencies
	 * 
	 * 
	 * THIS TEST IS THE FIRST ONE WITH CHARACTER HAVING DIRECT METHODS TO ACCESS THE SKILL BONUS
	 */
	@Test
	void testPercAndSurvSkillsAsProf() {
		frank.setProficentSkill(this.perc);
		frank.setProficentSkill(this.perf);
		frank.setProficentSkill(this.surv);
		frank.setProficentSkill(this.hist);
		assertEquals(3, frank.getPerceptionBonus());
		assertEquals(1, frank.getPerformanceBonus());
		assertEquals(3, frank.getSurvivalBonus());
		assertEquals(1, frank.getHistoryBonus());
	}

}
