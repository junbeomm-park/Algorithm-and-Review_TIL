package practice;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개 입력 :");
		
		int[] arr = new int[5]; // 배열 선언
		
		int max = arr[0]; // 최대값 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		int min = arr[0]; // 최소값
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		
	}
}
