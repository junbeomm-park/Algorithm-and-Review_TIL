package String;

import java.util.Scanner;

public class String_2675 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
	
			String S = in.next();	// nextLine() 을 쓰면 error!
			int R = in.nextInt();
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}
