package oop.cylinder;

public class Cylinder {
	double radius;
	double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double Volume() {
		double volume = (radius*radius)*Math.PI*height;
		return volume;
	}
	
	public double Area() {
		double area = (2*Math.PI*radius*height) + (2*Math.PI*(radius*radius));
		return area;
	}


}
