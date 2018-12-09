package character.testing.race;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.race.Human;
import character.size.Medium;

class TestHuman {
	Human me = new Human();

	@Test
	void testSpecialAbility() {
		assertEquals("Humans are special ", me.specialAbility());
	}

	@Test
	void testGetSize() {
		Medium med = new Medium();
		assertEquals(med.getClass(), me.getSize().getClass());
	}
	
	@Test
	void testGetSpeedDefault() {
		assertEquals(30, this.me.getSpeed());
	}
	
	@Test
	void testGetSpeedCustom() {
		me.setSpeed(-1000);
		assertEquals(30, this.me.getSpeed());
		me.setSpeed(55);
		assertEquals(55, this.me.getSpeed());
	}
	
	@Test
	void testHeightDesc() {
		me.setSizeText("I am 5ft");
		assertEquals("I am 5ft", me.getSize().getHeightDescription());
	}
	
	@Test
	void testDefaultToString() {
		assertEquals("Human, Speed 30, Between 4 and 7 feet tall ", me.toString());
	}

}
