package outfit;

import equipment.weapon.Equipment;
import equipment.weapon.Unarmed;
import equipment.armor.Armor;
import equipment.armor.ArmorPadded;
import equipment.armor.UnArmored;
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
	private Armor armor;
	private UnArmored unArmored;

	public Outfit(Character playerCharacter) {
		this.emptyHand = new Unarmed();
		
		if (playerCharacter != null) {
			this.player = playerCharacter;
			this.unArmored= new UnArmored(this.player.getDex().getAbilityBonus());
		}
		this.donArmor(this.unArmored);
		this.fillLeftHand(this.emptyHand);
		this.fillRightHand(this.emptyHand);
	}
	
	public Outfit(Character playerCharacter, Armor armor, Equipment equipment1, Equipment equipment2) {
		if (playerCharacter != null) {
			this.player = playerCharacter;
		}
		if (armor != null) {
			this.armor = armor;
		}
		if (equipment1 != null) {
			this.item1 = equipment1;
		}
		if (equipment2 != null) {
			this.item2 = equipment2;
		}
		this.donArmor(this.armor);
		this.fillLeftHand(this.item1);
		this.fillRightHand(this.item2);
	}

	/**
	 * The following methods are for hands - insuring that two handed weapons are held by both hands and allowing the dropping of weapons
	 * @param item
	 */
	public void fillRightHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		} else {
			this.dropRightHandItem();
			this.item1 = item;
			this.player.getRightHand().addItem(item);
			if (item.getClass().equals(emptyHand.getClass())) {
				this.player.getRightHand().setIsHandEmpty(false);
			}
		}
	}

	public void fillLeftHand(Equipment item) {
		if (item.isTwoHanded()) {
			this.fillBothHands(item);
		} else {
			this.dropLeftHandItem();
			this.item2 = item;
			this.player.getLeftHand().addItem(this.item2);
			if (item.getClass().equals(emptyHand.getClass())) {
				this.player.getLeftHand().setIsHandEmpty(false);
			}
		}
	}

	private void fillBothHands(Equipment item) {
		this.player.getRightHand().removeItem();
		this.player.getLeftHand().removeItem();
		this.item1 = item;
		this.player.getRightHand().addItem(this.item1);
		this.player.getLeftHand().addItem(this.item1);
	}

	private void dropBothHands() {
		this.player.getRightHand().removeItem();
		this.player.getLeftHand().removeItem();
	}

	public void dropLeftHandItem() {
		if (this.player.getRightHand().getItem().isTwoHanded()) {
			this.dropBothHands();
		} else {
			this.player.getLeftHand().removeItem();
		}
	}

	public void dropRightHandItem() {
		if (this.player.getLeftHand().getItem().isTwoHanded()) {
			this.dropBothHands();
		} else {
			this.player.getRightHand().removeItem();
		}
	}
	
	
	/**
	 * These methods allow players to outfit armor
	 * @param armorDon
	 */
	private void donArmor(Armor armorDon) {
		if (armorDon != null) {
			this.armor = armorDon;
		}

		
		this.player.setArmor(this.armor);
	}
	
		public Armor getPlayerArmor() {
		return this.armor;
	}
		
		
	public Character  getCharacter() {
		return this.player;
	}

}
