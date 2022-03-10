package basic;

import java.util.Scanner;

public class basic_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			sum += i;
			if(sum >= n) {
				System.out.println(i);
				break;
			}
		}
	}
}
