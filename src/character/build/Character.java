package character.build;

import java.util.ArrayList;

import character.abilities.Ability;
import character.abilities.Charisma;
import character.abilities.Constitution;
import character.abilities.Dexterity;
import character.abilities.Intelligence;
import character.abilities.SavingThrows;
import character.abilities.Strength;
import character.abilities.Wisdom;
import character.background.Background;
import character.classType.ClassType;
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
	private SavingThrows savingThrow;
	private Race race;
	private Skills skills;
	private ClassType classType;
	private Hand rightHand;
	private Hand leftHand;
	private Background background;

	/**
	 * Set Character with level
	 * 
	 * Builds a default character with default value of 10 to all scores With the
	 * accepted Level, ClassType, Background and Race
	 * 
	 * @param level
	 */
	public Character(ClassType classtype, Background background, Race race) {
		this.classType = classtype;
		this.background = background;
		this.race = race;
		this.initializeDefault();
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
	public Character(String name, int acceptedStr, int acceptedDex, int acceptedCon, int acceptedIntell,
			int acceptedWis, int acceptedCharisma, Race acceptedRace, ClassType acceptedClass, Background background) {
		if (name.isEmpty()) {
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
		this.savingThrow = new SavingThrows(this.str, this.dex, this.con, this.intell, this.wis, this.charisma);
		this.race = acceptedRace;
		this.classType = acceptedClass;
		this.background = background;
		this.initializeHands();

	}

	private void initializeDefault() {
		this.setName("New Player");
		this.str = new Strength();
		this.dex = new Dexterity();
		this.con = new Constitution();
		this.intell = new Intelligence();
		this.wis = new Wisdom();
		this.charisma = new Charisma();
		this.savingThrow = new SavingThrows(this.str, this.dex, this.con, this.intell, this.wis, this.charisma);
		this.initializeHands();

	}

	private void initializeHands() {
		this.rightHand = new Hand();
		this.leftHand = new Hand();
		this.setup();
	}

	private void setup() {
		this.setAbilityScores();
		this.setUpSkillScores();
		this.setBackGroundProficentSkill();
		this.setUpSavingThrowsProf();
	}

	public String toString() {
		String characterSummary = "";
		characterSummary += this.race.toString() + "\n" + this.str.toString() + this.dex.toString()
				+ this.con.toString() + this.intell.toString() + this.wis.toString() + this.charisma.toString();
		return characterSummary;
	}

	/**
	 * Private methods to assist with AbilityScores - the bonus applied after race
	 * and Skill Scores - bonus applied after Class
	 */

	private void setAbilityScores() {
		this.str.addScore(this.race.abilityScoreAlterations(this.str));
		this.dex.addScore(this.race.abilityScoreAlterations(this.dex));
		this.con.addScore(this.race.abilityScoreAlterations(this.con));
		this.intell.addScore(this.race.abilityScoreAlterations(this.intell));
		this.wis.addScore(this.race.abilityScoreAlterations(this.wis));
		this.charisma.addScore(this.race.abilityScoreAlterations(this.charisma));
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
	public void setProficentClassTypeSkill(Skill classSkill) {
		if (this.checkProficentSkill(classSkill)) {
			int profBonus = this.classType.getProficiencyBonus();
			if (!this.getSkill(classSkill).isProfSkill()) {
				this.addProficentBonus(classSkill, profBonus);
				this.classType.decreaseNumberOfClassSkillsByOne();
				this.getSkill(classSkill).setProfSkill(true);
			}
		}
	}

	/**
	 * This method adds the proficentBonus to 2 background skills It needs to be
	 * implemented BEFORE class skills
	 * 
	 * @param classSkill
	 */
	private void setBackGroundProficentSkill() {
		this.setBackgroundSkill(this.background.getSkillProf2());
		this.setBackgroundSkill(this.background.getSkillProf1());

	}

	private void setUpSavingThrowsProf() {
		for (int count = 0; count < this.savingThrow.getSavingThrows().size(); count++) {
			if (this.classType.isClassSavingThrow(this.savingThrow.getSavingThrows().get(count))) {
				this.savingThrow.getSavingThrows().get(count).setProfSavingThrow(true);
			} else {
				this.savingThrow.getSavingThrows().get(count).setProfSavingThrow(false);
			}
		}

	}

	public void setBackgroundSkill(Skill backgroundSkill) {
		int profBonus = this.classType.getProficiencyBonus();

		if (!this.getSkill(backgroundSkill).isProfSkill()) {
			this.addProficentBonus(backgroundSkill, profBonus);
			this.getSkill(backgroundSkill).setProfSkill(true);
		}
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

	public int getRemainingClassTypeProf() {
		return this.classType.getNumberClassSkills();
	}

	/**
	 * This method is specific to the ROGUE CLASSTYPE
	 *
	 * I DO NOT LIKE that it is apart of ALL CHARACTERS - but as built all
	 * ClassTypes are reference charts for Character - it asks them and they tell it
	 * yes or no
	 * 
	 * This is frustrating
	 *
	 * This is a rogue class feature - two of the selected rogue skills can have
	 * proficiency DOUBLED
	 */
	public void setRogueExpertise(Skill rogueSkill) {
		if (this.getSkill(rogueSkill).isProfSkill() && this.classType.getNumberOfRogueExpertiseRanks() > 0) {
			this.getSkill(rogueSkill)
					.setSkill(this.classType.getProficiencyBonus()*2);
			this.classType.removeOneRogueExpertiseSkills();
			this.getSkill(rogueSkill).setExpertSkill(true);
		}
	}

	/**
	 * Getters and Setters for all the Ability Scores and Race
	 * 
	 */

	public int getLevel() {
		return this.classType.getLevel();
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

	public void setClassAndLevel(ClassType newClassType) {
		this.classType = newClassType;
		this.setUpSkillScores();
		this.setBackGroundProficentSkill();
	}
	
	public void setLevel(int level) {
		if (level >0 && level < 21) {
			this.classType.setLevel(level);
		}
		this.setUpSkillScores();
		this.setBackGroundProficentSkill();
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
		this.removeRaceAbilityScores();
		this.race = race;
		this.setup();
	}

	private void removeRaceAbilityScores() {
		this.str = new Strength();
		this.dex = new Dexterity();
		this.con = new Constitution();
		this.intell = new Intelligence();
		this.wis = new Wisdom();
		this.charisma = new Charisma();
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
		this.setUpSkillScores();
		this.setBackGroundProficentSkill();
		this.setUpSavingThrowsProf();
	}

	/**
	 * GETTERS FOR ABILITYs, SKILLS, BACKGROUNDS, RACES, SAVING THROWS, and
	 * CLASSTYPEs
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

	public int getAthleticBonus() {
		return this.skills.getAthletic().getSkill();
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

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Strength getStr() {
		return str;
	}

	public Dexterity getDex() {
		return dex;
	}

	public Constitution getCon() {
		return con;
	}

	public Intelligence getIntell() {
		return intell;
	}

	public Wisdom getWis() {
		return wis;
	}

	public Charisma getCharisma() {
		return charisma;
	}

	public int getStrSavingThrow() {
		return this.savingThrowHelper(this.str);
	}

	public int getDexSavingThrow() {
		return this.savingThrowHelper(this.dex);
	}

	public int getConSavingThrow() {
		return this.savingThrowHelper(this.con);
	}

	public int getIntellSavingThrow() {
		return this.savingThrowHelper(this.intell);
	}

	public int getWisSavingThrow() {
		return this.savingThrowHelper(this.wis);
	}

	public int getCharismaSavingThrow() {
		return this.savingThrowHelper(this.charisma);
	}

	private int savingThrowHelper(Ability searchedAbility) {
		if (searchedAbility.isProfSavingThrow()) {
			return searchedAbility.getAbilityBonus() + this.classType.getProficiencyBonus();
		}
		return searchedAbility.getAbilityBonus();
	}
}
