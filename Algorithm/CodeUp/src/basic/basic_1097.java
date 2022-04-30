package basic;

import java.util.Scanner;

public class basic_1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[19][19];
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int N = sc.nextInt();
		
		for(int n = 0; n < N; n++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[x][i] == 0) {
					arr[x][i] = 1;
				}else {
					arr[x][i] = 0;
				}
			}
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j][y] == 0) {
					arr[j][y] = 1;
				}else {
					arr[j][y] = 0;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
