package equipment.armor;

public class ArmorPadded extends LightArmor {
    private static int armorBonus = 11;

    public ArmorPadded() {
    	super.setArmorClass(armorBonus);
    }

   
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
        return "5 Gold Pieces ";
    }

    @Override
    public String getName() {
        return "Padded Armor ";
    }

    @Override
    public boolean isStealthDisadvantage() {
        return true;
    }

	@Override
	public int getStrengthScoreRequirement() {
		return 0;
	}
}
