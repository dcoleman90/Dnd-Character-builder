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
	private AnimalHandling animalHandle;
	
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
		this.bonus = new AbilityBonus();
		this.characterSkills = new ArrayList<Skill>();
		this.initializeSkills();
		
		
		this.acrobatic.addSkill(this.bonus.returnBonus(dex));
		this.sleightOfHand.addSkill(this.bonus.returnBonus(dex));
		this.stealth.addSkill(this.bonus.returnBonus(dex));
		this.animalHandle.addSkill(this.bonus.returnBonus(wis));
		this.insight.addSkill(this.bonus.returnBonus(wis));
		this.medicine.addSkill(this.bonus.returnBonus(wis));
		this.perception.addSkill(this.bonus.returnBonus(wis));
		this.survival.addSkill(this.bonus.returnBonus(wis));
		this.arcana.addSkill(this.bonus.returnBonus(intell));
		this.history.addSkill(this.bonus.returnBonus(intell));
		this.investigation.addSkill(this.bonus.returnBonus(intell));
		this.nature.addSkill(this.bonus.returnBonus(intell));
		this.religion.addSkill(this.bonus.returnBonus(intell));
		this.athletic.addSkill(this.bonus.returnBonus(str));
		this.deception.addSkill(this.bonus.returnBonus(charisma));
		this.intimidation.addSkill(this.bonus.returnBonus(charisma));
		this.performance.addSkill(this.bonus.returnBonus(charisma));
		this.persuasion.addSkill(this.bonus.returnBonus(charisma));
		this.addAllToArrayList();
	}
	
	private void initializeSkills() {
		this.acrobatic = new Acrobatics(0);
		this.animalHandle = new AnimalHandling(0);
		this.arcana = new Arcana(0);
		this.athletic = new Athletics(0);
		this.deception = new Deception(0);
		this.history = new History(0);
		this.insight = new Insight(0);
		this.intimidation = new Intimidation(0);
		this.investigation = new Investigation(0);
		this.medicine = new Medicine(0);
		this.nature = new Nature(0);
		this.perception = new Perception(0);
		this.performance = new Performance(0);
		this.persuasion = new Persuasion(0);
		this.religion = new Religion(0);
		this.sleightOfHand = new SleightOfHand(0);
		this.stealth = new Stealth(0);
		this.survival = new Survival(0);
	}

	private void addAllToArrayList() {
		this.characterSkills.add(this.acrobatic);
		this.characterSkills.add(this.animalHandle);
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

	public ArrayList<Skill> getCharactersSkills() {
		return this.characterSkills;
	}
}
