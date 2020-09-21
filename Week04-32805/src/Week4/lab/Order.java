package Week4.lab;

public class Order {
	private int id, jumlah;
	private Barang barang;
	
	public static int total;
	
	public Order () {}
	
	public Order(int id, int jumlah, Barang barang) {
		this.id = id;
		this.jumlah = jumlah;
		this.barang = barang;
	}
	
	public int getID() {
		return id;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public Barang getBarang() {
		return barang;	
	}
		
	
}