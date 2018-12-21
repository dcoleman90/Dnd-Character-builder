package character.testing.classType;

import static org.junit.jupiter.api.Assertions.*;

import character.background.Background;
import character.background.BackgroundOutlander;
import character.build.Character;
import character.classType.Fighter;
import character.classType.Rogue;
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

class TestCharacterChangeClassType {

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

	// not allowed skills for Rogues
	Arcana arca = new Arcana(0);
	History hist = new History(0);
	AnimalHandling ah = new AnimalHandling(0);
	Survival surv = new Survival(0);
	Medicine med = new Medicine(0);
	Nature nat = new Nature(0);
	Religion relg = new Religion(0);

	Rogue rogue = new Rogue(1);
	Fighter fight = new Fighter(1);
	Race human = new Human();
	Background outlander = new BackgroundOutlander();
	Character frank = new Character("Frank", 10, 10, 10, 10, 10, 10, human, rogue, outlander);

	/**
	 * The following test will insure that once a character is created the classtype
	 * can change and return the expected values
	 * 
	 * Outlander provides both Athletics and Survival Skills
	 * 
	 * 
	 */
	@Test
	void testChangeClassTypeRogueToFigherSimple() {
		assertEquals(this.frank.getClassType(), this.rogue);
		this.frank.setClassType(fight);
		assertEquals(this.frank.getClassType(), this.fight);
	}

	@Test
	void testInsureThatProfResetAfterClassChange() {
		assertEquals(this.frank.getClassType(), this.rogue);
		this.frank.setProficentClassTypeSkill(this.perc);
		this.frank.setProficentClassTypeSkill(this.perf);
		this.frank.setProficentClassTypeSkill(this.acro);
		this.frank.setProficentClassTypeSkill(this.decp);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(2, this.frank.getAcrobaticsBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(2, this.frank.getPerceptionBonus());
		assertEquals(2, this.frank.getPerformanceBonus());
		
		this.frank.setClassType(fight);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(0, this.frank.getAcrobaticsBonus());
		assertEquals(0, this.frank.getDeceptionBonus());
		assertEquals(0, this.frank.getPerceptionBonus());
		assertEquals(0, this.frank.getPerformanceBonus());
		
	}
	
	@Test
	void testInsureThatProfResetAfterClassChangeRemovesRogueExperitise() {
		assertEquals(this.frank.getClassType(), this.rogue);
		this.frank.setProficentClassTypeSkill(this.perc);
		this.frank.setProficentClassTypeSkill(this.perf);
		this.frank.setProficentClassTypeSkill(this.acro);
		this.frank.setProficentClassTypeSkill(this.decp);
		
		this.frank.setRogueExpertise(this.perc);
		this.frank.setRogueExpertise(this.acro);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(4, this.frank.getAcrobaticsBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(4, this.frank.getPerceptionBonus());
		assertEquals(2, this.frank.getPerformanceBonus());
		
		this.frank.setClassType(fight);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(0, this.frank.getAcrobaticsBonus());
		assertEquals(0, this.frank.getDeceptionBonus());
		assertEquals(0, this.frank.getPerceptionBonus());
		assertEquals(0, this.frank.getPerformanceBonus());
		
	}
	
	@Test
	void testInsureThatProfResetAfterClassChangeRemovesRogueExperitiseSwitchBackToRogueStillDefault() {
		assertEquals(this.frank.getClassType(), this.rogue);
		this.frank.setProficentClassTypeSkill(this.perc);
		this.frank.setProficentClassTypeSkill(this.perf);
		this.frank.setProficentClassTypeSkill(this.acro);
		this.frank.setProficentClassTypeSkill(this.decp);
		
		this.frank.setRogueExpertise(this.perc);
		this.frank.setRogueExpertise(this.acro);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(4, this.frank.getAcrobaticsBonus());
		assertEquals(2, this.frank.getDeceptionBonus());
		assertEquals(4, this.frank.getPerceptionBonus());
		assertEquals(2, this.frank.getPerformanceBonus());
		
		this.frank.setClassType(fight);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(0, this.frank.getAcrobaticsBonus());
		assertEquals(0, this.frank.getDeceptionBonus());
		assertEquals(0, this.frank.getPerceptionBonus());
		assertEquals(0, this.frank.getPerformanceBonus());
		
		this.frank.setClassType(this.rogue);
		
		assertEquals(2, this.frank.getAthleticBonus());
		assertEquals(0, this.frank.getAcrobaticsBonus());
		assertEquals(0, this.frank.getDeceptionBonus());
		assertEquals(0, this.frank.getPerceptionBonus());
		assertEquals(0, this.frank.getPerformanceBonus());
		
	}

}
