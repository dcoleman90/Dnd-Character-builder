package equipment.armor;

public abstract class MediumArmor extends Armor {

	public MediumArmor(int dexModifer, int armorBonus) {
		super(dexModiferChecker(dexModifer) + armorBonus);
	}
	
	private static int dexModiferChecker(int dexModifer) {
		int returnedDexModifer = dexModifer;
		if (returnedDexModifer > 2) {
			returnedDexModifer = 2;
		}
		return returnedDexModifer;
	}
	
	@Override
	public boolean isLightArmor() {
		return false;
	}
	
	@Override
	public boolean isHeavyArmor() {
		return false;
	}
	
	@Override
	public boolean isMediumArmor() {
		return true;
	}
	
	
}
