package basic;

import java.util.Scanner;

public class basic_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = Integer.valueOf(s, 16);
		
		System.out.printf("%o",n);
	}
}
