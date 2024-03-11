package b_review;

public class Product {

	private String productNo;
	private String productName;
	private int stock;
	
	public int income(int a) {
		stock += a;
		return stock;
	}
	
	public int sale(int b) {
		stock -= b;
		return stock;
	}
	
	public void output() {
		System.out.println();
	}
	
	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
