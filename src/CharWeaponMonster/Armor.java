package CharWeaponMonster;

public abstract class Armor extends Common {

	private int protect;

	public Armor(int id, int money, int protect) {
		super(id, money);
		this.protect = protect;
	}

	public int getProtect() {
		return protect;
	}

	public void setProtect(int protect) {
		this.protect = protect;
	}

}
