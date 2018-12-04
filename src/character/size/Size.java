package character.size;

public abstract class Size {
	private String size;
	private int sizeCatagory;
	
	public Size() {
		this.size = "Medium";
		this.sizeCatagory = 0;
	}
	
	public int getSizeCatagory() {
		return this.sizeCatagory;
	}

	public String getHeightDescription() {
		return this.size;
	}
}

