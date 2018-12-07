package equipment.weapon;

import character.abilities.Ability;
import character.abilities.Strength;
import dnd.damage.Damage;

public class Unarmed extends MeleeWeapon{
	private int bonusDamage = 0;
	Ability str = new Strength();
	
	@Override
	public int getDamage() {
		return 1;
	}

	@Override
	public int getDamageBonus() {
		return this.bonusDamage;
	}

	@Override
	public Damage getDamageType() {
		//Needs to be bludgeoning
		return null;
	}

	@Override
	public Ability getAbilityUsed() {
		return this.str;
	}

	@Override
	public boolean isFinesse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLight() {
		return true;
	}
	
	@Override
	public boolean isReach() {
		return false;
	}

	@Override
	public boolean isThrown() {
		return false;
	}

	@Override
	public boolean isVersatile() {
		return false;
	}

	public void setDamageBonus(Ability strDamageBonus) {
		if(strDamageBonus.getClass().equals(this.str.getClass())) {
		this.bonusDamage = strDamageBonus.getAbilityBonus();
		} 
	}

	@Override
	public int getDiceSize() {
		return 0;
	}

	@Override
	public boolean isMartial() {
		return false;
	}

	@Override
	public boolean isHeavy() {
		return false;
	}

	@Override
	public boolean isTwoHanded() {
		return false;
	}

	@Override
	public double getWeight() {
		return 0;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public boolean isRange() {
		return false;
	}

}
