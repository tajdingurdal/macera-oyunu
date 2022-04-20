package battle;

import player.Player;

public class Forest extends BattleLocation {

	public Forest(Player player) {
		super(player, "Orman", new Vampire(), "Wood", 3);
	}

}
