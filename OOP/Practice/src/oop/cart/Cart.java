package oop.cart;

public class Cart {
	Product arr[];
	int total;
	int count;
	
	public Cart() {
		arr = new Product[10];
	}
	
	public void addCart(Product p) {
		arr[count++] = p;
		total += p.discountApply();
	}
	
	public void orderList() {
		System.out.println("=======장바구니 목록=========");
		for(int i = 0; i < count; i++) {
			arr[i].show();
		}
		System.out.println("총금액 : " + total);
		System.out.println("=================");
	}

}
