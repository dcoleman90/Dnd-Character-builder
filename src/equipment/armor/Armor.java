package equipment.armor;

import equipment.weapon.Equipment;

public abstract class Armor implements Equipment{
	private int armorClass;
		
	/**
	 * The override classes remove the N/A elements of Equipment
	 */
	@Override
	public boolean isHeavyWeapon() {
		return false;
	}

	@Override
	public boolean isTwoHanded() {
		return false;
	}

	@Override
	public boolean isLightWeapon() {
		return false;
	}
	
	/**
	 * This is the default constructor
	 */
	public Armor() {
		this.armorClass = 10;
	}
	
	public Armor(int armorClass) {
		this.armorClass = armorClass; 
	}
	
	public abstract boolean isLightArmor();
	public abstract boolean isHeavyArmor();
	public abstract boolean isMediumArmor();
	public abstract boolean isStealthDisadvantage();
	public abstract int getStrengthScoreRequirement();

	
	public int getArmorClass() {
		return armorClass;
	}
	
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	
	

}
