package conditional;

import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			if(m < 45) {
				h = h-1;
				m = 60 - (45 - m);
				
				if(h < 0) {
					h = 23;
				}
				System.out.println(h+" "+m);
			} else {
				System.out.println(h+" "+(m-45));
			}
		}
	}
}

