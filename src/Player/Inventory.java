package player;

public class Inventory {

	private boolean water;
	private boolean food;
	private boolean firewoord;
	private String weaponName;
	private String armorName;
	private int weaponDamage;
	private int armorDefence;

	public Inventory(boolean water, boolean food, boolean firewoord, String weaponName, String armorName,
			int weaponDamage, int armorDefence) {
		super();
		this.water = water;
		this.food = food;
		this.firewoord = firewoord;
		this.weaponName = weaponName;
		this.armorName = armorName;
		this.weaponDamage = weaponDamage;
		this.armorDefence = armorDefence;
	}

	public Inventory() {
		super();
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFirewoord() {
		return firewoord;
	}

	public void setFirewoord(boolean firewoord) {
		this.firewoord = firewoord;
	}

	public String getWeaponName() {
		if (weaponName == null) {
			return "Silah yok";
		}
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getArmorName() {
		if (armorName == null) {
			return "Zýrh yok";
		}
		return armorName;
	}

	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}

	public int getWeaponDamage() {
		if (weaponDamage == 0) {
			return 0;
		}
		return weaponDamage;
	}

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getArmorDefence() {
		return armorDefence;
	}

	public void setArmorDefence(int armorDefence) {
		this.armorDefence = armorDefence;
	}

}
