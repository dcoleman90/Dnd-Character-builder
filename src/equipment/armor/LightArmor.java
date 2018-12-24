package equipment.armor;

public abstract class LightArmor extends Armor {

	public LightArmor() {
		super.setMaxDexBonus(false);
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

	@Override
	public int getMaxDexBonus() {
		return 1000;
	}
}
