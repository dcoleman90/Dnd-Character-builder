package character.classType;

import java.util.ArrayList;

import character.skills.Acrobatics;
import character.skills.AnimalHandling;
import character.skills.Athletics;
import character.skills.History;
import character.skills.Insight;
import character.skills.Intimidation;
import character.skills.Perception;
import character.skills.Skill;
import character.skills.Survival;

public class Fighter extends ClassType {
	private ArrayList<Skill> proficentSkills;

	/**
	 * Fighters start with 10 hitpoints plus a number 1-10 randomly and con bonus
	 * for each level beyond the first
	 * 
	 * 
	 * NEED TO ADD SAVING THROWS
	 */
	public Fighter() {
		super();
		this.setNumberClassSkills(2);
		Acrobatics acro = new Acrobatics(0);
		AnimalHandling ah = new AnimalHandling(0);
		Athletics ath = new Athletics(0);
		History hist = new History(0);
		Insight insight = new Insight(0);
		Intimidation intim = new Intimidation(0);
		Perception perc = new Perception(0);
		Survival surv = new Survival(0);
		this.proficentSkills = new ArrayList<Skill>();
		this.proficentSkills.add(acro);
		this.proficentSkills.add(ah);
		this.proficentSkills.add(ath);
		this.proficentSkills.add(hist);
		this.proficentSkills.add(insight);
		this.proficentSkills.add(intim);
		this.proficentSkills.add(perc);
		this.proficentSkills.add(surv);

	}

	public void setHitPoints(int level, int conBonus) {
		super.setHitPoints(level, 10, conBonus);
	}

	@Override
	public String specialAbilities(int level) {
		return super.specialAbilities(level) + " Fighter";
	}

	@Override
	public boolean isClassSkill(Skill fighterSkill) {
		return super.checkProficentSkill(proficentSkills, fighterSkill);
	}

	@Override
	public String toString() {
		return "Fighter";
	}

	/**
	 * These methods are currently required to appease the Rogue class
	 * 
	 * NEED TO FIND A BETTER WAY WHICH DOES NOT INVOLVE ALL THE CLASSES HAVING ROGUE
	 * ABILITIES
	 */
	@Override
	public int rogueExpertiseSkills(int level) {
		return 0;
	}

	@Override
	public void removeOneRogueExpertiseSkills() {
	}

}