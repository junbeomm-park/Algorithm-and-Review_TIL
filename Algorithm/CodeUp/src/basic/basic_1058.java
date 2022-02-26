package basic;

import java.util.Scanner;

public class basic_1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 1(참)
		int b = sc.nextInt(); // 0(거짓)  참거짓이 서로 같을 때만 1출력
		
		int answer = 0;
		if(a==b) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
	}

}
