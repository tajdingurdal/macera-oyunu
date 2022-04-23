package game;

import java.util.Scanner;

import battle.battleLocation.Cave;
import battle.battleLocation.Forest;
import battle.battleLocation.Metal;
import battle.battleLocation.River;
import location.Location;
import location.SafeHouse;
import location.ToolStrore;
import player.Player;

public class Game {

	private static Scanner scanner = new Scanner(System.in);

	Player player;
	Location location;

	public static void start() throws Exception {

		System.out.println("Macera oyununa ho� geldiniz.");
		System.out.print("L�tfen bir isim giriniz ");
		String playerName = scanner.nextLine();
		Player player = new Player(playerName);

		System.out.println(player.getPlayerName() + " ho� geldin! L�tfen bir karakter numaras� se�.");
		player.selectChar();
		System.out.println("Harika! �imdi de bir lokasyon se�.");

		Location location = null;
		while (true) {

			System.out.println(
					"\n\t1. SafeHouse\n\t2. ToolStore\n\t3. Ma�ara\n\t4. Orman\n\t5. Nehir\n\t6. Maden\n\t7. ��k��");
			int select = scanner.nextInt();

			if (select == 1) {
				location = new SafeHouse(player);
			} else if (select == 2) {
				location = new ToolStrore(player);
			} else if (select == 3) {
				if (player.getInventory().isFood() == true) {
					System.out.println("Burada ki g�revini tamamlam��t�n");
					continue;
				}
				location = new Cave(player);
			} else if (select == 4) {
				if (player.getInventory().isFirewoord() == true) {
					System.out.println("Burada ki g�revini tamamlam��t�n");
					continue;
				}
				location = new Forest(player);
			} else if (select == 5) {
				if (player.getInventory().isWater() == true) {
					System.out.println("Burada ki g�revini tamamlam��t�n");
					continue;
				}
				location = new River(player);
			} else if (select == 6) {
				if (player.getInventory().isAwardSnake() == true) {
					System.out.println("Burada ki g�revini tamamlam��t�n");
					continue;
				}
				location = new Metal(player);
			} else if (select == 7) {
				System.out.println("��k�� yap�ld�");
				break;
			} else {
				location = new SafeHouse(player);
			}

			if (!location.onLocation()) {
				if (select == 1) {
					break;
				}
				System.out.println("\t\033[31m�ld�n! Oyun bitti\033[0m");
				break;
			}
		}

	}

}
