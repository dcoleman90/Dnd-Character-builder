package character.race;

import character.size.Medium;
import character.size.Size;

public abstract class RaceMedium extends Race{
	Size medium = new Medium();
	
	/**
	 * The height of Medium creatures is not equal - thus it accepts FLAVOR text to
	 * get the override the default Med size
	 */
	public void setSizeText(String sizeText) {
		this.medium.setHeightDescription(sizeText);
	}
	
	public Size getSize() {
		return medium;
	}

}
