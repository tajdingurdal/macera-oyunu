package CharWeaponMonster;

public abstract class CommonCharAndMonster extends Common {

	private int damage;
	private int health;

	public CommonCharAndMonster(int id, int money, int damage, int health) {
		super(id, money);
		this.damage = damage;
		this.health = health;
	}

	public int getHasar() {
		return damage;
	}

	public void setHasar(int hasar) {
		this.damage = hasar;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
