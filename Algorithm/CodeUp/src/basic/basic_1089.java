package basic;

import java.util.Scanner;

public class basic_1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		
		result = a + (n-1)*d;
		System.out.println(result);
	}

}
