package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import character.background.Background;
import character.background.BackgroundOutlander;
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
	Fighter fighter = new Fighter(1);
	Race human = new Human();
	Background outlander = new BackgroundOutlander();
	Character frank = new Character("this.frank", 12, 12, 12, 12, 12, 12, human, fighter, outlander);

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
		assertEquals(13, this.frank.getCharismaScore());
		assertEquals(13, this.frank.getConScore());
		assertEquals(13, this.frank.getDexScore());
		assertEquals(13, this.frank.getIntellScore());
		assertEquals(13, this.frank.getStrScore());
		assertEquals(13, this.frank.getWisScore());
	}

	/**
	 * Test that skill scores are what is expected BEFORE getting class skills
	 * 
	 * Athletics and Survial are at 3 due to the BACKGROUND
	 */
	@Test
	void testBuildACharacterFromGroundUpTestingGetSkillScores() {
		assertEquals(1, this.frank.getSkills().getAcrobatic().getSkill());
		assertEquals(1, this.frank.getSkills().getAnimalHandle().getSkill());
		assertEquals(1, this.frank.getSkills().getArcana().getSkill());
		
		System.out.println(this.frank.getStr().getAbilityBonus() + " " + this.frank.getStrScore() + " " + outlander.getSkillProf1().getSkill() + " " + outlander.getSkillProf2().getSkill());
		
		assertEquals(3, this.frank.getAthleticBonus()); // THIS TEST FAILS NEED TO FIND OUT WHY
		assertEquals(1, this.frank.getSkills().getDeception().getSkill());
		assertEquals(1, this.frank.getSkills().getHistory().getSkill());
		assertEquals(1, this.frank.getSkills().getInsight().getSkill());
		assertEquals(1, this.frank.getSkills().getIntimidation().getSkill());
		assertEquals(1, this.frank.getSkills().getInvestigation().getSkill());
		assertEquals(1, this.frank.getSkills().getMedicine().getSkill());
		assertEquals(1, this.frank.getSkills().getNature().getSkill());
		assertEquals(1, this.frank.getSkills().getPerception().getSkill());
		assertEquals(1, this.frank.getSkills().getPerformance().getSkill());
		assertEquals(1, this.frank.getSkills().getPersuasion().getSkill());
		assertEquals(1, this.frank.getSkills().getReligion().getSkill());
		assertEquals(1, this.frank.getSkills().getSleightOfHand().getSkill());
		assertEquals(1, this.frank.getSkills().getStealth().getSkill());
		assertEquals(3, this.frank.getSkills().getSurvival().getSkill());
	}

	/**
	 * Test if skills are allowed to be proficient - due to being a fighter
	 */
	@Test
	void testProficientSkillsAllowedFigher() {
		assertTrue(this.frank.checkProficentSkill(this.ath));
		assertTrue(this.frank.checkProficentSkill(this.hist));
		assertTrue(this.frank.checkProficentSkill(this.acro));
		assertTrue(this.frank.checkProficentSkill(this.ah));
		assertTrue(this.frank.checkProficentSkill(this.insight));
		assertTrue(this.frank.checkProficentSkill(this.intim));
		assertTrue(this.frank.checkProficentSkill(this.perc));
		assertTrue(this.frank.checkProficentSkill(this.surv));
	}

	/**
	 * Test skills that are NOT allowed to be proficient - due to being a fighter
	 */
	@Test
	void testNotProficientSkillsFigher() {
		assertFalse(this.frank.checkProficentSkill(this.arca));
		assertFalse(this.frank.checkProficentSkill(this.decp));
		assertFalse(this.frank.checkProficentSkill(this.inv));
		assertFalse(this.frank.checkProficentSkill(this.med));
		assertFalse(this.frank.checkProficentSkill(this.nat));
		assertFalse(this.frank.checkProficentSkill(this.perf));
		assertFalse(this.frank.checkProficentSkill(this.relg));
		assertFalse(this.frank.checkProficentSkill(this.sOH));
		assertFalse(this.frank.checkProficentSkill(this.stealth));
	}

	/**
	 * Test add perc and surv skills to be prof - and gain proficiency
	 * 
	 * Performance is NOT allowed and should not gain a bonus History IS allowed -
	 * and added because BACKGROUND added survial bonus
	 * 
	 * Insight is allowed - but is NOT added because fighter class gets ONLY 2
	 * proficiency
	 * 
	 * THIS TEST IS THE FIRST ONE WITH CHARACTER HAVING DIRECT METHODS TO ACCESS THE
	 * SKILL BONUS
	 */
	@Test
	void testPercAndSurvSkillsAsProf() {
		this.frank.setProficentClassTypeSkill(this.perc);
		this.frank.setProficentClassTypeSkill(this.perf);
		this.frank.setProficentClassTypeSkill(this.surv);
		this.frank.setProficentClassTypeSkill(this.hist);
		this.frank.setProficentClassTypeSkill(this.insight);
		assertEquals(3, this.frank.getPerceptionBonus());
		assertEquals(1, this.frank.getPerformanceBonus());
		assertEquals(3, this.frank.getSurvivalBonus());
		assertEquals(3, this.frank.getHistoryBonus());
		assertEquals(0, this.frank.getRemainingClassTypeProf());
		assertEquals(1, this.frank.getInsightBonus());
	}

	/**
	 * Test to insure the background has set the survival and Athletic bonuses
	 */
	void TestBackgroundSetUp() {
		assertEquals(3, this.frank.getSurvivalBonus());
		assertEquals(3, this.frank.getAthleticBonus());
	}

}
