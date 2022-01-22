package function;

public class test {

	public static void main(String[] args) {
		int n = 1;
		int r = 2;
		
		System.out.println(getNumber(n,r));
	}
	public static int getNumber(int n, int r) {
		return factorial(n) / factorial(n-r);
	}
	
	public static int factorial(int i) {
		if(i <= 1) return 1;
		else return i * factorial(i-1);
	}

}
