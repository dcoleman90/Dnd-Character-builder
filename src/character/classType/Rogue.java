package character.classType;

import java.util.ArrayList;

import character.abilities.Ability;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.skills.Acrobatics;
import character.skills.Athletics;
import character.skills.Deception;
import character.skills.Insight;
import character.skills.Intimidation;
import character.skills.Investigation;
import character.skills.Perception;
import character.skills.Performance;
import character.skills.Persuasion;
import character.skills.Skill;
import character.skills.SleightOfHand;
import character.skills.Stealth;

public class Rogue extends ClassType {
	private ArrayList<Skill> proficentSkills;
	private ArrayList<Ability> proficentAbility;
	private int expertiseRanks;

	public Rogue(int level) {
		super(level);
		this.expertiseRanks = this.rogueExpertiseSkills(level);
		Acrobatics acro = new Acrobatics(0);
		Athletics ath = new Athletics(0);
		Deception decp = new Deception(0);
		Insight insight = new Insight(0);
		Intimidation intim = new Intimidation(0);
		Investigation invest = new Investigation(0);
		Perception perc = new Perception(0);
		Performance perform = new Performance(0);
		Persuasion persu = new Persuasion(0);
		SleightOfHand sOH = new SleightOfHand(0);
		Stealth stealth = new Stealth(0);
		Intelligence intel = new Intelligence();
		Dexterity dex = new Dexterity();
		this.proficentAbility = new ArrayList<Ability>();
		this.proficentAbility.add(intel);
		this.proficentAbility.add(dex);
		this.proficentSkills = new ArrayList<Skill>();
		this.proficentSkills.add(acro);
		this.proficentSkills.add(ath);
		this.proficentSkills.add(decp);
		this.proficentSkills.add(invest);
		this.proficentSkills.add(insight);
		this.proficentSkills.add(intim);
		this.proficentSkills.add(perc);
		this.proficentSkills.add(perform);
		this.proficentSkills.add(persu);
		this.proficentSkills.add(sOH);
		this.proficentSkills.add(stealth);
		this.setNumberClassSkills(4);
	}

	public void setHitPoints(int level, int conBonus) {
		super.setHitPoints(level, 8, conBonus);
	}

	@Override
	public boolean isClassSkill(Skill rogueSkill) {
		return super.checkProficentSkill(proficentSkills, rogueSkill);
	}

	@Override
	public String toString() {
		return "Rogue ";
	}

	private int rogueExpertiseSkills(int level) {
		if (level >= 6) {
			return 4;
		} else {
			return 2;
		}
	}

	@Override
	public void removeOneRogueExpertiseSkills() {
		this.expertiseRanks--;
	}

	@Override
	public void setLevel(int level) {
		super.setLevel(level);
		this.expertiseRanks = this.rogueExpertiseSkills(level);
	}

	@Override
	public int getNumberOfRogueExpertiseRanks() {
		return this.expertiseRanks;
	}

	@Override
	public boolean isProfLightArmor() {
		return true;
	}

	@Override
	public boolean isProfMedArmor() {
		return false;
	}

	@Override
	public boolean isProfHeavyArmor() {
		return false;
	}

	@Override
	public boolean isProfShields() {
		return true;
	}

	@Override
	public boolean isClassSavingThrow(Ability savingThrow) {
		return super.checkProfSavingThrows(this.proficentAbility, savingThrow);
	}

}
