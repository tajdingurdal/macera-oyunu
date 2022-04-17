package CharWeaponMonster;

public class MonsterAyi extends CommonCharAndMonster {

	public MonsterAyi(int id, int money, int damage, int health) {
		super(id, money, damage, health);
		// TODO Auto-generated constructor stub
	}

	public static MonsterAyi createAyi() {
		return new MonsterAyi(3, 12, 7, 20);
	}

}
