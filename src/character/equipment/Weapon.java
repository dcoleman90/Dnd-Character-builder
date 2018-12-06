package character.equipment;

import character.abilities.Ability;
import dnd.damage.Damage;

public abstract class Weapon {
//	private int damageDice;
//	private Damage damageType;
//	private Ability used;
//	private boolean isAmmunition;
//	private boolean isFinesse;
//	private boolean isHeavy;
//	private boolean isLight;
//	private boolean isLoading;
//	private boolean isRange;
//	private boolean isReach;
//	private boolean isSpecial;
//	private boolean isThrown;
//	private boolean isTwoHanded;
//	private boolean isVersatile;
//	private short weight;
	
	public abstract int getDamage();
	//public abstract void setDamageBonus(Ability damageBonus);
	public abstract int getDamageBonus();
	public abstract Damage getDamageType();
	public abstract Ability getAbilityUsed();
	public abstract void setAbilityUsed(Ability used);
	public abstract boolean isAmmunition();
	public abstract boolean isFinesse();
	public abstract boolean isHeavy();
	public abstract boolean isLight();
	public abstract boolean isLoading();
	public abstract boolean isRange();
	public abstract boolean isReach();
	public abstract boolean isSpecial();
	public abstract boolean isThrown();
	public abstract boolean isTwoHanded();
	public abstract void setTwoHanded(boolean isTwoHanded);
	public abstract boolean isVersatile();
	public abstract void setDamageBonus(Ability damageBonus);
	public abstract int getDiceSize();
	
}
