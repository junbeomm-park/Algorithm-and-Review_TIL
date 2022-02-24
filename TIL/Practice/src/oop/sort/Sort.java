package oop.sort;

public interface Sort {

	public void ascending(int arr[]);
	public void descending(int arr[]);
	public default void description() {
		
	}
}
