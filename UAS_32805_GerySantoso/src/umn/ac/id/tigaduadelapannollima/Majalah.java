package umn.ac.id.tigaduadelapannollima;


public class Majalah extends MediaPromosi{
	
	// Attribute
	private int luas;
	private String letak;
	private String bidang;
	private String id;
	
	// Metode
	public Majalah() {}
	
	public Majalah(String id, String nama, int luas, String letak, String bidang) {
		this.id = id;
		this.nama = nama;
		this.luas = luas;
		this.letak = letak;
		this.bidang = bidang;
	}
	
	public String getID() {
		return id;
	}
	
	public int getLuas() {
		return luas;
	}
	
	public String getLetak() {
		return letak;
	}
	
	public String getBidang() {
		return bidang;
	}
}
