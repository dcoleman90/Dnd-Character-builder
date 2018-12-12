package character.race;

import character.abilities.Ability;
import character.size.Size;

public abstract class Race {
	
	public abstract int abilityScoreAlterations(Ability acceptedAbility);
	
	public abstract Size getSize();

	public abstract void setSizeText(String sizeText);

	public abstract int getSpeed();

	public abstract void setSpeed(int speed);

	public abstract String specialAbility();

	public abstract String toString();
	
}
