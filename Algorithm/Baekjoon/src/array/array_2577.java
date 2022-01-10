package array;

import java.util.Scanner;

public class array_2577 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String sum = a*b*c+"";
		sc.close();
		
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int o = 0; o< sum.length();o++) {
				if((sum.charAt(o) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
