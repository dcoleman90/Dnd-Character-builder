package character.build;

import java.util.ArrayList;

import character.abilities.Ability;
import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.race.Human;
import character.race.Race;
import character.skills.Skill;
import character.skills.Skills;

public class Character {
	private Strength str;
	private Dexterity dex;
	private Constitution con;
	private Intelligence intell;
	private Wisdom wis;
	private Charisma charisma;
	private Race race;
	private Skills skills;

	/**
	 * Builds a default character with default value of 10 to all scores
	 */
	public Character() {
		this.str = new Strength();
		this.dex = new Dexterity();
		this.con = new Constitution();
		this.intell = new Intelligence();
		this.wis = new Wisdom();
		this.charisma = new Charisma();
		this.race = new Human();
		this.setAbilityScores();
		this.setUpSkillScores();
	}

	/**
	 * constructs a character with the accepted values representing all the new
	 * values for the character
	 * 
	 * @param acceptedStr
	 * @param acceptedDex
	 * @param acceptedCon
	 * @param acceptedIntell
	 * @param acceptedWis
	 * @param acceptedCharisma
	 */
	public Character(int acceptedStr, int acceptedDex, int acceptedCon, int acceptedIntell, int acceptedWis,
			int acceptedCharisma, Race acceptedRace) {
		this();
		this.str = new Strength(acceptedStr);
		this.dex = new Dexterity(acceptedDex);
		this.con = new Constitution(acceptedCon);
		this.intell = new Intelligence(acceptedIntell);
		this.wis = new Wisdom(acceptedWis);
		this.charisma = new Charisma(acceptedCharisma);
		this.race = acceptedRace;
		
	}

//	/**
//	 * This method returns the bonus for the accepted ability
//	 *  Currently trying it as a seperate class
//	 * @param acceptedAbility
//	 * @return the bonus added to the d20 roll
//	 */
//	public int getAbilityBonus(Ability acceptedAbility) {
//		int abilityBonus = (acceptedAbility.getScore() - 10) / 2;
//		return abilityBonus; // Needs tested
//	}

	public String toString() {
		String characterSummary = "";
		characterSummary += this.race.toString() + "\n" + this.str.toString() + this.dex.toString()
				+ this.con.toString() + this.intell.toString() + this.wis.toString() + this.charisma.toString();
		return characterSummary;
	}

	/**
	 * Getters and Setters for all the Ability Scores and Race
	 * 
	 */

	public int getStrScore() {
		return this.str.getScore();
	}

	public void setStr(Strength str) {
		this.str = str;
	}

	public int getDexScore() {
		return this.dex.getScore();
	}

	public void setDex(Dexterity dex) {
		this.dex = dex;
	}

	public int getConScore() {
		return this.con.getScore();
	}

	public void setCon(Constitution con) {
		this.con = con;
	}

	public int getIntellScore() {
		return this.intell.getScore();
	}

	public void setIntell(Intelligence intell) {
		this.intell = intell;
	}

	public int getWisScore() {
		return this.wis.getScore();
	}

	public void setWis(Wisdom wis) {
		this.wis = wis;
	}

	public int getCharismaScore() {
		return this.charisma.getScore();
	}

	public void setCharisma(Charisma charisma) {
		this.charisma = charisma;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	/**
	 * Private methods to assist with AbilityScores - the bonus applied after race
	 * and Skill Scores - bonus applied after Class
	 */

	private void setAbilityScores() {
		this.str.addScore(this.race.abilityScoreAlterations(str));
		this.dex.addScore(this.race.abilityScoreAlterations(dex));
		this.con.addScore(this.race.abilityScoreAlterations(con));
		this.intell.addScore(this.race.abilityScoreAlterations(intell));
		this.wis.addScore(this.race.abilityScoreAlterations(wis));
		this.charisma.addScore(this.race.abilityScoreAlterations(charisma));
	}

	private void setUpSkillScores() {
		this.skills = new Skills(this.str, this.dex, this.con, this.intell, this.wis, this.charisma);
	}
}
