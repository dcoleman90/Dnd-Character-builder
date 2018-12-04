package character.abilities;

public class Dexterity extends Ability {
	
	public Dexterity() {
		super();
	}
	
	public Dexterity(int acceptedDexterityScore) {
		super(acceptedDexterityScore);
	}
	
	@Override
	public String toString() {
		return  super.toString() + " Dexterity ";
	}
}