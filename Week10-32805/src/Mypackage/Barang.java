package Mypackage;

public class Barang {
	
	//Attribute
	protected String id; 
	protected int stock; 
	protected int harga;
	protected String nama;
	
	public Barang() {}
	public Barang(String id, String nama, int harga, int stock) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	public String getID () {
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