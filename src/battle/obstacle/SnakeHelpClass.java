package battle.obstacle;

import java.util.Random;

import battle.battleLocation.Metal;

public class SnakeHelpClass {
	public static int damage;
	public static String award;

	public static int getDamage() {
		Random r = new Random();

		int olas�l�k = (r.nextInt(4) + 1);

		if (olas�l�k == 1) {
			damage = 3;
			return damage;

		}
		if (olas�l�k == 2) {
			damage = 4;
			return damage;
		}
		if (olas�l�k == 3) {
			damage = 5;
			return damage;
		}

		damage = 6;
		return damage;
	}

	public static String getAward(String s) {
		Random a = new Random();
		int olas�l�k = (a.nextInt(3) + 1);

		if (olas�l�k == 1) {
			award = "Money";
			return award;
		}
		if (olas�l�k == 2) {
			award = "Weapon";
			return award;
		}

		award = "Armor";
		return award;

	}
}
