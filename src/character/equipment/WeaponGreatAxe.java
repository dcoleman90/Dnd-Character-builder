package character.equipment;

import dnd.damage.Damage;
import dnd.damage.Slashing;
import dnd.dice.Dice;

public class WeaponGreatAxe extends HeavyMeleeWeapon {
	private Dice OneD12 = new Dice(12);
	private Slashing slash = new Slashing();

	@Override
	public int getDamage() {
		return this.OneD12.rollDice(1);
	}

	@Override
	public Damage getDamageType() {
		return this.slash;
	}

	@Override
	public boolean isReach() {
		return false;
	}

	@Override
	public int getDiceSize() {
		return this.OneD12.diceSize();
	}

	@Override
	public double getWeight() {
		return 7.0;
	}
}