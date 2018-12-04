package character.build;

import character.abilities.Ability;
import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.race.Human;
import character.race.Race;

public class Character {
	private Strength str;
	private Dexterity dex;
	private Constitution con;
	private Intelligence intell;
	private Wisdom wis;
	private Charisma charisma;
	private Race race;

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
		this.str = new Strength(acceptedStr);
		this.dex = new Dexterity(acceptedDex);
		this.con = new Constitution(acceptedCon);
		this.intell = new Intelligence(acceptedIntell);
		this.wis = new Wisdom(acceptedWis);
		this.charisma = new Charisma(acceptedCharisma);
		this.race = acceptedRace;
		this.setAbilityScores();
	}

	/**
	 * This method returns the bonus for the accepted ability
	 * 
	 * @param acceptedAbility
	 * @return the bonus added to the d20 roll
	 */
	public int getAbilityBonus(Ability acceptedAbility) {
		int abilityBonus = (acceptedAbility.getScore() - 10) / 2;
		return abilityBonus;
	}

	public String toString() {
		String characterSummary = "";
		characterSummary += this.race.toString() + "\n" + this.str.toString() + this.dex.toString() + this.con.toString()
				+ this.intell.toString() + this.wis.toString() + this.charisma.toString();
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

	private void setAbilityScores() {
		this.str.addScore(this.race.abilityScoreAlterations(str));
		this.dex.addScore(this.race.abilityScoreAlterations(dex));
		this.con.addScore(this.race.abilityScoreAlterations(con));
		this.intell.addScore(this.race.abilityScoreAlterations(intell));
		this.wis.addScore(this.race.abilityScoreAlterations(wis));
		this.charisma.addScore(this.race.abilityScoreAlterations(charisma));
	}

}
