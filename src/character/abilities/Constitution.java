package character.abilities;

public class Constitution extends Ability {
	
	public Constitution() {
		super();
	}
	
	public Constitution(int acceptedConstitutionScore) {
		super(acceptedConstitutionScore);
	}
	
	@Override
	public String toString() {
		return  super.toString() + " Constitution ";
	}
}

