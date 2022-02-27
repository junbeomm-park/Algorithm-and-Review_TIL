package basic;

import java.util.Scanner;

public class basic_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int even = 0;
		
		if(a % 2 != 1) {
			even = a;
			System.out.println(even);
		}
		
		if (b % 2 != 1) {
			even = b;
			System.out.println(even);
			
		}
		if (c % 2 != 1) {
			even = c;
			System.out.println(even);
		}
		
		
	}

}
