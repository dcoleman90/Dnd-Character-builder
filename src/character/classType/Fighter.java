package character.classType;

public class Fighter extends ClassType {
	
	/**
	 * Fighters start with 10 hitpoints plus a number 1-10 randomly for each level beyond the first
	 */
	public void setHitPoints(int level, int conBonus) {
		super.setHitPoints(level, 10, conBonus);		
	}

	@Override
	public String specialAbilities(int level) {
		return super.specialAbilities(level) + " Fighter";
	}

}
