package CharWeaponMonster;

public class WeaponsKilic extends Weapons {

	public WeaponsKilic(int id, int money, int damage) {
		super(id, money, damage);
		// TODO Auto-generated constructor stub
	}

	public static WeaponsKilic createKilic() {
		return new WeaponsKilic(2, 35, 3);
	}

}
