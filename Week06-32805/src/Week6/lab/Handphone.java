package Week6.lab;

public class Handphone extends Barang {
	
	//Attribute
	private String warna;
	
	public static int total;
	
	public Handphone() {}
	public Handphone(int id, String nama, int harga, int stock, String warna) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.stock = stock;
		this.warna = warna;
	}
	
	public String getWarna() {
		return warna;
	}
	
}