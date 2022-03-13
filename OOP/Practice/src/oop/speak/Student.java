package oop.speak;

public class Student extends Man {
	String name;
	
	public Student() {}

	public Student(String name) {
		super(name);
		this.name = name;
	}
	
	public void speak() {
		System.out.println(getName() + "공부나 열심히해 ");
	}
	

}
