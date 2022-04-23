package battle.battleLocation;

import java.util.Random;

import battle.obstacle.Obstacle;
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
			if (combat(random)) {
				System.out.println(getPlayer().getPlayerName() + " Tebrikler! T�m " + getObstacle().getName()
						+ "'leri �ld�rd�n. G�rev �d�l�n " + getAward());

				if (obstacle.getName().equals("Zombi")) {
					getPlayer().getInventory().setFood(true);
				}
				if (obstacle.getName().equals("Vampir")) {
					getPlayer().getInventory().setFirewoord(true);
				}
				if (obstacle.getName().equals("Ay�")) {
					getPlayer().getInventory().setWater(true);
				}
				if (obstacle.getName().equals("Y�lan")) {
					getPlayer().getInventory().setAwardSnake(true);
				}

				getPlayer().setMoney((int) (getPlayer().getMoney() + getObstacle().getMoney() * random));
				playerStatus();
				return true;
			}

		} else if (select.equals("K") || select.equals("k")) {
			System.out.print("Ka�t�n " + getPlayer().getPlayerName());
		}

		if (getPlayer().getHealth() <= 0) {
			return false;
		}

		return true;
	}

	private boolean combat(int random) {

		Random r = new Random();
		int olas�l�k = (r.nextInt(2) + 1);

		for (int i = 1; i <= random; i++) {
			this.getObstacle().setHealth(getObstacle().getOriginalHealth());

			playerStatus();
			obstacleStatus();

			while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				if (olas�l�k == 1) {

					System.out.println("\033[31m" + i + ". " + getObstacle().getName() + " de size vuruyor!\033[0m");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					getPlayer().setHealth(getPlayer().getHealth() - getObstacle().getDamage());
					afterHit();
					if (getPlayer().getHealth() == 0) {
						return false;
					}
				}
				System.out.println("<V>ur ");
				String vur = scanner.nextLine();

				if (vur.equals("V") || vur.equals("v")) {
					this.getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getDamage());
					System.out.println(
							i + ". " + getObstacle().getName() + " can� " + getPlayer().getDamage() + " azald�");
					afterHit();

					if (getObstacle().getHealth() > 0) {

						System.out
								.println("\033[31m" + i + ". " + getObstacle().getName() + " de size vuruyor!\033[0m");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						getPlayer().setHealth(getPlayer().getHealth() - getObstacle().getDamage());
						afterHit();
						if (getPlayer().getHealth() == 0) {
							return false;
						}

					} else if (getPlayer().getHealth() <= 0) {
						return false;
					} else {

						System.out.println(getObstacle().getName() + "\033[31m �ld�rd�n!\033[0m �d�l�n: "
								+ getObstacle().getMoney() + " coin");

					}

				}

			}
		}
		return true;

	}

	private void afterHit() {
		System.out.println(getPlayer().getPlayerName() + " g�ncel can�n: " + getPlayer().getHealth() + "\nVe "
				+ getObstacle().getName() + " g�ncel can�: " + getObstacle().getHealth());

	}

	private void obstacleStatus() {
		System.out.println(this.getObstacle().getName() + " �zellikleri\n\033[31mHasar: "
				+ this.getObstacle().getDamage() + "\nSaglik: " + this.getObstacle().getHealth() + "\nKazanc: "
				+ this.getObstacle().getMoney() + "\033[0m" + "\n");
	}

	private void playerStatus() {
		System.out.println(this.getPlayer().getPlayerName() + " G�ncel �zelliklerin\n\033[0;31mSagligin: "
				+ this.getPlayer().getHealth() + "\nHasar�n: " + this.getPlayer().getDamage() + "\nSilahin: "
				+ this.getPlayer().getInventory().getWeaponName() + "\nBakiyen: " + this.getPlayer().getMoney()
				+ "\nZ�rh�n: " + this.getPlayer().getInventory().getArmorName() + "\u001B[0m" + "\n");
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
