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

	public String toString() {
		return " Human, Speed " + this.getSpeed() + ", " + this.humanSize.getHeightDescription();
	}

	/**
	 * The height of Medium creatures is not equal - thus it accepts FLAVOR text to
	 * get the override the default Med size
	 */
	@Override
	public void setSizeText(String sizeText) {
		this.humanSize = new Medium(sizeText);
	}
}
