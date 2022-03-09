package basic;

import java.util.Scanner;

public class basic_1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String str = sc.next();
			
			if(str.equals("q")) {
				System.out.println(str);
				break;
			}
			System.out.println(str);
		}
		
	}

}
