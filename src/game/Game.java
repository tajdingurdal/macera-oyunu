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

		System.out.println("Macera oyununa ho� geldiniz.");
		System.out.print("L�tfen bir isim giriniz ");
		String playerName = scanner.nextLine();
		Player player = new Player(playerName);

		System.out.println(player.getName() + " ho� geldin! L�tfen bir karakter numaras� se�.");
		player.selectChar();
		System.out.println("Harika! �imdi de bir lokasyon se�.");

		Location location = null;
		while (true) {

			System.out.println("\n\t1. SafeHouse\n\t2. ToolStore\n\t3. Ma�ara\n\t4. Orman\n\t5. Nehir\n\t6. ��k��");
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
				System.out.println("�ld�n kanka, oyun bitti");
				break;
			}
		}

	}

}
