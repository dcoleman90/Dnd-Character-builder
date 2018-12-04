package character.race;

import character.abilities.Ability;

public class Human implements Race {
	float size = 0;
	
	public int getSpeed() {
		return 30;
	}

	@Override
	public String specialAbility() {
		return " Humans are special";
	}

	@Override
	public int abilityScoreAlterations(Ability acceptedAbility) {
		return 1;
	}

	@Override
	public float getSize() {
		return size;
	}

	@Override
	public void setSize(float acceptedSize) {
		if (acceptedSize > 0) {
			this.size = acceptedSize;
		}
	}
	
	public String toString() {
		return " Human ";
	}
}
