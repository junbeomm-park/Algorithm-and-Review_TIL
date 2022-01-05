package repetitive;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 
		for(int i = 1 ; i <= n ; i++) {
			for(int o = 1; o <= i ; o++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
