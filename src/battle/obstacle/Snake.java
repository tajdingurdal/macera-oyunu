package battle.obstacle;

import java.util.Random;

public class Snake extends Obstacle {

	public static int damage = SnakeHelpClass.getDamage();

	public Snake() {
		super("Yýlan", 4, damage, 12, 0);
	}

}
