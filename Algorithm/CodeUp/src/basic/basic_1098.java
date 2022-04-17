package basic;

import java.util.Scanner;

public class basic_1098 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int arr[][] = new int[H+1][W+1];
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int L = sc.nextInt();
			int D = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			if(D==0) {
				for(int j = 0; j < L; j++) {
					arr[X][Y+j] = 1;
				}
				
			}else if(D==1) {
				for(int j = 0; j < L; j++) {
					arr[X+j][Y] = 1;
				}
			}
			
		}
		
		
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
