package location;

import defence.Armor;
import defence.HeavyArmor;
import defence.LightArmor;
import defence.MiddleArmor;
import defence.Pistol;
import defence.Rifle;
import defence.Sword;
import defence.Weapon;
import player.Player;

public class ToolStrore extends NormalLocation {

	public ToolStrore(Player player) {
		super(player, "Maðaza");
	}

	@Override
	public boolean onLocation() {
		System.out.println("Þuan da Maðazadasýn. Ne alacaksýn?\n\n\t1. Silah\n\t2. Zýrh\n\t3. Geri dön");

		while (true) {
			int select = scanner.nextInt();

			if (select == 1) {
				buyWeapon();
			} else if (select == 2) {
				buyArmor();
			} else if (select == 3) {
				System.out.println("Çýkýþ yapýldý");
				break;
			} else {
				System.out.print("Bir seçim yapmadýn. Lütfen bir seçim yap: ");
			}

			if (select == 1 || select == 2 || select == 3) {
				break;
			}

		}

		return true;
	}

	private void buyWeapon() {
		System.out.println("Hangi silahý alacaksýn?\n");

		Weapon[] wp = printWeapon();

		while (true) {
			int select = scanner.nextInt();

			if (select == 1) {
				if (wp[0].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {
					getPlayer().setDamage(getPlayer().getDamage() + wp[0].getDamage());
					getPlayer().setMoney(getPlayer().getMoney() - wp[0].getPrice());
					getPlayer().getInventory().setWeaponDamage(wp[0].getDamage());
					getPlayer().getInventory().setWeaponName(wp[0].getName());

					System.out.println(getPlayer().getPlayerName() + " " + wp[0].getName()
							+ " silahýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
							+ "\n\t Saðlýk: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
							+ getPlayer().getMoney() + "\u001B[0m");

					break;
				}

			} else if (select == 2) {
				if (wp[1].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {
					getPlayer().setDamage(getPlayer().getDamage() + wp[1].getDamage());
					getPlayer().setMoney(getPlayer().getMoney() - wp[1].getPrice());
					getPlayer().getInventory().setWeaponDamage(wp[1].getDamage());
					getPlayer().getInventory().setWeaponName(wp[1].getName());

					System.out.println(getPlayer().getPlayerName() + " " + wp[1].getName()
							+ " silahýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
							+ "\n\t Saðlýk: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
							+ getPlayer().getMoney() + "\u001B[0m");

					break;
				}

			} else if (select == 3) {
				if (wp[2].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {
					getPlayer().setDamage(getPlayer().getDamage() + wp[2].getDamage());
					getPlayer().setMoney(getPlayer().getMoney() - wp[2].getPrice());
					getPlayer().getInventory().setWeaponDamage(wp[2].getDamage());
					getPlayer().getInventory().setWeaponName(wp[2].getName());

					System.out.println(getPlayer().getPlayerName() + " " + wp[2].getName()
							+ " silahýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t \033[0;31mHasar: " + getPlayer().getDamage() + "\u001B[0m"
							+ "\n\t Saðlýk: " + getPlayer().getHealth() + "\n\t \033[0;31mBakiye: "
							+ getPlayer().getMoney() + "\u001B[0m");

					break;
				}
			}
			if (select == 0) {
				System.out.println("Çýkýþ yapýldý");
				break;
			} else {
				System.out.print("Bir seçim yapmadýn. Lütfen bir seçim yap: ");
			}

			if (select == 1 || select == 2 || select == 3) {
				break;
			}

		}

	}

	private void buyArmor() {

		System.out.println("Hangi zýrhý alacaksýn?\n");

		Armor[] armr = printArmor();

		while (true) {
			int select = scanner.nextInt();

			if (select == 1) {
				if (armr[0].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {

					getPlayer().setMoney(getPlayer().getMoney() - armr[0].getPrice());
					getPlayer().setHealth(getPlayer().getHealth() + armr[0].getProtection());
					getPlayer().getInventory().setArmorDefence(armr[0].getProtection());
					getPlayer().getInventory().setArmorName(armr[0].getName());

					System.out.println(getPlayer().getPlayerName() + " " + armr[0].getName()
							+ " zýrhýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t Hasar: " + getPlayer().getDamage() + "\n\t \033[0;31mSaðlýk: "
							+ getPlayer().getHealth() + "\u001B[0m" + "\n\t \033[0;31mBakiye: " + getPlayer().getMoney()
							+ "\u001B[0m");

					break;
				}

			} else if (select == 2) {
				if (armr[1].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {

					getPlayer().setMoney(getPlayer().getMoney() - armr[1].getPrice());
					getPlayer().setHealth(getPlayer().getHealth() + armr[1].getProtection());
					getPlayer().getInventory().setArmorDefence(armr[1].getProtection());
					getPlayer().getInventory().setArmorName(armr[1].getName());

					System.out.println(getPlayer().getPlayerName() + " " + armr[1].getName()
							+ " zýrhýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t Hasar: " + getPlayer().getDamage() + "\n\t \033[0;31mSaðlýk: "
							+ getPlayer().getHealth() + "\u001B[0m" + "\n\t \033[0;31mBakiye: " + getPlayer().getMoney()
							+ "\u001B[0m");

					break;
				}

			} else if (select == 3) {
				if (armr[2].getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yetersiz bakiye. Fakir!");
					continue;
				} else {

					getPlayer().setMoney(getPlayer().getMoney() - armr[2].getPrice());
					getPlayer().setHealth(getPlayer().getHealth() + armr[2].getProtection());
					getPlayer().getInventory().setArmorDefence(armr[2].getProtection());
					getPlayer().getInventory().setArmorName(armr[2].getName());

					System.out.println(getPlayer().getPlayerName() + " " + armr[2].getName()
							+ " zýrhýný satýn aldýn.\nGüncel özelliklerin: ");

					System.out.println("\n\t Hasar: " + getPlayer().getDamage() + "\n\t \033[0;31mSaðlýk: "
							+ getPlayer().getHealth() + "\u001B[0m" + "\n\t \033[0;31mBakiye: " + getPlayer().getMoney()
							+ "\u001B[0m");

					break;
				}
			}
			if (select == 0) {
				System.out.println("Çýkýþ yapýldý");
				break;
			} else {
				System.out.print("Bir seçim yapmadýn. Lütfen bir seçim yap: ");
			}

			if (select == 1 || select == 2 || select == 3) {
				break;
			}
		}

	}

	private Armor[] printArmor() {
		Armor[] armor = { new LightArmor(), new MiddleArmor(), new HeavyArmor() };
		for (Armor armr : armor) {

			System.out.println(armr.getId() + ". " + armr.getName() + "\n\tKoruma: " + armr.getProtection()
					+ "\n\tFiyat: " + armr.getPrice());
		}
		System.out.println("0. Geri Dön");

		return armor;
	}

	private Weapon[] printWeapon() {
		Weapon[] wp = { new Pistol(), new Sword(), new Rifle() };
		for (Weapon w : wp) {
			System.out.println(
					w.getId() + ". " + w.getName() + "\n\tHasar: " + w.getDamage() + "\n\tFiyat: " + w.getPrice());
		}
		System.out.println("0. Geri Dön");
		return wp;
	}

}
