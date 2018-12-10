package character.classType;

import java.util.ArrayList;

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
	private int expertiseRanks;
	
	public Rogue() {
		super();
		
		
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
		this.expertiseRanks = 0;
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

	@Override
	public int rogueExpertiseSkills(int level) {
		if (level >= 6) {
			return 4 - this.expertiseRanks;
		} 
		return 2 - this.expertiseRanks;
	}

	@Override
	public void removeOneRogueExpertiseSkills() {
		this.expertiseRanks++;
		
	}
	
}
