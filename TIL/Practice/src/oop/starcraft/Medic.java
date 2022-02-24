package oop.starcraft;

public class Medic {

	String name;
	int hp;
	
	public Medic(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void heal(Marine target) {
		System.out.println(name+"의 치유! "+target.name+"HP :"+target.hp);
		target.hp += 10;
		System.out.println(target.hp);
	}

}
