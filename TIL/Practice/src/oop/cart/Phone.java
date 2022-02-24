package oop.cart;

public class Phone implements Product {
	private int no;
	private String name;
	private int price;
	private boolean flip;
	
	public Phone() {
		
	}
	
	public Phone(int no, String name, int price, boolean flip) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.flip = flip;
	}


	@Override
	public int discountApply() {
		int price = 0;
		price = (int)(this.price * 0.8);
		return price;
	}

	@Override
	public void show() {
		System.out.println("상품번호 : "+ no);
		System.out.println("상품명 : "+ name);
		System.out.println("상품가격 : "+ price);
		System.out.println("플립 : "+ flip);
		System.out.println();
	}
	@Override
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFlip() {
		return flip;
	}

	public void setFlip(boolean flip) {
		this.flip = flip;
	}
	
	

}
