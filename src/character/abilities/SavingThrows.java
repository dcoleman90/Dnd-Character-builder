package character.abilities;

import java.util.ArrayList;

public class SavingThrows {
	ArrayList<Ability> savingThrows;

	public ArrayList<Ability> getSavingThrows() {
		return savingThrows;
	}

	public SavingThrows(Strength str, Dexterity dex, Constitution con, Intelligence intell, Wisdom wis,
			Charisma charisma) {
		this.savingThrows = new ArrayList<Ability>();
		this.savingThrows.add(str);
		this.savingThrows.add(dex);
		this.savingThrows.add(con);
		this.savingThrows.add(intell);
		this.savingThrows.add(wis);
		this.savingThrows.add(charisma);
	}

	public Ability getSavingThrowStr() {
		return this.savingThrows.get(0);
	}

	public Ability getSavingThrowDex() {
		return this.savingThrows.get(1);
	}

	public Ability getSavingThrowCon() {
		return this.savingThrows.get(2);
	}

	public Ability getSavingThrowIntell() {
		return this.savingThrows.get(3);
	}

	public Ability getSavingThrowWis() {
		return this.savingThrows.get(4);
	}

	public Ability getSavingThrowCharisma() {
		return this.savingThrows.get(5);
	}
}
