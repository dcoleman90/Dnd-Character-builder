package character.testing.classType;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import character.background.Background;
import character.background.BackgroundOutlander;
import character.build.Character;
import character.classType.Rogue;
import character.race.Human;
import character.race.Race;
import character.race.WoodElf;
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

public class TestRogueExpertise {
	Rogue rogue = new Rogue(1);
	Rogue rogue6 = new Rogue(6);
	Race human = new Human();
	Race woodElf = new WoodElf();
	Background outlander = new BackgroundOutlander();
	Character frank = new Character("Frank", 10, 10, 10, 10, 10, 10, human, rogue, outlander);
	Character frank6 = new Character("Frank", 10, 10, 10, 10, 10, 10, human, rogue6, outlander);

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

	/**
	 * Test for Rogue Ability Expertise which gives them DOUBLE prof bonus for 2
	 * selected skills
	 * 
	 * 
	 * 
	 */
	@Test
	void testRogueClassTypeShouldAllow4ClassSkillsAHnotAllowed() {
		this.frank.setProficentClassTypeSkill(this.ath);
		this.frank.setProficentClassTypeSkill(this.ah);
		this.frank.setProficentClassTypeSkill(this.decp);
		this.frank.setProficentClassTypeSkill(this.insight);
		this.frank.setProficentClassTypeSkill(this.inv);
		assertEquals(0, this.frank.getAnimalHandlingBonus());
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(2, this.frank.getInsightBonus());
		assertEquals(2, this.frank.getInvestigationBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
	}

	/**
	 * OUTLANDER ALLOWS FOR ATHLETIC THUS ACROBATIC SNEAKS IN
	 * 
	 * Stealth should NOT pass
	 */
	@Test
	void testShouldNotAllowA5thClassSkill() {
		this.frank.setProficentClassTypeSkill(this.ath);
		this.frank.setProficentClassTypeSkill(this.ah);
		this.frank.setProficentClassTypeSkill(this.decp);
		this.frank.setProficentClassTypeSkill(this.insight);
		this.frank.setProficentClassTypeSkill(this.inv);
		this.frank.setProficentClassTypeSkill(this.acro);
		this.frank.setProficentClassTypeSkill(this.stealth);
		assertEquals(0, this.frank.getAnimalHandlingBonus());
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(2, this.frank.getInsightBonus());
		assertEquals(2, this.frank.getInvestigationBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(2, this.frank.getAcrobaticsBonus());
		assertEquals(0, this.frank.getStealthBonus());
	}

	@Test
	void TestExpertiseShouldDoubleProfBonusStealth() {
		this.frank.setProficentClassTypeSkill(this.ath);
		this.frank.setProficentClassTypeSkill(this.ah);
		this.frank.setProficentClassTypeSkill(this.decp);
		this.frank.setProficentClassTypeSkill(this.insight);
		this.frank.setProficentClassTypeSkill(this.inv);
		this.frank.setProficentClassTypeSkill(this.stealth);
		
	
		this.frank.setRogueExpertise(stealth);
		
		assertEquals(0, this.frank.getAnimalHandlingBonus());
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(2, this.frank.getInsightBonus());
		assertEquals(2, this.frank.getInvestigationBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(4, this.frank.getStealthBonus());
	}
	
	@Test
	void testExpertiseShouldDoubleProfBonusStealthAthButNotDecpOutOfExpertise() {
		this.frank.setProficentClassTypeSkill(this.ath);
		this.frank.setProficentClassTypeSkill(this.decp);
		this.frank.setProficentClassTypeSkill(this.insight);
		this.frank.setProficentClassTypeSkill(this.inv);
		this.frank.setProficentClassTypeSkill(this.stealth);
		
		this.frank.setRogueExpertise(this.stealth);
		this.frank.setRogueExpertise(this.ath);
		this.frank.setRogueExpertise(this.decp);
		
		assertEquals(0, this.frank.getAnimalHandlingBonus());
		assertEquals(4, this.frank.getAthleticBonus());
		assertEquals(2, this.frank.getInsightBonus());
		assertEquals(2, this.frank.getInvestigationBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(4, this.frank.getStealthBonus());
	}

	
	
	/**
	 * This test as of 12/10/2018 returns the expected results
	 * 
	 * All 4 of the rogues profiecences are used before stealth is reached
	 * 
	 * 1st Acrobatics
	 * Athletics is granted because of the outlander background
	 * 2nd Deception
	 * 3rd insight
	 * 4th investigation
	 * 
	 * Stealth is left out thus cannot gain the setRogueExpertise benefit
	 */
	@Test
	void testExpertiseShouldDoubleProfBonusStealthAthButNotDecpOutOfExpertiseAtLevel6() {
		this.frank6.setProficentClassTypeSkill(this.acro);
		this.frank6.setProficentClassTypeSkill(this.ath);
		this.frank6.setProficentClassTypeSkill(this.decp);
		this.frank6.setProficentClassTypeSkill(this.insight);
		this.frank6.setProficentClassTypeSkill(this.inv);
		this.frank6.setProficentClassTypeSkill(this.stealth);

		// Stealth is not a proficient skill and thus does not gain the bonus
		this.frank6.setRogueExpertise(this.stealth);
		this.frank6.setRogueExpertise(this.ath);
		this.frank6.setRogueExpertise(this.decp);
		this.frank6.setRogueExpertise(this.insight);
		
		assertEquals(6, this.frank6.getAthleticBonus());
		assertEquals(6, this.frank6.getInsightBonus());
		assertEquals(3, this.frank6.getInvestigationBonus());
		assertEquals(6, this.frank6.getDeceptionBonus());
		assertEquals(0, this.frank6.getStealthBonus());
		assertEquals(1, this.frank6.getClassType().getNumberOfRogueExpertiseRanks());
	}
	
	
	/**
	 * Testing carbon copy of above test
	 * 
	 * THIS test is testing the setLevel - insuring that when the Level is changed the rest of the character's atrubiutes follows suit
	 * 
	 * All 4 of the rogues profiecences are used before stealth is reached
	 * 
	 * 1st Acrobatics
	 * Athletics is granted because of the outlander background
	 * 2nd Deception
	 * 3rd insight
	 * 4th investigation
	 * 
	 * Stealth is left out thus cannot gain the setRogueExpertise benifit
	 */
	@Test
	void testExpertiseShouldDoubleProfBonusStealthAthButNotDecpOutOfExpertiseAtSETLEVEL1() {
		this.frank6.setLevel(1);
		this.frank6.setProficentClassTypeSkill(this.acro);
		this.frank6.setProficentClassTypeSkill(this.ath);
		this.frank6.setProficentClassTypeSkill(this.decp);
		this.frank6.setProficentClassTypeSkill(this.insight);
		this.frank6.setProficentClassTypeSkill(this.inv);
		
		this.frank6.setRogueExpertise(this.ath);
		this.frank6.setRogueExpertise(this.decp);
		this.frank6.setRogueExpertise(this.insight);
		
		//As level was reset to 1 so should the number of RogueExpertise and thus decp should not gain the benifit
		assertEquals(4, this.frank6.getAthleticBonus());
		assertEquals(2, this.frank6.getInsightBonus());
		assertEquals(2, this.frank6.getInvestigationBonus());
		assertEquals(4, this.frank6.getDeceptionBonus());
		assertEquals(0, this.frank6.getStealthBonus());
		assertEquals(0, this.frank6.getClassType().getNumberOfRogueExpertiseRanks());
	}
	
	

}
