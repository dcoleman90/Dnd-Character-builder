package character.abilities;

public class Strength extends Ability {
	
	public Strength() {
		super();
	}
	
	public Strength(int acceptedStrengthScore) {
		super(acceptedStrengthScore);
	}
	
	@Override
	public String toString() {
		return  super.toString() + " Strength ";
	}
}
