package basic;

import java.util.Scanner;

public class basic_1020 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] code= x.split("-");
//		String[] code= sc.nextLine().split("-");
		
		String a1 = code[0].toString();
		String a2 = String.valueOf(code[1]);
		
		System.out.println(a1+a2);
	}
}
