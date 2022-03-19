package basic;

import java.util.Scanner;

public class basic_1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			a *= r;
		}
		System.out.println(a);
	}
}
