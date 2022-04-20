package game;

import java.util.Scanner;

import battle.Cave;
import battle.Forest;
import battle.River;
import location.Location;
import location.SafeHouse;
import location.ToolStrore;
import player.Player;

public class Game {

	private Scanner scanner = new Scanner(System.in);

	Player player;
	Location location;

	public void start() throws Exception {

		System.out.println("Macera oyununa hoþ geldiniz.");
		System.out.print("Lütfen bir isim giriniz ");
		String playerName = scanner.nextLine();
		Player player = new Player(playerName);

		System.out.println(player.getName() + " hoþ geldin! Lütfen bir karakter numarasý seç.");
		player.selectChar();
		System.out.println("Harika! Þimdi de bir lokasyon seç.");

		Location location = null;
		while (true) {

			System.out.println("\n\t1. SafeHouse\n\t2. ToolStore\n\t3. Maðara\n\t4. Orman\n\t5. Nehir\n\t6. Çýkýþ");
			int select = scanner.nextInt();

			if (select == 1) {
				location = new SafeHouse(player);
			} else if (select == 2) {
				location = new ToolStrore(player);
			} else if (select == 3) {
				location = new Cave(player);
			} else if (select == 4) {
				location = new Forest(player);
			} else if (select == 5) {
				location = new River(player);
			} else if (select == 6) {
				break;
			} else {
				location = new SafeHouse(player);
			}

			if (!location.onLocation()) {
				System.out.println("Öldün kanka, oyun bitti");
				break;
			}
		}

	}

}
