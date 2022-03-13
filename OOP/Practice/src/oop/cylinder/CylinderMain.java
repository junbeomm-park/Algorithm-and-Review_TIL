package oop.cylinder;

public class CylinderMain {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		
		System.out.println("원기둥의 부피"+c.Volume());
		System.out.println("원기둥의 겉넓이"+c.Area());
	}
}
