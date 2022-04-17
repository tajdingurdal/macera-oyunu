package Player;

public class Player {

	public int health;
	public CharWeaponMonster.Character character; // karakter

	public Player() {

	}

	public static Player createPlayer() {
		Player player = new Player();
		return player;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		health = health;
	}

	public CharWeaponMonster.Character getCharacter() {
		return character;
	}

	public void setCharacter(CharWeaponMonster.Character character) {
		this.character = character;
	}

}
