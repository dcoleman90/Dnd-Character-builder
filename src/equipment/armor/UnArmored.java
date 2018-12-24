package equipment.armor;

public class UnArmored extends Armor{
	private static int unarmoredAC = 10;
	
	public UnArmored() {
		super.setArmorClass(unarmoredAC);
		super.setMaxDexBonus(false);
	}
	
	@Override
	public double getWeight() {
		return 0;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public String getCost() {
		return "N/A ";
	}

	@Override
	public String getName() {
		return "Unarmored ";
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
		return false;
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
