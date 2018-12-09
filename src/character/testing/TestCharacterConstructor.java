package character.testing;

import static org.junit.jupiter.api.Assertions.*;

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

import org.junit.jupiter.api.Test;

class TestCharacterConstructor {
	Character hero = new Character();
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
	 * This test will check the default constructor by comparing the toString method to the hard coded value
	 */
	@Test
	void testDefaultConstructerToString() {
		assertEquals(hero.toString(), "Human, Speed 30, Between 4 and 7 feet tall \n11 Strength 11 Dexterity 11 Constitution 11 Intelligence 11 Wisdom 11 Charisma ");
	}
	
	/**
	 * This test will check the default constructor - the character should return scores of all 11
	 */
	@Test
	void testDefaultConstructerByCallingGettersAll11() {
		assertEquals(hero.getCharismaScore(), 11);
		assertEquals(hero.getConScore(), 11);
		assertEquals(hero.getDexScore(), 11);
		assertEquals(hero.getStrScore(), 11);
		assertEquals(hero.getIntellScore(), 11);
		assertEquals(hero.getWisScore(), 11);
	}

}
