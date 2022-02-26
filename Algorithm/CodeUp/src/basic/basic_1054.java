package basic;

import java.util.Scanner;

public class basic_1054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = 0;
		if(a==1 && b==1) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
		
	}

}
