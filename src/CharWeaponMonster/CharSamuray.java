package CharWeaponMonster;

public class CharSamuray extends Character {

	public CharSamuray(int id, int damage, int health, int money) {
		super(id, damage, health, money);
	}

	public static CharSamuray createSamuray() {
		return new CharSamuray(1, 5, 21, 15);
	}

}
