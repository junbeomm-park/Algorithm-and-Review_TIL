package oop.speak;

public class Reader extends Man implements Speakable {
	String name;
	
	public Reader() {
		
	}
	

	public Reader(String name) {
		super(name);
		this.name = name;
	}


	@Override
	public void speak() {
		System.out.println(getName() + "자바 화이팅");
	}

}
