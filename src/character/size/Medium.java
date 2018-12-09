package character.size;

public class Medium extends Size {
	
	public Medium() {
		super.setSizeCatagory("Medium ");
		super.setSizeRating(0);
		super.setHeightDescription("Between 4 and 7 feet tall ");
	}
	
	public Medium(String heightDescription) {
		this();
		super.setHeightDescription(heightDescription);
	}
}
