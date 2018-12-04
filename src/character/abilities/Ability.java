package character.abilities;

/**
 * This class will be the parent to all the other abilities and insure that they
 * have the correct methods
 * 
 * @author Drew Coleman
 * @version 12/04/19
 *
 */
public abstract class Ability {
	private int abilityScore;
		
	public Ability() {
		this.abilityScore = 10;
	}
	
	public Ability(int acceptedAbilityScore) {
		this.abilityScore = acceptedAbilityScore;
	} 
	
	public int getScore() {
		return this.abilityScore;
	}
	
	public void addScore(int amountAbilityScoreIsModifiedBy) {
		this.abilityScore += amountAbilityScoreIsModifiedBy;  
	}
}
