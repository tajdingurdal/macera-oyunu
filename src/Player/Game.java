package Player;

import java.util.Scanner;

import CharWeaponMonster.CharSamuray;
import Places.GuvenliEv;
import Places.Magara;

public class Game {

	static Player player = Player.createPlayer();

	public static void start() {

		String karakterler = "\t1. Samuray \n\t2. Ok�u \n\t3. �ovalye \n\tq = ��k��";
		System.out.println("L�tfen bir karakter se�iniz\n\n" + karakterler);

		Scanner scanner = new Scanner(System.in);
		String karakter = scanner.nextLine();

		while (true) {

			if (karakter.equals("1")) {
				CharSamuray samuray = CharSamuray.createSamuray();
				player.setCharacter(samuray);

				System.out.println("Samuray karakterini se�tiniz. �zellikler:\nHasar: " + samuray.getHasar()
						+ "\nSa�l�k: " + samuray.getHealth() + "\nPara: " + samuray.getMoney());

				GuvenliEv guvenliEv = new GuvenliEv();
				guvenliEv.ozellik(player);

				System.out.println("Sava�acak mekan� se�iniz. Mekanlar:\n1.Ma�ara\n2.Orman\n3.Nehir\n4.Ma�azaya git");
				String mekan = scanner.nextLine();

				if (mekan.equals("1")) {
					System.out.println("Ma�araya girdiniz!");
					Magara magara = new Magara();
					magara.canavar();
					
					
				}
				if (mekan.equals("2")) {
					
				}
				if (mekan.equals("3")) {
					
				}
				if (mekan.equals("4")) {
					
				}
			}
			if (karakter.equals("2")) {

			}
			if (karakter.equals("3")) {

			}

			if (karakter.equals("q")) {
				System.out.println("Oyundan ��k�� yap�ld�.");
				break;
			}

		}
	}

}
