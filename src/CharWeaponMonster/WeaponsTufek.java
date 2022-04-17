package CharWeaponMonster;

public class WeaponsTufek extends Weapons {

	public WeaponsTufek(int id, int money, int damage) {
		super(id, money, damage);
	}

	public static WeaponsTufek createTabanca() {
		return new WeaponsTufek(3, 45, 7);
	}

}
