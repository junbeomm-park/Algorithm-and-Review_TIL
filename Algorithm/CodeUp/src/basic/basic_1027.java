package basic;

import java.util.Scanner;

public class basic_1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] arr = s.split("\\.");
		
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
		
	}
}
