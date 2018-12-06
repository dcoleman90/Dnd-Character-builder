package dnd.damage;

public abstract class Damage {
	String damageType;

	Damage() {
		this.damageType = "Damage ";
	}
	
	public abstract String getDamageType();
}
