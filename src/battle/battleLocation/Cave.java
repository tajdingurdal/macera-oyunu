package battle.battleLocation;

import battle.obstacle.Zombie;
import player.Player;

public class Cave extends BattleLocation {

	public Cave(Player player) {
		super(player, "Maðara", new Zombie(), "Food", 3);
	}

}
