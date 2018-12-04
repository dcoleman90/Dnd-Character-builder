package character.abilities;

public class Charisma  extends Ability {
	
	public Charisma() {
		super();
	}
	
	public Charisma(int acceptedCharismaScore) {
		super(acceptedCharismaScore);
	}
	
	@Override
	public String toString() {
		return  super.toString() + " Charisma ";
	}
}
