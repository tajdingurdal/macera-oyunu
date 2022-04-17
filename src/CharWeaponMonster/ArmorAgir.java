package CharWeaponMonster;

public class ArmorAgir extends Armor {

	public ArmorAgir(int id, int money, int protect) {
		super(id, money, protect);
		// TODO Auto-generated constructor stub
	}

	public static ArmorAgir createArmorAgir() {
		return new ArmorAgir(3, 40, 5);
	}

}
