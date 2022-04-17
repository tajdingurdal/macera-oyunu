package CharWeaponMonster;

public class ArmorOrta extends Armor {

	public ArmorOrta(int id, int money, int protect) {
		super(id, money, protect);
		// TODO Auto-generated constructor stub
	}

	public static ArmorOrta createArmorOrta() {
		return new ArmorOrta(2, 25, 3);
	}

}
