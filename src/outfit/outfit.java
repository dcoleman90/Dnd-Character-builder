package outfit;

/**
 * This class outfits the character with equipment
 * @author Drew Coleman
 * @version 12/06/2018
 *
 */
public class outfit {
	private Character player;
	
	public outfit(Character playerCharacter) {
		if (playerCharacter != null) {
			this.player = playerCharacter;
		}
	}
}
