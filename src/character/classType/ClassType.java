package character.classType;

import java.util.Random;

import character.skills.Skills;

public abstract class ClassType {
	private int hitPoints;
	private Random random;
	
	public ClassType() {
		this.hitPoints = 0;
		this.random = new Random();
	}
	
	public void setHitPoints(int level, int hitDice, int conBonus) {
		this.hitPoints = hitDice + conBonus;
		for (int count = 1; count < level; count++) {
			this.hitPoints += (random.nextInt(hitDice) + 1) + conBonus;
		}
	}

	public int getHitPoints() {
		return this.hitPoints;
	}

	public int getProficiencyBonus(int level) {
		return 2;
		 
	}

	public String specialAbilities(int level) {
		return "Not working";
	}
	
	public Skills proficentSkills() {
		return null;
	}
}
