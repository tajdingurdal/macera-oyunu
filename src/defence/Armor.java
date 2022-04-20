package defence;

public abstract class Armor extends Defence {

	private int protection;
	private String name;

	public Armor(int id, int money, int protection, String name) {
		super(id, money);
		this.protection = protection;
		this.name = name;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
