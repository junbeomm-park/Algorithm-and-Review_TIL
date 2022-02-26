package basic;

import java.util.Scanner;

public class basic_1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		double A = (double) a;
		System.out.println(String.format("%.2f", A/b));
		
	}

}
