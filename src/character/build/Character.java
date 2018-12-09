package character.build;

import java.util.ArrayList;

import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.classType.ClassType;
import character.classType.Fighter;
import character.race.Background;
import character.race.BackgroundOutlander;
import character.race.Human;
import character.race.Race;
import character.skills.Skill;
import character.skills.Skills;

public class Character {
	private String name;
	private Strength str;
	private Dexterity dex;
	private Constitution con;
	private Intelligence intell;
	private Wisdom wis;
	private Charisma charisma;
	private Race race;
	private Skills skills;
	private ClassType classType;
	private Hand rightHand;
	private Hand leftHand;
	private int level;
	private Background background;


	/**
	 * Builds a default character with default value of 10 to all scores
	 */
	public Character() {
		this.setName("New Player");
		this.str = new Strength();
		this.dex = new Dexterity();
		this.con = new Constitution();
		this.intell = new Intelligence();
		this.wis = new Wisdom();
		this.charisma = new Charisma();
		this.race = new Human();
		this.classType = new Fighter();
		this.level = 1;
		this.rightHand = new Hand();
		this.leftHand = new Hand();
		this.background = new BackgroundOutlander();
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
	public Character(String name, int acceptedStr, int acceptedDex, int acceptedCon, int acceptedIntell, int acceptedWis,
			int acceptedCharisma, Race acceptedRace, ClassType acceptedClass, int level, Background background) {
		this();
		if(name.isEmpty()) {
			this.setName("New Player");
		} else {
			this.setName(name);
		}
		this.str = new Strength(acceptedStr);
		this.dex = new Dexterity(acceptedDex);
		this.con = new Constitution(acceptedCon);
		this.intell = new Intelligence(acceptedIntell);
		this.wis = new Wisdom(acceptedWis);
		this.charisma = new Charisma(acceptedCharisma);
		this.race = acceptedRace;
		this.classType = acceptedClass;
		
		if (level < 0 || level > 20) {
			this.level = 1;
		} else {
			this.level = level;
		}
		
		this.background = background;
		
		this.setAbilityScores();
		this.setUpSkillScores();
		this.setBackGroundProficentSkill();
	}

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

	public int getLevel() {
		return this.level;
	}
	
	public Hand getRightHand() {
		return rightHand;
	}

	public void setRightHand(Hand rightHand) {
		this.rightHand = rightHand;
	}

	public Hand getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(Hand leftHand) {
		this.leftHand = leftHand;
	}

	public void setLevel(int acceptedLevel) {
		this.level = acceptedLevel;
	}

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

	public Skills getSkills() {
		return this.skills;
	}

	public ArrayList<Skill> getArrayListSkill() {
		return this.skills.getCharactersSkills();
	}

	public ClassType getClassType() {
		return this.classType;
	}

	public void setClassType(ClassType acceptedClassType) {
		this.classType = acceptedClassType;
	}

	
	/**
	 * GETTERS FOR ABILITY SCORES
	 */
	
	public int getAcrobaticsBonus() {
		return this.skills.getAcrobatic().getSkill();
	}
	
	public int getAnimalHandlingBonus() {
		return this.skills.getAnimalHandle().getSkill();
	}
	
	public int getAcranaBonus() {
		return this.skills.getArcana().getSkill();
	}
	
	public int getDeceptionBonus() {
		return this.skills.getDeception().getSkill();
	}
	
	public int getHistoryBonus() {
		return this.skills.getHistory().getSkill();
	}
	
	public int getInsightBonus() {
		return this.skills.getInsight().getSkill();
	}
	
	public int getIntimidationBonus() {
		return this.skills.getIntimidation().getSkill();
	}
	
	public int getInvestigationBonus() {
		return this.skills.getInvestigation().getSkill();
	}
	
	public int getMedicineBonus() {
		return this.skills.getMedicine().getSkill();
	}
	
	public int getNatureBonus() {
		return this.skills.getNature().getSkill();
	}
	
	public int getPerceptionBonus() {
		return this.skills.getPerception().getSkill();
	}
	
	public int getPerformanceBonus() {
		return this.skills.getPerformance().getSkill();
	}
	
	public int getPersuasionBonus() {
		return this.skills.getPersuasion().getSkill();
	}
	
	public int getReligionBonus() {
		return this.skills.getReligion().getSkill();
	}
	
	public int getSleightOfHandBonus() {
		return this.skills.getSleightOfHand().getSkill();
	}
	
	public int getStealthBonus() {
		return this.skills.getStealth().getSkill();
	}
	
	public int getSurvivalBonus() {
		return this.skills.getSurvival().getSkill();
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

	/**
	 * This method checks the classType and returns true if the accepted classSkill
	 * is able to be Proficient
	 * 
	 * @param classSkill
	 * @return
	 */
	public boolean checkProficentSkill(Skill classSkill) {
		return this.classType.isClassSkill(classSkill);
	}

	/**
	 * This method takes a skill - checks to see if it is a class skill - checks
	 * that it is not already used then assigns it proficiency bonus
	 * 
	 * @param classSkill
	 */
	public void setProficentSkill(Skill classSkill) {
		if (this.checkProficentSkill(classSkill)) {
			int profBonus = this.classType.getProficiencyBonus(this.level);
			if (!this.getSkill(classSkill).isProfSkill()) {
				this.addProficentBonus(classSkill, profBonus);
				this.classType.decreaseNumberOfClassSkillsByOne();
				this.getSkill(classSkill).setProfSkill(true);
			}
		}
	}
	
	/**
	 * This method adds the proficentBonus to 2 background skills
	 * It needs to be implemented BEFORE class skills
	 * @param classSkill
	 */
	public void setBackGroundProficentSkill() {
		this.getSkill(this.background.getSkillProf1()).setProfSkill(true);
		this.getSkill(this.background.getSkillProf2()).setProfSkill(true);

	}

	private Skill getSkill(Skill searchedSkill) {
		for (int count = 0; count < this.skills.getCharactersSkills().size(); count++) {
			if (searchedSkill.getClass().equals(this.skills.getCharactersSkills().get(count).getClass())) {
				return this.skills.getCharactersSkills().get(count);
			}
		}
		return null;
	}

	private void addProficentBonus(Skill classSkill, int bonusAdded) {
		for (int count = 0; count < this.skills.getCharactersSkills().size(); count++) {
			if (classSkill.getClass().equals(this.skills.getCharactersSkills().get(count).getClass())) {
				this.skills.getCharactersSkills().get(count).addSkill(bonusAdded);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
