package basic_math;

import java.util.Scanner;

public class math_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1;
		int r = 2;
		
		if(n == 1) {
			System.out.print(1);
		}else {
			while(r <= n) {
				r = r + (count * 6);
				count++;
			}
			System.out.println(count);
		}
		
		
	}
}
