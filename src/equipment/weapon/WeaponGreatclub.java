package equipment.weapon;

import dnd.damage.Bludgeoning;
import dnd.damage.Damage;
import dnd.dice.Dice;

public class WeaponGreatclub extends HeavyMeleeWeapon {
	private Dice OneD8 = new Dice(8);
	Bludgeoning bludge = new Bludgeoning();

	@Override
	public int getDamage() {
		return this.OneD8.rollDice(1);
	}

	@Override
	public Damage getDamageType() {
		return this.bludge;
	}

	@Override
	public boolean isReach() {
		return false;
	}

	@Override
	public int getDiceSize() {

		return 8;
	}

	@Override
	public double getWeight() {
		return 10;
	}

	@Override
	public boolean isSimple() {
		return true;
	}

	@Override
	public boolean isMartial() {
		return false;
	}

	@Override
	public String cost() {
		return "2 Silver pieces ";
	}

	@Override
	public String name() {
		return "Great Club ";
	}

}
