package basic;

import java.util.Scanner;

public class basic_1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = n/10000;
		int b = (n/1000)%(a*10);
		int c = (n/100)%((a*100)+(b*10));
		int d = (n/10)%((a*1000)+(b*100)+(c*10));
		int e = (n/1)%((a*10000)+(b*1000)+(c*100)+(d*10));
		
		System.out.println("["+a+"0000]");
		System.out.println("["+b+"000]");
		System.out.println("["+c+"00]");
		System.out.println("["+d+"0]");
		System.out.println("["+e+"]");
	}
}
