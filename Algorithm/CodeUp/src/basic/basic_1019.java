package basic;

import java.util.Scanner;

public class basic_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = sc.next().split("\\.");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",a,b,c);
		
	}
}
