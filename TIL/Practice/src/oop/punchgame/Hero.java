package oop.punchgame;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name) {
		this.name = name;
		hp = 30;
	}
	
	public void punch(Hero enemy) {
		enemy.hp -= 10;
		System.out.println("["+this.name+"]의 펀치");
	    System.out.println(enemy.name+": "+enemy.hp+"/30");
	    
	}
	
	public static void battle(Hero a, Hero b) {
		while(a.hp > 0 && b.hp > 0) {
			Hero attacker, defender;
			
			if(Math.random() < 0.5) {
				attacker = a;
				defender = b;
			}else {
				attacker = b;
				defender = a;
			}
			
			attacker.punch(defender);
		}
	}
}
