package repetitive;

import java.util.Scanner;

public class star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 
		for(int i = 1 ; i <= n ; i++) {
			for(int o = 1; o <= n-i ; o++) {
				System.out.print(" ");
			}
			for(int p = 1; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
