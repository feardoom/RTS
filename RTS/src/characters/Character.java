package characters;

public class Character extends game.Main {
	protected String name;
	protected int damage;
	protected int hp;
	protected int armor;
	protected int pierce_armor;
	protected int range = 0;
	protected double speed;
	protected double rof;
	protected String attack_type;
	
	
	public Character(){
		
	}

	public void take_damage(int damage, String type) {
		if (type=="meele") {
			this.hp -= (damage<=this.armor? 1 : damage-this.armor);
		} else {
			this.hp -= (damage<=this.pierce_armor? 1 : damage-this.pierce_armor);
		}
	}
	
	public void attack(Character target) {
		target.take_damage(this.getDamage(), this.getAttackType());
	}
		
	public int getDamage() {
		return this.damage;
	}
	
	public int getHP() {
		return (this.hp<0?0:this.hp);
	}
	
	public int getArmor() {
		return this.armor;
	}
	
	public int getPierceArmor() {
		return this.pierce_armor;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public double getROF() {
		return this.rof;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAttackType() {
		return this.attack_type;
	}
	
}
