package battle;

import player.Player;

public class Cave extends BattleLocation {

	public Cave(Player player) {
		super(player, "Ma�ara", new Zombie(), "Food", 3);
	}

}
