package characters;

public class Knight extends Character {
		
	public Knight() {
		this.attack_type = "melee";
	}
	
	public Knight(String name, int damage, int hp, int armor, int pierce_armor, double speed, double rof) {
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
