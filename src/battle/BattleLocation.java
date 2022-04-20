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
				"Þuan da " + getName() + " içerisindesin! Ve " + random + " tane " + obstacle.getName() + " var.");
		System.out.println("<S>avaþ veya <K>aç!");
		String select = scanner.nextLine();

		if (select.equals("S") || select.equals("s")) {
			System.out.println("savaþ");
		} else if (select.equals("K") || select.equals("k")) {
			System.out.println("kaç");
		}

		return true;
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
