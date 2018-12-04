package character.abilities;

public class Wisdom extends Ability {
	
	public Wisdom() {
		super();
	}
	
	public Wisdom(int acceptedWisdomScore) {
		super(acceptedWisdomScore);
	}

	@Override
	public String toString() {
		return  super.toString() + " Wisdom ";
	}
}