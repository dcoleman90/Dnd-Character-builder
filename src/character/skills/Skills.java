package character.skills;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;

/**
 * This class will contain an arrayList of all the characters skills
 * @author DrewC
 *
 */
public class Skills {
	private int acrobatics;
	private int animalHandling;
	private int arcana;
	private int deception;
	private int history;
	private int insight;
	private int intimidation;
	private int medicine;
	private int nature;
	private int perception;
	private int performance;
	private int persuasion;
	private int religion;
	private int sleightOfHand;
	private int stealth;
	private int survival;
	
	public Skills(Strength str, Dexterity dex, Constitution con, Intelligence intell, Wisdom wis, Charisma charisma) {
		this.acrobatics = dex.getScore();
		this.animalHandling = wis.getScore();
		this.arcana = intell.getScore();
		this.deception = charisma.getScore();
		this.history = intell.getScore();
		this.insight = wis.getScore();
		this.intimidation = charisma.getScore();
		this.medicine = wis.getScore();
		this.nature = intell.getScore();
		this.perception = wis.getScore();
		this.performance = charisma.getScore();
		this.persuasion = charisma.getScore();
		this.religion = intell.getScore();
		this.sleightOfHand = dex.getScore();
		this.stealth = dex.getScore();
		this.survival = wis.getScore();
	}

	
	/**
	 * Getter and setters for all the Skills
	 * @return
	 */
	public int getAcrobatics() {
		return acrobatics;
	}

	public void setAcrobatics(int acrobatics) {
		this.acrobatics = acrobatics;
	}

	public int getAnimalHandling() {
		return animalHandling;
	}

	public void setAnimalHandling(int animalHandling) {
		this.animalHandling = animalHandling;
	}

	public int getArcana() {
		return arcana;
	}

	public void setArcana(int arcana) {
		this.arcana = arcana;
	}

	public int getDeception() {
		return deception;
	}

	public void setDeception(int deception) {
		this.deception = deception;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getInsight() {
		return insight;
	}

	public void setInsight(int insight) {
		this.insight = insight;
	}

	public int getIntimidation() {
		return intimidation;
	}

	public void setIntimidation(int intimidation) {
		this.intimidation = intimidation;
	}

	public int getMedicine() {
		return medicine;
	}

	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}

	public int getNature() {
		return nature;
	}

	public void setNature(int nature) {
		this.nature = nature;
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPersuasion() {
		return persuasion;
	}

	public void setPersuasion(int persuasion) {
		this.persuasion = persuasion;
	}

	public int getReligion() {
		return religion;
	}

	public void setReligion(int religion) {
		this.religion = religion;
	}

	public int getSleightOfHand() {
		return sleightOfHand;
	}

	public void setSleightOfHand(int sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival(int survival) {
		this.survival = survival;
	}
	
}
