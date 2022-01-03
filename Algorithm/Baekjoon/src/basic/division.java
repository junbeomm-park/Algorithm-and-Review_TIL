package basic;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			System.out.println(a/b);
		}
		
	}
}
