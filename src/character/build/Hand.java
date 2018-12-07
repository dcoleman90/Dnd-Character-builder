package character.build;

import equipment.weapon.Equipment;

public class Hand {
	private Equipment item;
	private boolean isHandFull;

	public Hand() {
		this.item = null;
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
		this.item = null;
		this.isHandFull = false;
	}
	
	public Equipment getItem() {
		return this.item;
	}
	
	public boolean isHandFull() {
		return this.isHandFull;
	}
}
