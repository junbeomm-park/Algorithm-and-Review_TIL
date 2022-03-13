package oop.starcraft;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine("마린",80);
		Medic medic = new Medic("메딕", 60);
		
		marine.stimpack();
		
		medic.heal(marine);
		
	}

}
