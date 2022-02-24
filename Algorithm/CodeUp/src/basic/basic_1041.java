package basic;

import java.util.Scanner;

public class basic_1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		int num = (int)c;
		
		char result = (char)(num+1);
		
		
		System.out.println(result);
	}

}
