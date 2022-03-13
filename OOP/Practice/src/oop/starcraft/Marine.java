package oop.starcraft;

public class Marine {
	
	String name;
	int hp;
	
	public Marine(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void stimpack() {
		System.out.println(name+"의 스팀팩 ! HP :"+hp);
		hp -= 10;
		System.out.println(hp);
	}
	
}
