package player;

import character.Archer;
import character.GameChar;
import character.Knight;
import character.Samurai;

public class Player {

	private Inventory inventory;
	private int damage;
	private int health;
	private int money;
	private String name;

	public Player(String name) {
		super();

		this.name = name;
	}

	public void selectChar() {
		GameChar[] chr = { new Samurai(), new Archer(), new Knight() };
		for (GameChar c : chr) {
			System.out.println("\n\t" + c.getId() + ". " + c.getName() + "\n\t" + "Hasar: " + c.getDamage() + "\n\t"
					+ "Saðlýk: " + c.getHealth() + "\n\t" + "Bakiye: " + c.getMoney() + "\n");
		}

	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
