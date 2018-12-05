package character.classType;

import java.util.Random;

import character.skills.Skill;
import character.skills.Skills;

public abstract class ClassType {
	private int hitPoints;
	private Random random;
	private int profBonus;

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
		profBonus = 2;
		return profBonus;
	}

	public String specialAbilities(int level) {
		return "Not working";
	}

	public Skills proficentSkills(Skills classSkills, Skill pro1, Skill pro2) {
		for (int count = 0; count < classSkills.getCharactersSkills().size(); count++) {
			if (pro1 == classSkills.getCharactersSkills().get(count)) {
				classSkills.getCharactersSkills().get(count).addSkill(profBonus);
			}
			if (pro2 == classSkills.getCharactersSkills().get(count)) {
				classSkills.getCharactersSkills().get(count).addSkill(profBonus);
			}
		}
		return classSkills;
	}
}
