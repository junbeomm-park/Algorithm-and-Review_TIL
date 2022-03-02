package basic;

import java.util.Scanner;

public class basic_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			
			if(a == 0) {
				return;
			}
			System.out.println(a);
		}
	}
}
