package character.skills;

public abstract class Skill {
	private int skill;
	private boolean isProfSkill;
	private boolean isExpertSkill;
	
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
	
	public boolean isExpertSkill() {
		return isExpertSkill;
	}
	
	public void setExpertSkill(boolean isExpertSkill) {
		this.isExpertSkill = isExpertSkill;
	}

	public void setProfSkill(boolean isProfSkill) {
		this.isProfSkill = isProfSkill;
	}
}
