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

		System.out.println("Macera oyununa hoþ geldiniz.");
		System.out.print("Lütfen bir isim giriniz ");
		String playerName = scanner.nextLine();
		Player player = new Player(playerName);

		System.out.println(player.getPlayerName() + " hoþ geldin! Lütfen bir karakter numarasý seç.");
		player.selectChar();
		System.out.println("Harika! Þimdi de bir lokasyon seç.");

		Location location = null;
		while (true) {

			System.out.println(
					"\n\t1. SafeHouse\n\t2. ToolStore\n\t3. Maðara\n\t4. Orman\n\t5. Nehir\n\t6. Maden\n\t7. Çýkýþ");
			int select = scanner.nextInt();

			if (select == 1) {
				location = new SafeHouse(player);
			} else if (select == 2) {
				location = new ToolStrore(player);
			} else if (select == 3) {
				if (player.getInventory().isFood() == true) {
					System.out.println("Burada ki görevini tamamlamýþtýn");
					continue;
				}
				location = new Cave(player);
			} else if (select == 4) {
				if (player.getInventory().isFirewoord() == true) {
					System.out.println("Burada ki görevini tamamlamýþtýn");
					continue;
				}
				location = new Forest(player);
			} else if (select == 5) {
				if (player.getInventory().isWater() == true) {
					System.out.println("Burada ki görevini tamamlamýþtýn");
					continue;
				}
				location = new River(player);
			} else if (select == 6) {
				if (player.getInventory().isAwardSnake() == true) {
					System.out.println("Burada ki görevini tamamlamýþtýn");
					continue;
				}
				location = new Metal(player);
			} else if (select == 7) {
				System.out.println("Çýkýþ yapýldý");
				break;
			} else {
				location = new SafeHouse(player);
			}

			if (!location.onLocation()) {
				if (select == 1) {
					break;
				}
				System.out.println("\t\033[31mÖldün! Oyun bitti\033[0m");
				break;
			}
		}

	}

}
