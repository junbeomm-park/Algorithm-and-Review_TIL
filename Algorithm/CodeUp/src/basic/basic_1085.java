package basic;

import java.util.Scanner;

public class basic_1085 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double s = sc.nextInt();
		
		double result = (h*b*c*s)/8/1024/1024;
		
		System.out.printf("%.1f MB", result);
	}
}
