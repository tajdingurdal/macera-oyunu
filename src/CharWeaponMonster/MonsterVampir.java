package CharWeaponMonster;

public class MonsterVampir extends CommonCharAndMonster {

	public MonsterVampir(int id, int money, int damage, int health) {
		super(id, money, damage, health);
		// TODO Auto-generated constructor stub
	}

	public static MonsterVampir createVampir() {
		return new MonsterVampir(2, 7, 4, 14);
	}

}
