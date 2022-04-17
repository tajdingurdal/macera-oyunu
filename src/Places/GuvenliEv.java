package Places;

import Player.Player;

public class GuvenliEv extends Ortak {

	@Override
	public void ozellik(Player player) { // �zellik : Can Yenileniyor

		if (player.getHealth() < player.getCharacter().getHealth()) {

			player.setHealth(player.getCharacter().getHealth());

			System.out.println("Can�n�z dolduruldu!");
		} else {
			System.out.println("Can�n�z zaten dolu");
		}

	}

}
