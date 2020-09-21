package umn.ac.id.tigaduadelapannollima;

public class Order {
	
	// Attribute
	private MediaPromosi mediaPromosi;
	private String bidang;
	private String tanggal;
	private int jangkaWaktu;
	
	// Metode
	public Order() {}
	
	public Order(MediaPromosi mediaPromosi, String bidang, String tanggal, int jangkaWaktu) {
		this.mediaPromosi = mediaPromosi;
		this.bidang = bidang;
		this.tanggal = tanggal;
		this.jangkaWaktu = jangkaWaktu;
	}
	
	public MediaPromosi getMediaPromosi() {
		return mediaPromosi;
	}
	
	public String getBidang() {
		return bidang;
	}
	
	public String getTanggal() {
		return tanggal;
	}
	
	public int getJangkaWaktu() {
		return jangkaWaktu;
	}
	
	public void cancelOrder(String nama) {
		this.mediaPromosi.setNama(nama + " " + "DIBATALKAN");
	}

}
