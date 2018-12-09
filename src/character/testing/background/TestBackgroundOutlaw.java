package character.testing.background;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.background.BackgroundOutlander;
import character.skills.Athletics;
import character.skills.Skill;
import character.skills.Survival;

class TestBackgroundOutlaw {
	BackgroundOutlander out = new BackgroundOutlander();
	
	@Test
	void testGetTitle() {
		assertEquals("Outlander ", out.getBackgroundTitle());
	}

	@Test
	void testGetDescription() {
		assertEquals(" You grew up in the wild ", out.getbackGroundDescription());
	}
	
	@Test
	void testGetFeature() {
		assertEquals("Wanderer ", out.getFeature());
	}
	
	@Test
	void testSkillProf1() {
		Skill ath = new Athletics(0);
		assertEquals(ath.getClass(), out.getSkillProf1().getClass());
	}
	
	@Test
	void testSkillProf2() {
		Skill sur = new Survival(0);
		assertEquals(sur.getClass(), out.getSkillProf2().getClass());
	}
}



