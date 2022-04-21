package battle;

public class Obstacle {

	private String name;
	private int id;
	private int damage;
	private int health;
	private int money;
	private int originalHealth;

	public Obstacle(String name, int id, int damage, int health, int money) {
		super();
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.originalHealth = health;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		if (health < 0) {
			this.health = 0;
		}
		return health;
	}

	public void setHealth(int health) {

		if (health < 0) {
			this.health = 0;
		}
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}

}
