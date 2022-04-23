import java.util.Random;

import game.Game;

public class Main {

	public static void main(String[] args) throws Exception {
		Game.start();

//		Snake s = new Snake(null, 0);
//		System.out.println(s.damage);
//		System.out.println(s.ad);

	}

}

class Snake {
	String ad = "Yýlan";
	int damage = 0;

	public Snake(String ad, int damage) {
		super();
		ad = this.ad;

		Random r = new Random();
		int olasýlýk = (r.nextInt(4) + 1);
		if (olasýlýk == 1) {
			this.damage = 3;
		}
		if (olasýlýk == 2) {
			this.damage = 4;
		}
		if (olasýlýk == 3) {
			this.damage = 5;
		}
		if (olasýlýk == 4) {
			this.damage = 6;
		}
	}

}