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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String specialAbility() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int abilityScoreAlterations(Ability acceptedAbility) {
		return 1;
	}

}
