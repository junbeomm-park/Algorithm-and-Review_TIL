package array;

import java.util.Arrays;
import java.util.Scanner;

public class array_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		double result = 0;
		for(int i=0; i<arr.length ; i++) {
			 result += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.println(result / arr.length);
	}
}
