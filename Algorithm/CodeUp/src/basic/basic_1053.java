package basic;

import java.util.Scanner;

public class basic_1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int answer = 0;
		
		if(a == 1) {
			answer = 0;
		}else if(a == 0) {
			answer = 1;
		}
		System.out.println(answer);
	}

}
