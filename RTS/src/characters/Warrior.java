package characters;

public class Warrior extends Character {
	
	public Warrior() {
		this.attack_type = "meele";
	}
	
	public Warrior(String name, int damage, int hp, int armor, int pierce_armor, double speed, double rof) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.armor = armor;
		this.pierce_armor = pierce_armor;
		this.speed = speed;
		this.rof = rof;
		this.attack_type = "meele";
	}
}
