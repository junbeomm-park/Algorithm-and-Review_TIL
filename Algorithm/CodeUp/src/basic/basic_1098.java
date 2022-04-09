package basic;

import java.util.Scanner;

public class basic_1098 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int arr[][] = new int[h][w];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
				
				if(d == 0) {
					i = 1;
				}else if(d == 1){
					j = 1;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
