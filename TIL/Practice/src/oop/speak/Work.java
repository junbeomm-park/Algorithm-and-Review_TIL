package oop.speak;

public class Work extends Man implements Speakable {
	String name;
	
	public Work() {
		
	}
	
	
	public Work(String name) {
		super(name);
		this.name = name;
	}


	@Override
	public void speak() {
		System.out.println(getName() + "열심히 일해야 한다.");

	}

}
