package character.size;

public abstract class Size {
	private String heightDescription;
	private String sizeCatagory;
	private int sizeRating;
	
	public Size() {}
	
	public int getSizeRating() {
		return this.sizeRating;
	}
	
	public void setSizeRating(int sizeRating) {
		this.sizeRating = sizeRating;
	}

	public void setSizeCatagory(String sizeCatagory) {
		this.sizeCatagory = sizeCatagory;
	}
	
	public String getSizeCatagory() {
		return this.sizeCatagory;
	}
	
	public void
	setHeightDescription(String heightDescription) {
		this.heightDescription = heightDescription;
	}

	public String getHeightDescription() {
		return this.heightDescription;
	}
}

