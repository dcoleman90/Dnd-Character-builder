package equipment.weapon;

public abstract class Equipment {

	public abstract boolean isHeavy();

	public abstract boolean isTwoHanded();

	public abstract double getWeight();

	public abstract boolean isSpecial();
	
	public abstract boolean isLight();
	
	public abstract String cost();
	
	public abstract String name();

}
