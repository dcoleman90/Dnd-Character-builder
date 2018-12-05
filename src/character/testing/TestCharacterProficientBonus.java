package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.build.Character;
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

class TestCharacterProficientBonus {
	Character hero = new Character();

	// Allowed Skills for fighters/default character
	Athletics ath = new Athletics(0);
	History hist = new History(0);
	Acrobatics acro = new Acrobatics(0);
	AnimalHandling ah = new AnimalHandling(0);
	Insight insight = new Insight(0);
	Intimidation intim = new Intimidation(0);
	Perception perc = new Perception(0);
	Survival surv = new Survival(0);

	// not allowed skills fighters/default character
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
	 * Test default character allowable choices combined for efficiency - split up
	 * to more quickly narrow down mistakes
	 */
	@Test
	void testDefaultCharacterFigherAllowedChoicesPart1() {
		assertTrue(hero.checkProficentSkill(this.ath));
		assertTrue(hero.checkProficentSkill(this.hist));
		assertTrue(hero.checkProficentSkill(this.acro));
		assertTrue(hero.checkProficentSkill(this.ah));
	}

	/**
	 * Test default character allowable choices combined for efficiency - split up
	 * to more quickly narrow down mistakes
	 */
	@Test
	void testDefaultCharacterFigherAllowedChoicesPart2() {
		assertTrue(hero.checkProficentSkill(this.insight));
		assertTrue(hero.checkProficentSkill(this.intim));
		assertTrue(hero.checkProficentSkill(this.perc));
		assertTrue(hero.checkProficentSkill(this.surv));
	}

	/**
	 * Test SetProFicentSkills This method adds the proficiency bonus to the skill
	 * Then it decreases the amount of classType provided skills by one
	 * 
	 * As of version 12/5/2018 the bonus is hard coded at 2 test will need to be
	 * altered after this is fixed
	 */
	@Test
	void testSetProficeentSkillWithTwoAcceptableValues() {
		int athScore = this.hero.getSkills().getAthletic().getSkill();
		this.hero.setProficentSkill(ath);
		assertEquals(this.hero.getSkills().getAthletic().getSkill(), athScore+2);
	}

}
