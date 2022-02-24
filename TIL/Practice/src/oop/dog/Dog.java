package oop.dog;

public class Dog {
	String name;
	String breeds;
	int age;
	
	public Dog() {
		
	}
	
	public Dog(String name, String breeds, int age) {
		this.name = name;
		this.breeds = breeds;
		this.age = age;
	}
	
	public void wag() {
		System.out.println("꼬리치기");
	}
	
	public void bark() {
		System.out.println("짖기");
	}
}
