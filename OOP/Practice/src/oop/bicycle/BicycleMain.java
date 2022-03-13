package oop.bicycle;

public class BicycleMain {
	
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		System.out.println("b1 :"+b1.name+b1.weight+b1.price);
		
		Bicycle b2 = new Bicycle();
		
		b2.name = "산악형 자전거";
		b2.weight = 10.68;
		b2.price = 429000;
		
		System.out.println("b2 :"+b2.name+b2.weight+b2.price);
	}

}
