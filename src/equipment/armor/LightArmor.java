package equipment.armor;

public abstract class LightArmor extends Armor{
	
	public LightArmor(int dexModifer, int armorBonus) {
		super(dexModifer + armorBonus);
	}
	
	@Override
	public boolean isLightArmor() {
		return true;
	}
	
	@Override
	public boolean isHeavyArmor() {
		return false;
	}
	
	@Override
	public boolean isMediumArmor() {
		return false;
	}
	
	
	

}
