package Chapter02_Exercise;

public class Ex_8 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int ch1 = x;
		x = 2;
		
		int ch2 = y;
		y = 3;
		
		int ch3 = z;
		z = 1;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
