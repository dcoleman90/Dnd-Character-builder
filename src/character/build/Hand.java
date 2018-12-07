package character.build;

import equipment.weapon.Equipment;
import equipment.weapon.Unarmed;

public class Hand {
	private Equipment item;
	private Unarmed emptyHand;
	private boolean isHandFull;

	public Hand() {
		this.emptyHand = new Unarmed();
		this.item = this.emptyHand;
		this.isHandFull = false;
	}

	public Hand(Equipment item) {
		if (item != null) {
			this.item = item;
		}
		this.isHandFull = true;
	}
	
	public void addItem(Equipment item) {
		if (item != null) {
			this.item = item;
		}
		this.isHandFull = true;
	}
	
	public void removeItem() {
		this.item = this.emptyHand;
		this.isHandFull = false;
	}
	
	public Equipment getItem() {
		return this.item;
	}
	
	public boolean isHandFull() {
		return this.isHandFull;
	}
}
