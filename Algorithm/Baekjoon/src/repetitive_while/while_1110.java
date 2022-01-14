package repetitive_while;

import java.util.Scanner;

public class while_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int count = 0;
		int b = a;
		
		while(true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			count++;
			
			if(b == a) {
				break;
			}
		}
		System.out.println(count);
	}
}
