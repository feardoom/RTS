package game;

import characters.Archer;
import characters.Character;
import characters.Knight;
import characters.Warrior;
import tools.easyIO;

public class Main {
	static easyIO c = new easyIO();
	public static Character [] units = new Character[3];
	public static void main(String[] args) {
		
		int attacker, target = 0;

		//Warrior unit1 = new Warrior("Champion", 12, 120, 4, 4, 1.25, 1.6);
		//Archer unit2 = new Archer("Bowman", 18, 60, 1, 0, 1.70, 1.4, 7);
		//Knight unit3 = new Knight("Knight", 20, 280, 7, 5, 2.5, 1.2);
		
		
		units[0] = new Warrior("Champion", 12, 50, 4, 4, 1.25, 1.6);
		units[1] = new Archer("Bowman", 18, 30, 1, 0, 1.70, 1.4, 7);
		units[2] = new Knight("Knight", 20, 90, 7, 5, 2.5, 1.2);
		
		do {
			c.writeLine("\nInsert [n of attacker] ENTER [n of target] / insert -1 to end battle");
			listUnits();
			attacker = c.readN();
			if (attacker==-1) {
				break;
			}
			target = c.readN();
						
			units[attacker].attack(units[target]);
			
		} while(true);
	}
	
	public static void listUnits() {
		for(int i = 0; i<3; i++) {
			c.writeLine(i + "." + units[i].getName() + ": " + (units[i].getHP()==0?"dead": units[i].getHP() + "hp")); 
		}
	}
	
	

}
