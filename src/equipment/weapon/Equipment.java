package equipment.weapon;

public interface Equipment {

	public  double getWeight();

	public  boolean isSpecial();
	
	public boolean isHeavyWeapon();

	public boolean isTwoHanded();

	public  boolean isLightWeapon();
	
	public  String getCost();
	
	public  String getName();

}
