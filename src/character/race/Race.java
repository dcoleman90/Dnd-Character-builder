package character.race;

import character.abilities.Ability;
import character.size.Size;

public interface Race {
	int abilityScoreAlterations(Ability acceptedAbility);
	Size getSize();
	int getSpeed();
	String specialAbility();
	void setSize(Size acceptedSize);
	String toString();
}
