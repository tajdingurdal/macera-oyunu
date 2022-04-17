package CharWeaponMonster;

public abstract class Weapons extends Common {

	private int damage;

	public Weapons(int id, int money, int damage) {
		super(id, money);
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
