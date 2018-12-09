package character.testing.skills;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import character.skills.Arcana;

class TestSkill {
	
	
	/**
	 * Test individual constructor
	 */
	@Test
	void testCheckSkillArcana() {
		Arcana arc = new Arcana(3);
		assertEquals(arc.getSkill(), 3);
	}
	
	/**
	 * Test addSkill method
	 */
	@Test
	void testCheckSkillArcanaAddMethod() {
		Arcana arc = new Arcana(3);
		arc.addSkill(5);
		assertEquals(arc.getSkill(), 8);
	}
	
	/**
	 * Test individual constructor with 0
	 */
	@Test
	void testCheckSkillArcanaZero() {
		Arcana arc = new Arcana(0);
		assertEquals(arc.getSkill(), 0);
	}
	
	/**
	 * Test individual constructor
	 */
	@Test
	void testCheckSkillArcana8() {
		Arcana arc = new Arcana(8);
		assertEquals(arc.getSkill(), 8);
	}
	
}
