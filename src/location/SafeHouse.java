package location;

import player.Player;

public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {
		super(player, "G�venli Ev");
	}

	@Override
	public boolean onLocation() {
		System.out.println("�uan da g�venli evdesiniz.");

		System.out.println("Can�n�z yenilendi.");
		return true;
	}

}
