package character.background;

import character.skills.Skill;

public abstract class Background {
	private String backgroundTitle;
	private String backgroundDescription;
	private String feature;
	private Skill skillProf1;
	private Skill skillProf2;
	
	public String getBackgroundTitle() {
		return this.backgroundTitle;
	}
	
	public String getbackGroundDescription() {
		return this.backgroundDescription;
	}
	
	public String getFeature() {
		return this.feature;
	}
	
	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	public void setBackGroundTitle(String title) {
		this.backgroundTitle = title;
	}	
	
	public void setBackgroundDescription(String description) {
		this.backgroundDescription = description;
	}

	public Skill getSkillProf1() {
		return skillProf1;
	}

	public Skill getSkillProf2() {
		return skillProf2;
	}

	public void setSkillProf1(Skill skillProf1) {
		this.skillProf1 = skillProf1;
	}

	public void setSkillProf2(Skill skillProf2) {
		this.skillProf2 = skillProf2;
	}
}