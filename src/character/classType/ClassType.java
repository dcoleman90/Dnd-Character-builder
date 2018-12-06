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
		this.setNumberClassSkills(2);
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

	public String specialAbilities(int level) {
		return "Not working";
	}

	public void decreaseNumberOfClassSkillsByOne() {
		this.setNumberClassSkills(this.getNumberClassSkills() - 1);
	}

	/**
	 * This method insures the children receive a level value then return the
	 * proficiency bonus for that level
	 * 
	 * @param level
	 * @return prof bonus
	 */
	public abstract int getProficiencyBonus(int level);

	protected int returnProficiencyBonus(int level, ArrayList<Integer> profBonusTrack) {
		return profBonusTrack.get(level-1);
	}

	/**
	 * This method returns true if the skill is one of the acceptable class skills
	 * 
	 * @param classSkill
	 * @return
	 */
	public abstract boolean isClassSkill(Skill classSkill);

	/**
	 * This method is protected to insure that it can only be accessed by its
	 * subclasses and not directly influenced by the character class
	 * 
	 * @param proficentSkills - a list of acceptable proficient skills
	 * @param classSkill      - the skill being checked if it is allowed
	 * @return
	 */
	protected boolean checkProficentSkill(ArrayList<Skill> proficentSkills, Skill classSkill) {
		boolean isPSkill = false;
		for (int count = 0; count < proficentSkills.size(); count++) {
			if (classSkill.getClass().equals(proficentSkills.get(count).getClass()) && this.numberClassSkills > 0) {
				isPSkill = true;
				break;
			}
		}
		return isPSkill;
	}

	public int getNumberClassSkills() {
		return numberClassSkills;
	}

	public void setNumberClassSkills(int numberClassSkills) {
		this.numberClassSkills = numberClassSkills;
	}
}
