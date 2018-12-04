package character.race;

import character.abilities.Ability;
import character.size.Size;

public interface Race {
	int abilityScoreAlterations(Ability acceptedAbility);
	Size getSize();
	void setSizeText(String sizeText);
	int getSpeed();
	String specialAbility();
	String toString();
}
