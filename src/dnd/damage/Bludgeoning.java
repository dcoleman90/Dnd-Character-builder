package dnd.damage;

public class Bludgeoning extends Damage{

	@Override
	public String getDamageType() {
		return super.damageType + "Bludgeoning ";
	}

}
