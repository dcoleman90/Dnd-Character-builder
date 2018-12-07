package outfit;

import equipment.weapon.Equipment;
import equipment.weapon.Unarmed;
import character.build.Character;

/**
 * This class outfits the character with equipment
 * 
 * @author Drew Coleman
 * @version 12/06/2018
 *
 */
public class Outfit {
	private Character player;
	private Unarmed emptyHand;
	private Equipment item1;
	private Equipment item2;

	public Outfit(Character playerCharacter) {
		this.emptyHand = new Unarmed();
		if (playerCharacter != null) {
			this.player = playerCharacter;
		}
		this.fillLeftHand(emptyHand);
		this.fillRightHand(emptyHand);
	}

	public void fillRightHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		}
		if (this.item1.isTwoHanded()) {
			this.dropLeftHandItem();;
		}
		this.dropRightHandItem();
		this.item1 = item;
		this.player.getRightHand().addItem(this.item1);
	}

	public void fillLeftHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		}
		if (this.item2.isTwoHanded()) {
			this.dropRightHandItem();
		}
		this.dropLeftHandItem();
		this.item2 = item;
		this.player.getLeftHand().addItem(this.item2);
	}

	private void fillBothHands(Equipment item) {
		this.dropLeftHandItem();
		this.dropRightHandItem();
		this.item1 = item;
		this.player.getRightHand().addItem(this.item1);
		this.player.getLeftHand().addItem(this.item1);
	}

	private void dropLeftHandItem() {
		this.player.getLeftHand().removeItem();
	}

	private void dropRightHandItem() {
		this.player.getRightHand().removeItem();
	}

}
