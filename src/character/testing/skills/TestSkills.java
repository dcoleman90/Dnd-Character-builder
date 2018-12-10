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
	Fighter fighter = new Fighter();
	Character hero = new Character(1, fighter, outlander, human);
	Fighter fight = new Fighter();
	Character drew = new Character("name", 7, 18, 16, -6, 10, 14, human, fight, 1, outlander);

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

	@Test
	void testSkillsTestSetUpSkillScoresCustomHero0_4() {
		assertEquals(4, drew.getArrayListSkill().get(0).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(1).getSkill());
		assertEquals(-7, drew.getArrayListSkill().get(2).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(3).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(4).getSkill());

	}

	@Test
	void testSkillsTestSetUp5_17() {
		assertEquals(-7, drew.getArrayListSkill().get(5).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(6).getSkill());
		assertEquals(-7, drew.getArrayListSkill().get(7).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(8).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(9).getSkill());
		assertEquals(-7, drew.getArrayListSkill().get(10).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(11).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(12).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(13).getSkill());
		assertEquals(-7, drew.getArrayListSkill().get(14).getSkill());
		assertEquals(4, drew.getArrayListSkill().get(15).getSkill());
		assertEquals(4, drew.getArrayListSkill().get(16).getSkill());
		assertEquals(2, drew.getArrayListSkill().get(17).getSkill());
	}

}
