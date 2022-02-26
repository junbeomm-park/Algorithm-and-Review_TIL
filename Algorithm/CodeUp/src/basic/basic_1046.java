package basic;

import java.util.Scanner;

public class basic_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double A = (double)a; 
		double result = (A+b+c)/3;
		System.out.println(a+b+c);
		System.out.println(String.format("%.1f", result));
	}

}
