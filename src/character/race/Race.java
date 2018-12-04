package character.race;

import character.abilities.Ability;

public interface Race {
	int abilityScoreAlterations(Ability acceptedAbility);
	float getSize();
	int getSpeed();
	String specialAbility();
	void setSize(float acceptedSize);
	String toString();
}
