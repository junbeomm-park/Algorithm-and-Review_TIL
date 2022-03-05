package basic;

import java.util.Scanner;

public class basic_1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
	}
}
