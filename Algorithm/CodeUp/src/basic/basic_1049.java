package basic;

import java.util.Scanner;

public class basic_1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = 0;
		
		if(a>b) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
	}

}
