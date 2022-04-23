package battle.battleLocation;

import java.util.Random;

import battle.obstacle.Obstacle;
import battle.obstacle.Snake;
import battle.obstacle.SnakeHelpClass;
import player.Player;

public class Metal extends BattleLocation {

	public static String award;

	public Metal(Player player) {
		super(player, "Maden", new Snake(), SnakeHelpClass.getAward(award), 5);

	}

}
