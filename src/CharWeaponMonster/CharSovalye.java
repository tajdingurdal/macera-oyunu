package CharWeaponMonster;

public class CharSovalye extends Character {

	public CharSovalye(int id, int damage, int health, int money) {
		super(id, damage, health, money);
	}

	public static CharSovalye createSovalye() {
		return new CharSovalye(3, 8, 24, 5);
	}

}
