package character.skills;

import java.util.ArrayList;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;

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

	public Skills(Strength str, Dexterity dex, Constitution con, Intelligence intell, Wisdom wis, Charisma charisma) {
		this.characterSkills = new ArrayList<Skill>();
		this.initializeSkills();
		
		
		this.acrobatic.addSkill(dex.getAbilityBonus());
		this.sleightOfHand.addSkill(dex.getAbilityBonus());
		this.stealth.addSkill(dex.getAbilityBonus());
		this.animalHandle.addSkill(wis.getAbilityBonus());
		this.insight.addSkill(wis.getAbilityBonus());
		this.medicine.addSkill(wis.getAbilityBonus());
		this.perception.addSkill(wis.getAbilityBonus());
		this.survival.addSkill(wis.getAbilityBonus());
		this.arcana.addSkill(intell.getAbilityBonus());
		this.history.addSkill(intell.getAbilityBonus());
		this.investigation.addSkill(intell.getAbilityBonus());
		this.nature.addSkill(intell.getAbilityBonus());
		this.religion.addSkill(intell.getAbilityBonus());
		this.athletic.addSkill(str.getAbilityBonus());
		this.deception.addSkill(charisma.getAbilityBonus());
		this.intimidation.addSkill(charisma.getAbilityBonus());
		this.performance.addSkill(charisma.getAbilityBonus());
		this.persuasion.addSkill(charisma.getAbilityBonus());
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
	
	
	/**
	 * 
	 * 
	 * GETTERS AND SETTERS FOR ALL THE SKILL
	 * 
	 * 
	 */
	public Acrobatics getAcrobatic() {
		return acrobatic;
	}

	public void setAcrobatic(Acrobatics acrobatic) {
		this.acrobatic = acrobatic;
	}

	public AnimalHandling getAnimalHandle() {
		return animalHandle;
	}

	public void setAnimalHandle(AnimalHandling animalHandle) {
		this.animalHandle = animalHandle;
	}

	public Arcana getArcana() {
		return arcana;
	}

	public void setArcana(Arcana arcana) {
		this.arcana = arcana;
	}

	public Athletics getAthletic() {
		return athletic;
	}

	public void setAthletic(Athletics athletic) {
		this.athletic = athletic;
	}

	public Deception getDeception() {
		return deception;
	}

	public void setDeception(Deception deception) {
		this.deception = deception;
	}

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

	public Insight getInsight() {
		return insight;
	}

	public void setInsight(Insight insight) {
		this.insight = insight;
	}

	public Investigation getInvestigation() {
		return investigation;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public Intimidation getIntimidation() {
		return intimidation;
	}

	public void setIntimidation(Intimidation intimidation) {
		this.intimidation = intimidation;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Nature getNature() {
		return nature;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public Perception getPerception() {
		return perception;
	}

	public void setPerception(Perception perception) {
		this.perception = perception;
	}

	public Performance getPerformance() {
		return performance;
	}

	public void setPerformance(Performance performance) {
		this.performance = performance;
	}

	public Persuasion getPersuasion() {
		return persuasion;
	}

	public void setPersuasion(Persuasion persuasion) {
		this.persuasion = persuasion;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public SleightOfHand getSleightOfHand() {
		return sleightOfHand;
	}

	public void setSleightOfHand(SleightOfHand sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}

	public Stealth getStealth() {
		return stealth;
	}

	public void setStealth(Stealth stealth) {
		this.stealth = stealth;
	}

	public Survival getSurvival() {
		return survival;
	}

	public void setSurvival(Survival survival) {
		this.survival = survival;
	}
}
