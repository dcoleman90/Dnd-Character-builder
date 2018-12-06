package character.testing.equipment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.equipment.WeaponGreatAxe;
import dnd.damage.Slashing;
import dnd.dice.Dice;

class TestWeaponGreatAxe {
	WeaponGreatAxe ax = new WeaponGreatAxe();
	private Dice OneD12 = new Dice(1);
	private Slashing slash = new Slashing();

	
	/**
	 * This set of test will insure that the GreatAxe returns all the expected
	 * results
	 */
	@Test
	void testGreatAxeDiceSlashAndReach() {
		assertEquals(this.ax.isReach(), false);
	}

}
