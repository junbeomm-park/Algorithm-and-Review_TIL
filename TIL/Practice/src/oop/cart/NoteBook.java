package oop.cart;

public class NoteBook implements Product {
	private int no;
	private String name;
	private int price;
	private boolean graphics;
	
	public NoteBook() {
	
	}
	

	public NoteBook(int no, String name, int price, boolean graphics) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.graphics = graphics;
	}



	@Override
	public int discountApply() {
		int price = 0;
		price = (int)(this.price * 0.9);
		return price;
	}

	@Override
	public void show() {
		System.out.println("상품번호 : "+ no);
		System.out.println("상품명 : "+ name);
		System.out.println("상품가격 : "+ price);
		System.out.println("그래픽카드 : "+ graphics);
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


	public boolean isGraphics() {
		return graphics;
	}


	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}


	
	
	

}
