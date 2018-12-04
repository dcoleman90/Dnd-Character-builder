package character.race;

import character.abilities.Ability;

public class Human implements Race {

	@Override
	public float getsize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
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

}
