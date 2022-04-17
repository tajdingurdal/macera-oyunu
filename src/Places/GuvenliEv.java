package Places;

import Player.Player;

public class GuvenliEv extends Ortak {

	@Override
	public void ozellik(Player player) { // Özellik : Can Yenileniyor

		if (player.getHealth() < player.getCharacter().getHealth()) {

			player.setHealth(player.getCharacter().getHealth());

			System.out.println("Canýnýz dolduruldu!");
		} else {
			System.out.println("Canýnýz zaten dolu");
		}

	}

}
