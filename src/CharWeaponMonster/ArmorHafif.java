package CharWeaponMonster;

public class ArmorHafif extends Armor {

	public ArmorHafif(int id, int money, int protect) {
		super(id, money, protect);
		// TODO Auto-generated constructor stub
	}

	public static ArmorHafif createArmorHafif() {
		return new ArmorHafif(1, 15, 1);
	}

}
