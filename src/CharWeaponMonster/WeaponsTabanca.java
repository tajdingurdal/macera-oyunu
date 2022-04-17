package CharWeaponMonster;

public class WeaponsTabanca extends Weapons {

	public WeaponsTabanca(int id, int money, int damage) {
		super(id, money, damage);
		// TODO Auto-generated constructor stub
	}

	public static WeaponsTabanca createTabanca() {
		return new WeaponsTabanca(1, 25, 2);
	}

}
