package character.race;

import character.abilities.Ability;
import character.abilities.Dexterity;
import character.abilities.Wisdom;

public class WoodElf extends RaceMedium {
	int speed = 35;
	Ability dex = new Dexterity();
	Ability wis = new Wisdom();

	public int getSpeed() {
		return this.speed;
	}

	@Override
	public int abilityScoreAlterations(Ability acceptedAbility) {
		if (acceptedAbility.getClass().equals(this.dex.getClass())) {
			return 2;
		} else if (acceptedAbility.getClass().equals(this.wis.getClass())) {
			return 1;
		} else
			return 0;
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	@Override
	public String specialAbility() {
		return "Wood Elves live a long time and have keen senses and intuition ";
	}

	@Override
	public String toString() {
		return "WoodElf, Speed " + this.getSpeed() +  ", " + this.getSize().getHeightDescription();
	}

}
