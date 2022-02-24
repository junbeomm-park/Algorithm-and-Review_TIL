package oop.punchgame;

public class HeroMain {

	public static void main(String[] args) {
		Hero arthas = new Hero("아서스");
		Hero reona = new Hero("레오나");
		
		Hero.battle(arthas, reona);
		
	}
}
