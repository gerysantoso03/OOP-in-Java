package umn.ac.id.tigaduadelapannollima;

public class MediaPromosi {
	
	// Attribute
	protected String nama;
	private int harga;
	
	// Metode
	public MediaPromosi() {}
	
	public MediaPromosi(String nama, int harga) {
		this.nama = nama;
		this.harga = harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
}
