package basic_math;

import java.util.Scanner;

public class math_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c <= b) {
			System.out.println("-1");
		}else {
			System.out.println((a / (c -b))+1);
		}
		
		
	}
}
