package Week6.lab;

public class Voucher extends Barang {
	
	//Attribute
	private double pajak;
	public static int total;
	
	public Voucher() {}
	public Voucher(int id, String nama, int harga, int stock, double pajak) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.stock = stock;
		this.pajak = pajak;
	}
	
	public double getPajak() {
		return pajak;
	}
	
	public double getHargaJual() {
		return total;
	}
	
}