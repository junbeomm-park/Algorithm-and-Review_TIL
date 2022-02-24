package conditional;

import java.util.Scanner;

public class if_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt() + sc.nextInt();
		
		while(m > 59) {
			h++;
			m -= 60;
		}
		while(h > 23) {
			h -= 24;
		}
		
		System.out.println(h+" "+m);
	}

}
