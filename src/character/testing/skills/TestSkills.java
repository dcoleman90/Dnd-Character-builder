package character.testing.skills;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Wisdom;
import character.background.Background;
import character.background.BackgroundOutlander;
import character.build.Character;
import character.classType.Fighter;
import character.race.Human;
import character.race.Race;

class TestSkills {
	Race human = new Human();
	Background outlander = new BackgroundOutlander();
	Fighter fighter = new Fighter(1);
	Character hero = new Character(fighter, outlander, human);
	Fighter fight = new Fighter(1);
	Character drew = new Character("name", 7, 18, 16, 1, 10, 14, human, fight, outlander);

	/**
	 * This test shows the initial way to get the Skill from the characters
	 * ArrayList<Skills> but now all the Skill have direct getters and setters which
	 * can be accessed by the Skills
	 * 
	 * So it could be hero.getSkills().getAcrobatic();
	 * 
	 * This has been updated to reflect the Background class
	 */
	@Test
	void testSkillsTestSetUpSkillScoresDefault() {

		assertEquals(0, hero.getArrayListSkill().get(0).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(1).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(2).getSkill());
		assertEquals(2, hero.getArrayListSkill().get(3).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(4).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(5).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(6).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(7).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(8).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(9).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(10).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(11).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(12).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(13).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(14).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(15).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(16).getSkill());
		assertEquals(2, hero.getArrayListSkill().get(17).getSkill());
	}

	@Test
	void testConfirmSkillsPath() {
		Wisdom str = new Wisdom(8);
		assertEquals(str.getAbilityBonus(), -1);
	}

	/**
	 * All the INT based skills are upgraded from an ability score of 1 to 2 due to
	 * drew having a human trait
	 * 
	 * Athletics is 1 instead of -1 because the background adds it as a proficency
	 */

	@Test
	void testSkillsTestSetUpSkillScoresCustomHero0_4() {
		assertEquals(4, drew.getArrayListSkill().get(0).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(1).getSkill());
		assertEquals(-4, drew.getArrayListSkill().get(2).getSkill());
		assertEquals(1, drew.getArrayListSkill().get(3).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(4).getSkill());

	}

	@Test
	void testSkillsTestSetUp5_10() {
		assertEquals(-4, drew.getArrayListSkill().get(5).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(6).getSkill());
		assertEquals(-4, drew.getArrayListSkill().get(7).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(8).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(9).getSkill());
		assertEquals(-4, drew.getArrayListSkill().get(10).getSkill());
	}

	@Test
	void testSkillsTestSetup11_17() {
		assertEquals(0, drew.getArrayListSkill().get(11).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(12).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(13).getSkill());
		assertEquals(-4, drew.getArrayListSkill().get(14).getSkill());
		assertEquals(4, drew.getArrayListSkill().get(15).getSkill());
		assertEquals(4, drew.getArrayListSkill().get(16).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(17).getSkill());

	}

}
