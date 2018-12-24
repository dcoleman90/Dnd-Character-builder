package equipment.armor;

public class ArmorPadded extends LightArmor {
    private static int armorBonus = 11;
    private int dexMod;

    public ArmorPadded(int dexModifer) {
        super(dexModifer, armorBonus);
        this.dexMod = dexModifer;
    }

//THis is a test comment to test commit
    @Override
    public double getWeight() {
        return 8.0;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String getCost() {
        return "5 Gold pieces ";
    }

    @Override
    public String getName() {
        return "Padded Armor ";
    }

    @Override
    public boolean isStealthDisadvantage() {
        return true;
    }

    public int getDexMod() {
        return this.dexMod;
    }

	@Override
	public int getStrengthScoreRequirement() {
		return 0;
	}
}
