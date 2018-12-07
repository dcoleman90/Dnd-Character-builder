package outfit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.build.Character;
import character.classType.Fighter;
import character.race.Human;
import character.race.Race;
import equipment.weapon.WeaponGreatAxe;
import outfit.Outfit;

class TestOutfit {
	Fighter fighter = new Fighter();
	Race human = new Human();
	Character frank = new Character("Frank", 12, 12, 12, 12, 12, 12, human, fighter, 1);
	WeaponGreatAxe axe = new WeaponGreatAxe();

	/**
	 * These test will insure that Outfit is able to set the gear needed for
	 * Characters
	 */
	@Test
	void testOutFitCharactorWithGreatAxe() {
		Outfit outfit = new Outfit(this.frank);
		outfit.fillLeftHand(axe);
		assertEquals(this.frank.getLeftHand().isHandFull(), true);
		assertEquals(this.frank.getRightHand().isHandFull(), true);
	}

}
