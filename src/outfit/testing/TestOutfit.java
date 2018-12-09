package outfit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.build.Character;
import character.classType.Fighter;
import character.race.Human;
import character.race.Race;
import equipment.weapon.Unarmed;
import equipment.weapon.WeaponGreatAxe;
import outfit.Outfit;

class TestOutfit {
	Fighter fighter = new Fighter();
	Race human = new Human();
	Unarmed hand = new Unarmed();
	Character frank = new Character("Frank", 12, 12, 12, 12, 12, 12, human, fighter, 1);
	WeaponGreatAxe axe = new WeaponGreatAxe();

	/**
	 * These test will insure that Outfit is able to set the gear needed for
	 * Characters
	 */
	@Test
	void testOutFitCharactorWithGreatAxeHandsFilled() {
		Outfit outfit = new Outfit(this.frank);
		outfit.fillLeftHand(axe);
		assertEquals(this.frank.getLeftHand().isHandFull(), true);
		assertEquals(this.frank.getRightHand().isHandFull(), true);
	}

	@Test
	void testOutFitCharactorWithGreatAxeBothHandsHoldAxe() {
		Outfit outfit = new Outfit(this.frank);
		outfit.fillLeftHand(axe);
		assertEquals(this.frank.getLeftHand().getItem(), this.axe);
		assertEquals(this.frank.getRightHand().getItem(), this.axe);
	}
	
	@Test
	void testOutfitCharacterNoWeapons() {
		assertEquals(this.frank.getLeftHand().isHandFull(), false);
		assertEquals(this.frank.getRightHand().isHandFull(), false);
		assertEquals(this.frank.getLeftHand().getItem().getClass(), this.hand.getClass());
		assertEquals(this.frank.getRightHand().getItem().getClass(), this.hand.getClass());
	}
	
	@Test
	void testOutFitCharacterRemoveTwoHandWeaponShouldGetUnArmedLeftHandDropped() {
		Outfit outfit = new Outfit(this.frank);
		outfit.fillRightHand(axe);
		assertEquals(this.frank.getLeftHand().getItem(), this.axe);
		assertEquals(this.frank.getRightHand().getItem(), this.axe);
		outfit.dropLeftHandItem();
		assertEquals(this.frank.getLeftHand().getItem().getClass(), this.hand.getClass());
		assertEquals(this.frank.getRightHand().getItem().getClass(), this.hand.getClass());
	}
	
	@Test
	void testOutFitCharacterRemoveTwoHandWeaponShouldGetUnArmedRightHandDropped() {
		Outfit outfit = new Outfit(this.frank);
		outfit.fillLeftHand(axe);
		assertEquals(this.frank.getLeftHand().getItem(), this.axe);
		assertEquals(this.frank.getRightHand().getItem(), this.axe);
		outfit.dropRightHandItem();
		assertEquals(this.frank.getLeftHand().getItem().getClass(), this.hand.getClass());
		assertEquals(this.frank.getRightHand().getItem().getClass(), this.hand.getClass());
	}


}
