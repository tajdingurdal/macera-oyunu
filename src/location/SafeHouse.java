package location;

import player.Player;

public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}

	@Override
	public boolean onLocation() {
		System.out.println("Þuan da güvenli evdesiniz.");

		if (getPlayer().getInventory().isFirewoord() == true && getPlayer().getInventory().isFood() == true
				&& getPlayer().getInventory().isWater() == true) {
			System.out.println("Oyunu bitirdiniz, tebrikler!");
		}

		if (getPlayer().getHealth() >= this.getPlayer().getOriginalHealth()) {
			System.out.println("Sagliginiz zaten iyi");
		}

		getPlayer().setHealth(getPlayer().getOriginalHealth());
		System.out.println("Sagliginiz yenilendi. Güncel saglik: " + getPlayer().getHealth());
		return true;

	}

}
