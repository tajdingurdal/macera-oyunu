package CharWeaponMonster;

public class MonsterZombi extends CommonCharAndMonster {

	public MonsterZombi(int id, int money, int damage, int health) {
		super(id, money, damage, health);
	}

	public static MonsterZombi createZombi() {
		return new MonsterZombi(1, 4, 3, 10);
	}

}
