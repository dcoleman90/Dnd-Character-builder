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
import character.skills.Athletics;
import character.skills.History;
import character.skills.Insight;
import character.skills.Intimidation;
import character.skills.Perception;
import character.skills.Skill;
import character.skills.Skills;
import character.skills.Survival;

class TestClassTypeProficentSkills {
	Fighter fight = new Fighter();
	Strength strenght = new Strength(10);
	Dexterity dex = new Dexterity(10);
	Constitution con = new Constitution(10);
	Intelligence intel = new Intelligence(10);
	Wisdom wis = new Wisdom(10);
	Charisma charisma = new Charisma(10);
	Athletics ath = new Athletics(0);
	History hist = new History(0);
	
	Skills proficentSkills = new Skills(strenght, dex, con, intel, wis, charisma);

	@Test
	void testProficientSkills() {
		fight.proficentSkills(this.proficentSkills, ath, hist);
		assertEquals(this.proficentSkills.getCharactersSkills().get(0).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(1).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(2).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(3).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(4).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(5).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(6).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(7).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(8).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(9).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(10).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(11).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(12).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(13).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(14).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(15).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(16).getSkill(), 0);
		assertEquals(this.proficentSkills.getCharactersSkills().get(17).getSkill(), 0);
		
	}

}
