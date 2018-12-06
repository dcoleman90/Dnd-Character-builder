package character.equipment;

import character.abilities.Ability;
import dnd.damage.Damage;

public abstract class Weapon {
	public abstract int getDamage();
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
	public abstract double getWeight();
	public abstract int getDiceSize();
	public abstract boolean isMartial();
	
}
