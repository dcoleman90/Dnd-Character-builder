package character.race;

import character.abilities.Ability;
import character.size.Medium;
import character.size.Size;

public class Human implements Race {
	Size humanSize = new Medium();
	
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

	public Size getSize() {
		return humanSize;
	}

	@Override
	public void setSize(Size acceptedSize) {
		this.humanSize = acceptedSize;
	}
	
	public String toString() {
		return " Human ";
	}
}
