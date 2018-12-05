package character.classType;

import java.util.ArrayList;
import java.util.Random;

import character.skills.Skill;

public abstract class ClassType {
	private int hitPoints;
	private Random random;
	private int profBonus;
	private int numberClassSkills;

	public ClassType() {
		this.hitPoints = 0;
		this.random = new Random();
		this.numberClassSkills = 2;
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
		profBonus = 2;
		return profBonus;
	}

	public String specialAbilities(int level) {
		return "Not working";
	}
	
	public void decreaseNumberOfClassSkillsByOne() {
		this.numberClassSkills++;
	}

	public abstract boolean isClassSkill(Skill classSkill);
	
	protected boolean checkProficentSkill(ArrayList<Skill> proficentSkills, Skill classSkill) {
		boolean isPSkill = false;
		for (int count = 0; count < proficentSkills.size(); count++) {
			if (classSkill.getClass().equals(proficentSkills.get(count).getClass())) {
				isPSkill = true;
				break;
			}
		}
		return isPSkill;
	}
}
