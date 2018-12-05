package character.skills;

public abstract class Skill {
	private int skill;
	
	public Skill() {
		this.skill = 0;
	}
	
	public Skill(int abilityModifer) {
		this.skill = abilityModifer;
	}
	
	public void setSkill(int setSkillValue) {
		this.skill = setSkillValue;
	}
	
	public int getSkill() {
		return this.skill;
	}
	
	public void addSkill(int addedSkill) {
		this.skill += addedSkill;
	}
}
