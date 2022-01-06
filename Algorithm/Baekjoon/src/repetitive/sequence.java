package repetitive;

import java.util.Scanner;

public class sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			sc.close();
			
			for(int i=0; i < n; i++) {
				if(arr[i] < x) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
