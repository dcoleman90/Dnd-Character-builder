package character.skills;

import java.util.ArrayList;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.build.AbilityBonus;

public class Skills {
	private ArrayList<Skill> characterSkills;
	private Acrobatics acrobatic;
	private AnmialHandling animalHandle;
	private Arcana arcana;
	private Athletics athletic;
	private Deception deception;
	private History history;
	private Insight insight;
	private Investigation investigation;
	private Intimidation intimidation;
	private Medicine medicine;
	private Nature nature;
	private Perception perception;
	private Performance performance;
	private Persuasion persuasion;
	private Religion religion;
	private SleightOfHand sleightOfHand;
	private Stealth stealth;
	private Survival survival;
	private AbilityBonus bonus;

	public Skills(Strength str, Dexterity dex, Constitution con, Intelligence intell, Wisdom wis, Charisma charisma) {
		this.acrobatic.addSkill(bonus.returnBonus(dex));
		this.sleightOfHand.addSkill(bonus.returnBonus(dex));
		this.stealth.addSkill(bonus.returnBonus(dex));
		this.animalHandle.addSkill(bonus.returnBonus(wis));
		this.insight.addSkill(bonus.returnBonus(wis));
		this.medicine.addSkill(bonus.returnBonus(wis));
		this.perception.addSkill(bonus.returnBonus(wis));
		this.survival.addSkill(bonus.returnBonus(wis));
		this.arcana.addSkill(bonus.returnBonus(intell));
		this.history.addSkill(bonus.returnBonus(intell));
		this.investigation.addSkill(bonus.returnBonus(intell));
		this.nature.addSkill(bonus.returnBonus(intell));
		this.religion.addSkill(bonus.returnBonus(intell));
		this.athletic.addSkill(bonus.returnBonus(str));
		this.deception.addSkill(bonus.returnBonus(charisma));
		this.intimidation.addSkill(bonus.returnBonus(charisma));
		this.performance.addSkill(bonus.returnBonus(charisma));
		this.persuasion.addSkill(bonus.returnBonus(charisma));
		this.addAllToArrayList();
	}

	private void addAllToArrayList() {
		this.characterSkills.add(this.animalHandle);
		this.characterSkills.add(this.acrobatic);
		this.characterSkills.add(this.arcana);
		this.characterSkills.add(this.athletic);
		this.characterSkills.add(this.deception);
		this.characterSkills.add(this.history);
		this.characterSkills.add(this.insight);
		this.characterSkills.add(this.investigation);
		this.characterSkills.add(this.intimidation);
		this.characterSkills.add(this.medicine);
		this.characterSkills.add(this.nature);
		this.characterSkills.add(this.perception);
		this.characterSkills.add(this.performance);
		this.characterSkills.add(this.persuasion);
		this.characterSkills.add(this.religion);
		this.characterSkills.add(this.sleightOfHand);
		this.characterSkills.add(this.stealth);
		this.characterSkills.add(this.survival);
	}

	public ArrayList<Skills> getCharactersSkills() {
		return this.getCharactersSkills();
	}
}
