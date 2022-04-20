package player;

import java.util.Scanner;

import character.Archer;
import character.GameChar;
import character.Knight;
import character.Samurai;

public class Player {

	private Inventory inventory;
	private int damage;
	private int health;
	private int money;
	private String charName;
	private String playerName;

	public Player(String playerName) {
		super();

		this.playerName = playerName;
	}

	public void selectChar() {
		GameChar[] chr = { new Samurai(), new Archer(), new Knight() };
		for (GameChar c : chr) {
			System.out.println("\n\t" + c.getId() + ". " + c.getName() + "\n\t" + "Hasar: " + c.getDamage() + "\n\t"
					+ "Saglik: " + c.getHealth() + "\n\t" + "Bakiye: " + c.getMoney() + "\n");
		}
		Scanner scanner = new Scanner(System.in);

		while (true) {

			int select = scanner.nextInt();

			if (select == 1) {
				initPlayer(new Samurai());
			} else if (select == 2) {
				initPlayer(new Archer());
			} else if (select == 3) {
				initPlayer(new Knight());
			} else {
				System.out.print("Bir seçim yapmadýn. Lütfen bir seçim yap: ");
			}

			if (select == 1 || select == 2 || select == 3) {
				System.out.println(this.getPlayerName() + " " + this.getCharName() + " karakterini seçtin\n\tHasar: "
						+ this.getDamage() + "\n\tSaðlýk: " + this.getHealth() + "\n\tBakiye: " + this.getMoney()
						+ "\n");
				break;
			}

		}

	}

	private void initPlayer(GameChar chr) {
		this.setCharName(chr.getName());
		this.setDamage(chr.getDamage());
		this.setHealth(chr.getHealth());
		this.setMoney(chr.getMoney());
		this.setInventory(new Inventory());

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

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
