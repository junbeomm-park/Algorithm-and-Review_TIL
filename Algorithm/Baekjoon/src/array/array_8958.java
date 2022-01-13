package array;

import java.util.Scanner;

public class array_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int count = 0;
			
			for(int o=0; o<arr[i].length(); o++) {
				
				if(arr[i].charAt(o) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
				
			}
			System.out.println(sum);
		}
	}

}
