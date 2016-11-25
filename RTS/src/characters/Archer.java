package characters;

public class Archer extends Character {
	
	public int fire_arrow_damage = 15;
	
	public Archer() {
		this.attack_type = "ranged";
	}
	
	public Archer(String name, int damage, int hp, int armor, int pierce_armor, double speed, double rof, int range) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.armor = armor;
		this.pierce_armor = pierce_armor;
		this.speed = speed;
		this.rof = rof;
		this.range = range;
		this.attack_type = "ranged";
	}
	
	public void fire_arrow_attack() {
		
	}
	
}
