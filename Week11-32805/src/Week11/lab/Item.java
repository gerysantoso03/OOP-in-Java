package Week11.lab;

public class Item {
	private String nama;
	private String tipe;
	private int harga;
	private int hargaOri;
	
	public Item() {}
	public Item(String nama, String tipe, int harga) {
		this.nama = nama;
		this.tipe = tipe;
		this.harga = harga;
		this.hargaOri = harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getTipe() {
		return tipe;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public int getHargaOri() {
		return hargaOri;
	}
	
	public void Bayar(int payment) {
		this.harga = harga - payment;
	}
}
