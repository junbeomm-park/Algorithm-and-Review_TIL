package basic;

import java.util.Scanner;

public class basic_1023 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] arr = a.split("[.]");
//		String[] arr = a.split(".");
		
		
		System.out.println(arr[0]+"\n"+arr[1]);
	}
}
