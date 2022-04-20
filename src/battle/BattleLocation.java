package battle;

import java.util.Random;

import location.Location;
import player.Player;

public abstract class BattleLocation extends Location {

	private Obstacle obstacle;
	private String award;
	private int maxObstacle;

	public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
		super(player, name);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;
	}

	@Override
	public boolean onLocation() {
		int random = randomObstacle();
		System.out.println(
				"�uan da " + getName() + " i�erisindesin! Ve " + random + " tane " + obstacle.getName() + " var.");
		System.out.println("<S>ava� veya <K>a�!");
		String select = scanner.nextLine();

		if (select.equals("S") || select.equals("s")) {
			combat(random);

		} else if (select.equals("K") || select.equals("k")) {
			System.out.print("Ka�");
		}

		return true;
	}

	private void combat(int random) {

		for (int i = 1; i <= random; i++) {
			playerStatus();
			obstacleStatus();

			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				System.out.println("<V>ur ");
				String vur = scanner.nextLine();

				if (vur.equals("V") || vur.equals("v")) {
					this.getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getDamage());
					System.out.println(getObstacle().getName() + " can� " + getPlayer().getDamage() + " azald�");
				}

			}
		}

	}

	private void obstacleStatus() {
		System.out.println(this.getObstacle().getName() + " �zellikleri\n\033[31mHasar: "
				+ this.getObstacle().getDamage() + "\nSaglik: " + this.getObstacle().getHealth() + "\nKazanc: "
				+ this.getObstacle().getMoney() + "\033[0m");
	}

	private void playerStatus() {
		System.out.println(this.getPlayer().getPlayerName() + " �zelliklerin\n\033[0;31mSagligin: "
				+ this.getPlayer().getHealth() + "\nHasar�n: " + this.getPlayer().getDamage() + "\nSilahin: "
				+ this.getPlayer().getInventory().getWeaponName() + "\nBakiyen: " + this.getPlayer().getMoney()
				+ "\nZ�rh�n: " + this.getPlayer().getInventory().getArmorName() + "\u001B[0m");
	}

	public int randomObstacle() {
		Random r = new Random();
		return r.nextInt(getMaxObstacle()) + 1;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

	public Obstacle getObstacle() {
		return obstacle;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

}
