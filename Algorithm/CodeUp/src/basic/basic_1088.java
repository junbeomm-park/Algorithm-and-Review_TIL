package basic;

import java.util.Scanner;

public class basic_1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
