package equipment.armor;

public class ArmorHide extends MediumArmor {
	private static int armorBonus = 12;

	public ArmorHide() {
		super.setArmorClass(armorBonus);
	}

	@Override
	public double getWeight() {
		return 12.0;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public String getCost() {
		return "10 Gold Pieces ";
	}

	@Override
	public String getName() {
		return "Hide Armor ";
	}

	@Override
	public boolean isStealthDisadvantage() {
		return false;
	}

	@Override
	public int getStrengthScoreRequirement() {
		return 0;
	}

}
