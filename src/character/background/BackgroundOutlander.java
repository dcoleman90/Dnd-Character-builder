package character.background;

import character.skills.Athletics;
import character.skills.Survival;

public class BackgroundOutlander extends Background{
	private Athletics athletics;
	private Survival survial;

	public BackgroundOutlander() {
		this.survial = new Survival(0);
		this.athletics = new Athletics(0);
		super.setSkillProf1(athletics);
		super.setSkillProf2(survial);
		super.setBackGroundTitle("Outlander ");
		super.setBackgroundDescription(" You grew up in the wild ");
		super.setFeature("Wanderer ");
	}
	
}
