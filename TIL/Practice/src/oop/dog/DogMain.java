package oop.dog;

public class DogMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "네로";
		dog.breeds = "페르시안";
		dog.age = 3;
		
		System.out.println(dog.name);
		System.out.println(dog.breeds);
		System.out.println(dog.age);
	}
}
