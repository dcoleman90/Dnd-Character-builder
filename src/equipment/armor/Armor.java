package equipment.armor;

import equipment.weapon.Equipment;

public abstract class Armor implements Equipment{
	private int armorClass;
	private boolean isMaxDexBonus;
	private int maxDexBonus;
	/**
	 * This is the default constructor
	 */
	public Armor() {
		this.armorClass = 10;
	}
	
	public abstract boolean isLightArmor();
	public abstract boolean isHeavyArmor();
	public abstract boolean isMediumArmor();
	public abstract boolean isStealthDisadvantage();
	public abstract int getStrengthScoreRequirement();
		
	/**
	 * Some Armors like light armor have no max dex bonus - so I would like to remove the stipulation of returns 1000 - which is obviously stupid
	 * @return
	 */
	public int isThereMaxDexBonus() {
		if (this.isMaxDexBonus) {
			return this.maxDexBonus;
		} 
		return 1000;
	};

	
	public int getArmorClass() {
		return armorClass;
	}
	
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	

	
	public boolean isMaxDexBonus() {
		return isMaxDexBonus;
	}

	public void setMaxDexBonus(boolean isMaxDexBonus) {
		this.isMaxDexBonus = isMaxDexBonus;
	}

	public int getMaxDexBonus() {
		return maxDexBonus;
	}

	public void setMaxDexBonusValue(int maxDexBonus) {
		this.maxDexBonus = maxDexBonus;
	}

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


}
