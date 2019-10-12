package day8_1;

public class Product {
	
	private int productId;
	private String productName;
	private int cost;
	
	public Product(int productId, String productName, int cost) {
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
	}

	public Product() {
		// do nothing here
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";
	}
	
}
