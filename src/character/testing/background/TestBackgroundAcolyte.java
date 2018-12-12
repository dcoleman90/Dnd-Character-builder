package character.testing.background;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import character.background.BackgroundAcolyte;
import character.skills.Insight;
import character.skills.Religion;
import character.skills.Skill;

public class TestBackgroundAcolyte {
	BackgroundAcolyte acolyte = new BackgroundAcolyte();
	
	@Test
	void testGetTitle() {
		assertEquals("Acolyte ", acolyte.getBackgroundTitle());
	}

	@Test
	void testGetDescription() {
		assertEquals("You have spent your life in the service of a temple ", acolyte.getbackGroundDescription());
	}
	
	@Test
	void testGetFeature() {
		assertEquals("Shelter of the Faithful ", acolyte.getFeature());
	}
	
	@Test
	void testSkillProf2() {
		Skill religion = new Religion(0);
		assertEquals(religion.getClass(), acolyte.getSkillProf2().getClass());
	}
	
	@Test
	void testSkillProf1() {
		Skill insight = new Insight(0);
		assertEquals(insight.getClass(), acolyte.getSkillProf1().getClass());
	}
}
