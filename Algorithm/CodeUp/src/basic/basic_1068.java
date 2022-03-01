package basic;

import java.util.Scanner;

public class basic_1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		}else if(a >= 70 && a < 90) {
			System.out.println("B");
		}else if(a >= 40 && a < 70) {
			System.out.println("C");
		}else if(a >= 0 && a < 40) {
			System.out.println("D");
		}
	}

}
