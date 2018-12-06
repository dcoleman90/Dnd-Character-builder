package dnd.damage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dnd.damage.Damage;
import dnd.damage.Slashing;

class TestDamage {
	Damage slash = new Slashing();
	
	/**
	 * These test will insure that damage returns the expected toString result
	 */
	@Test
	void testSlashDamageToString() {
		assertEquals(slash.getDamageType(), "Damage Slashing ");
		}

}
