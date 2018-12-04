package character.size;

public class Medium extends Size {
	private String heightDescription;

	public Medium() {
		this.heightDescription = "Between 5 and 7 feet tall";
	}

	public Medium(String height) {
		this.heightDescription = height;
	}
	
	@Override
	public String getHeightDescription() {
		return this.heightDescription;
	}
}
