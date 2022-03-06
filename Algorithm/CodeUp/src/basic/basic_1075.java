package basic;

import java.util.Scanner;

public class basic_1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n!=0) {
			for(int i = n-1; i >= 0; i--) {
				System.out.println(i);
			}
			break;
		}
	}

}
