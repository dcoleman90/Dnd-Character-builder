package character.abilities;

public class Intelligence extends Ability {
	
	public Intelligence() {
		super();
	}
	
	public Intelligence(int acceptedIntelligenceScore) {
		super(acceptedIntelligenceScore);
	}
	
	@Override
	public String toString() {
		return  super.toString() + " Intelligence ";
	}
	
}