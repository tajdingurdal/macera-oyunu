package Places;

import java.util.Random;
import java.util.Scanner;

import CharWeaponMonster.MonsterZombi;
import Player.Player;

public class Magara extends MagaraOrmanNehirOrtak {

	@Override
	public void canavar() {
		Random rand = new Random();
		int random = rand.nextInt(3);
		MonsterZombi zombi1 = null;
		MonsterZombi zombi2 = null;
		MonsterZombi zombi3 = null;

		for (int i = 1; i <= random; i++) {

			if (zombi1 != null) {
				zombi2 = MonsterZombi.createZombi();
				continue;
			} else if (zombi2 != null) {
				zombi3 = MonsterZombi.createZombi();
				break;
			}
			zombi1 = MonsterZombi.createZombi();
			continue;

		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Zombi geliyor, saldýrmak için Space tuþuna basýn");
		while(true) {
			String line = scanner.nextLine();
			if(line.equals(" ")) {
				
			}
		}
		

	}

	@Override
	public void esya() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ozellik(Player player) { // Özellik : Savaþ + Ganimet
		// TODO Auto-generated method stub

	}

}
