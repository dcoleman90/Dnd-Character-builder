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
import character.skills.Skills;
import character.skills.Survival;

public class Fighter extends ClassType {
	private ArrayList<Skill> proficentSkills;
	private ArrayList<Integer> profBonuses;

	/**
	 * Fighters start with 10 hitpoints plus a number 1-10 randomly for each level
	 * beyond the first
	 */
	public Fighter() {
		super();

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
		this.setProfBonusBasedOnLevel();
	}
	
	private void setProfBonusBasedOnLevel() {
		this.profBonuses = new ArrayList<Integer>();
		this.profBonuses.add(2);
		this.profBonuses.add(2);
		this.profBonuses.add(2);
		this.profBonuses.add(2);
		this.profBonuses.add(3);
		this.profBonuses.add(3);
		this.profBonuses.add(3);
		this.profBonuses.add(3);
		this.profBonuses.add(4);
		this.profBonuses.add(4);
		this.profBonuses.add(4);
		this.profBonuses.add(4);
		this.profBonuses.add(5);
		this.profBonuses.add(5);
		this.profBonuses.add(5);
		this.profBonuses.add(5);
		this.profBonuses.add(6);
		this.profBonuses.add(6);
		this.profBonuses.add(6);
		this.profBonuses.add(6);
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
	public int getProficiencyBonus(int level) {
		return super.returnProficiencyBonus(level, this.profBonuses);
	}
	
	
}