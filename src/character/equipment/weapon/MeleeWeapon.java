package character.equipment.weapon;

import character.abilities.Ability;
import character.abilities.Strength;

public abstract class MeleeWeapon extends Weapon {
	Ability str = new Strength();

	@Override
	public boolean isAmmunition() {
		return false;
	}

	@Override
	public boolean isLoading() {
		return false;
	}

	@Override
	public Ability getAbilityUsed() {
		return this.str;
	}

	@Override
	public void setAbilityUsed(Ability used) {
		if (this.isFinesse()) {
			this.str = used;
		} 

	}

}
