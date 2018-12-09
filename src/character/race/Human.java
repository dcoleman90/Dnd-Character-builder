package character.race;

import character.abilities.Ability;

public class Human extends RaceMedium {
	int speed = 30;
	
	public int getSpeed() {
		return this.speed;
	}

	public String specialAbility() {
		return "Humans are special ";
	}

	public int abilityScoreAlterations(Ability acceptedAbility) {
		return 1;
	}

	public String toString() {
		return "Human, Speed " + this.getSpeed() + ", " + this.getSize().getHeightDescription();
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > 0 ) {
			this.speed = speed;
		}
	}
}
