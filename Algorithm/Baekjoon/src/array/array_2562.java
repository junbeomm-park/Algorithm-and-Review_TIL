package array;

import java.util.Scanner;

public class array_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
		};
		sc.close();
		
		int max = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			int value = arr[i];
			
			if(value > max) {
				max = value;
				index = i+1;
			}
		}
		System.out.println(max + "\n" + index);
		
	}
}
		
	
