package Player;

import java.util.Scanner;

import CharWeaponMonster.CharSamuray;
import Places.GuvenliEv;
import Places.Magara;

public class Game {

	static Player player = Player.createPlayer();

	public static void start() {

		String karakterler = "\t1. Samuray \n\t2. Okçu \n\t3. Þovalye \n\tq = Çýkýþ";
		System.out.println("Lütfen bir karakter seçiniz\n\n" + karakterler);

		Scanner scanner = new Scanner(System.in);
		String karakter = scanner.nextLine();

		while (true) {

			if (karakter.equals("1")) {
				CharSamuray samuray = CharSamuray.createSamuray();
				player.setCharacter(samuray);

				System.out.println("Samuray karakterini seçtiniz. Özellikler:\nHasar: " + samuray.getHasar()
						+ "\nSaðlýk: " + samuray.getHealth() + "\nPara: " + samuray.getMoney());

				GuvenliEv guvenliEv = new GuvenliEv();
				guvenliEv.ozellik(player);

				System.out.println("Savaþacak mekaný seçiniz. Mekanlar:\n1.Maðara\n2.Orman\n3.Nehir\n4.Maðazaya git");
				String mekan = scanner.nextLine();

				if (mekan.equals("1")) {
					System.out.println("Maðaraya girdiniz!");
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
				System.out.println("Oyundan çýkýþ yapýldý.");
				break;
			}

		}
	}

}
