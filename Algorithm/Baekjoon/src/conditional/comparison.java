package conditional;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	 
	     while(sc.hasNextInt()) {
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 if(a<b) {
			 System.out.println("<");
		 }else if(a>b) {
			 System.out.println(">");
		 }else {
			 System.out.println("==");
		 }
		 
	 }
   }
}