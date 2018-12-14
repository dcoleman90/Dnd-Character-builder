package equipment.weapon;

import character.abilities.Ability;
import character.abilities.Strength;

public abstract class HeavyMeleeWeapon extends MeleeWeapon {
	private int bonusDamage;
	Ability str = new Strength();

	public HeavyMeleeWeapon() {
		this.bonusDamage = 0;
	}

	@Override
	public boolean isTwoHanded() {
		return true;
	}

	@Override
	public boolean isHeavyWeapon() {
		return true;
	}

	@Override
	public boolean isLightWeapon() {
		return false;
	}

	@Override
	public boolean isRange() {
		return false;
	}

	@Override
	public boolean isSpecial() {
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

	@Override
	public boolean isFinesse() {
		return false;
	}

	@Override
	public void setDamageBonus(Ability strDamageBonus) {
		if (strDamageBonus.getClass().equals(this.str.getClass())) {
			this.bonusDamage = strDamageBonus.getAbilityBonus();
		}
	}

	@Override
	public int getDamageBonus() {
		return this.bonusDamage;
	}

	@Override
	public boolean isMartial() {
		return true;
	}

	@Override
	public boolean isSimple() {
		return false;
	}
}
