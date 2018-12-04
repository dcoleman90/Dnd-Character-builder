package character.race;

import character.abilities.Ability;

public interface Race {
	public int abilityScoreAlterations(Ability acceptedAbility);
	public float getsize();
	public int getSpeed();
	public String specialAbility();
}
