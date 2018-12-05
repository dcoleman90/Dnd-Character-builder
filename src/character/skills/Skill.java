package character.skills;

public abstract class Skill {
	private int skill;
	private boolean isProfSkill;
	
	public Skill(int abilityModifer) {
		this.skill = abilityModifer;
		this.isProfSkill = false;
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

	public boolean isProfSkill() {
		return isProfSkill;
	}

	public void setProfSkill(boolean isProfSkill) {
		this.isProfSkill = isProfSkill;
	}
}
