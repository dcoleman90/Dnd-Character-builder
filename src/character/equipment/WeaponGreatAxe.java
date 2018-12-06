package character.equipment;

import dnd.damage.Damage;
import dnd.damage.Slashing;
import dnd.dice.Dice;

public class WeaponGreatAxe extends HeavyMeleeWeapon {
	private Dice OneD12 = new Dice(1);
	private Slashing slash = new Slashing();

	@Override
	public Dice getDamageDice() {
		return this.OneD12;
	}


	@Override
	public Damage getDamageType() {
		return this.slash;
	}

	@Override
	public boolean isReach() {
		return false;
	}
}