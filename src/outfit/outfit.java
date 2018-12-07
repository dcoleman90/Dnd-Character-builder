package outfit;

import equipment.weapon.Equipment;
import character.build.Character;

/**
 * This class outfits the character with equipment
 * 
 * @author Drew Coleman
 * @version 12/06/2018
 *
 */
public class outfit {
	private Character player;
	private Equipment item1;
	private Equipment item2;

	public outfit(Character playerCharacter) {
		if (playerCharacter != null) {
			this.player = playerCharacter;
		}
	}

	public void fillRightHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		}
		this.dropRightHandItem();
		this.item1 = item;
		this.player.getRightHand().addItem(this.item1);
	}

	public void fillLeftHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		}
		this.dropLeftHandItem();
		this.item2 = item;
		this.player.getLeftHand().addItem(this.item2);
	}

	private void fillBothHands(Equipment item) {
		this.dropLeftHandItem();
		this.dropRightHandItem();
		this.fillLeftHand(item);
		this.fillRightHand(item);
	}

	private void dropLeftHandItem() {
		this.player.getLeftHand().removeItem();
	}

	private void dropRightHandItem() {
		this.player.getRightHand().removeItem();
	}

}
