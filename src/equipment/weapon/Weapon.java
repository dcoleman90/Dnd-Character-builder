package equipment.weapon;

import character.abilities.Ability;
import dnd.damage.Damage;

public abstract class Weapon extends Equipment {
	public abstract int getDamage();

	public abstract int getDamageBonus();

	public abstract Damage getDamageType();

	public abstract Ability getAbilityUsed();

	public abstract void setAbilityUsed(Ability used);

	public abstract boolean isAmmunition();

	public abstract boolean isFinesse();

	public abstract boolean isLoading();

	public abstract boolean isRange();

	public abstract boolean isReach();

	public abstract boolean isThrown();

	public abstract boolean isVersatile();
	
	public abstract boolean isSimple();

	public abstract void setDamageBonus(Ability damageBonus);

	public abstract int getDiceSize();

	public abstract boolean isMartial();

}
