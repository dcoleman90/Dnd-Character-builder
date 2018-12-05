package character.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.abilities.Wisdom;
import character.build.AbilityBonus;
import character.build.Character;
import character.classType.Fighter;
import character.race.Human;

class TestSkills {
	Character hero = new Character();
	Human human = new Human();
	Fighter fight = new Fighter();
	Character drew = new Character(7, 18, 16, -6, 10, 14, human, fight);

	@Test
	void testSkillsTestSetUpSkillScoresDefault() {
		assertEquals(0, hero.getArrayListSkill().get(0).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(1).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(2).getSkill());
		assertEquals(0, hero.getArrayListSkill().get(3).getSkill());
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
		assertEquals(0, hero.getArrayListSkill().get(17).getSkill());
	}
	
	@Test
	void testConfirmSkillsPath() {
		Wisdom str = new Wisdom(8);
		AbilityBonus ab = new AbilityBonus();
		assertEquals(ab.returnBonus(str), -1);
	}
	

	@Test
	void testSkillsTestSetUpSkillScoresCustomHero0_4() {
		assertEquals(4, drew.getArrayListSkill().get(0).getSkill());
		assertEquals(0, drew.getArrayListSkill().get(1).getSkill());
		assertEquals(-7, drew.getArrayListSkill().get(2).getSkill());
		assertEquals(-1, drew.getArrayListSkill().get(3).getSkill());
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
		assertEquals(0, drew.getArrayListSkill().get(17).getSkill());
	}

}