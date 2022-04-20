package location;

import player.Player;

public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}

	@Override
	public boolean onLocation() {
		System.out.println("Þuan da güvenli evdesiniz.");

		System.out.println("Canýnýz yenilendi.");
		return true;
	}

}
