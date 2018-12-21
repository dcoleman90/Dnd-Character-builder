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
	private boolean isProfSavingThrow;
		
	public Ability() {
		this.abilityScore = 10; 
	}
	
	public Ability(int acceptedAbilityScore) {
		if (acceptedAbilityScore <= 0 || acceptedAbilityScore >= 31) {
			this.abilityScore = 10;
		} else {
		this.abilityScore = acceptedAbilityScore;
		}
	} 
	
	public int getScore() { 
		return this.abilityScore;
	}
	
	public void addScore(int amountAbilityScoreIsModifiedBy) {
		int newScore = this.abilityScore += amountAbilityScoreIsModifiedBy;
		if (newScore <= 1) {
			this.abilityScore = 1;
		} else if (newScore >=30) {
			this.abilityScore = 30;
		} else {
			this.abilityScore = newScore;
		};   
	}
	
	public String toString() {
		return "" + this.abilityScore;
	}
	
	public int getAbilityBonus() {
		switch(this.abilityScore) {
		case 1:
			return -5;
		case 2:
			return -4;
		case 3:
			return -4;
		case 4:
			return -3;
		case 5:
			return -3;
		case 6:
			return -2;
		case 7:
			return -2;
		case 8:
			return -1;
		case 9:
			return -1;
		case 10:
			return 0;
		case 11:
			return 0;
		case 12:
			return 1;
		case 13:
			return 1;
		case 14:
			return 2;
		case 15:
			return 2;
		case 16:
			return 3;
		case 17:
			return 3;
		case 18:
			return 4;
		case 19:
			return 4;
		case 20:
			return 5;
		case 21:
			return 5;
		case 22:
			return 6;
		case 23:
			return 6;
		case 24:
			return 7;
		case 25:
			return 7;
		case 26:
			return 8;
		case 27:
			return 8;
		case 28:
			return 9;
		case 29:
			return 9;
		case 30:
			return 10;
		}
	 return -20;
	}

	public boolean isProfSavingThrow() {
		return isProfSavingThrow;
	}
	

	public void setProfSavingThrow(boolean isProfSavingThrow) {
		this.isProfSavingThrow = isProfSavingThrow;
	}
}
