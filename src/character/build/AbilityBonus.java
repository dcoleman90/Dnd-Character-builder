package character.build;

import character.abilities.Ability;

public class AbilityBonus {
	
	public int returnBonus(Ability acceptedAbility) {
		int returnedAbilityBonus = (acceptedAbility.getScore() - 10) / 2;
		return returnedAbilityBonus;
	}
}
