package Week13.lab;


public class Item {
	private int id, price, stock;
	private String productName, category;
	
	public Item(int id, String productName, int price, String category, int stock) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
