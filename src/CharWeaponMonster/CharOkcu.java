package CharWeaponMonster;

public class CharOkcu extends Character {

	public CharOkcu(int id, int damage, int health, int money) {
		super(id, damage, health, money);
	}

	public static CharOkcu createTabanca() {
		return new CharOkcu(2, 7, 18, 20);
	}

}
