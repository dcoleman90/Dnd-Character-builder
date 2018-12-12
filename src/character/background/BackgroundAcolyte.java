package character.background;

import character.skills.Insight;
import character.skills.Religion;

public class BackgroundAcolyte extends Background{
	private Religion religion;
	private Insight insight;

	public BackgroundAcolyte() {
		this.insight = new Insight(0);
		this.religion = new Religion(0);
		super.setSkillProf1(this.religion);
		super.setSkillProf2(this.insight);
		super.setBackGroundTitle("Acolyte ");
		super.setBackgroundDescription("You have spent your life in the service of a temple ");
		super.setFeature("Shelter of the Faithful ");
	}
}
