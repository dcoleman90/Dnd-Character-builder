package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import character.abilities.Ability;
import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.build.AbilityBonus;
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
import character.skills.Skill;
import character.skills.Skills;
import character.skills.SleightOfHand;
import character.skills.Stealth;
import character.skills.Survival;

class TestClassTypeProficentSkills {
	Fighter fight = new Fighter();
	Strength strenght = new Strength(10);
	Dexterity dex = new Dexterity(10);
	Constitution con = new Constitution(10);
	Intelligence intel = new Intelligence(10);
	Wisdom wis = new Wisdom(10);
	Charisma charisma = new Charisma(10);
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
	

	Skills proficentSkills = new Skills(strenght, dex, con, intel, wis, charisma);

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
	
	

}
