package battle.battleLocation;

import battle.obstacle.Bear;
import player.Player;

public class River extends BattleLocation {

	public River(Player player) {
		super(player, "Nehir", new Bear(), "Water", 2);
	}

}
