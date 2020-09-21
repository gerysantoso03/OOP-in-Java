package Week6.lab;

public class Barang {
	
	//Attribute
	protected int id; 
	protected int stock; 
	protected int harga;
	protected String nama;
	
	public Barang() {}
	public Barang(int id, String nama, int harga, int stock) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getID () {
		return id;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void minusStock(int qty) {
		stock = stock - qty;
	}

}