package equipment.armor;

public class PaddedArmor extends LightArmor {
	private static int armorBonus = 11;

	public PaddedArmor(int dexModifer) {
		super(dexModifer, armorBonus);
	}

	private int dexMod;

	@Override
	public double getWeight() {
		return 8.0;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public String cost() {
		return "5 Gold pieces ";
	}

	@Override
	public String name() {
		return "Padded Armor ";
	}

	@Override
	public boolean isStealthDisadvantage() {
		return true;
	}

	public int getDexMod() {
		return dexMod;
	}
}
