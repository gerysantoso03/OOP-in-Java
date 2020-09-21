package umn.ac.id.tigaduadelapannollima;

public class Baliho extends MediaPromosi {
	
	// Attrbute
	private int luas;
	private String letak;
	private String id;
	
	// Metode
	public Baliho() {}
	
	public Baliho(String id,String nama, int luas, String letak) {
		this.id = id;
		this.nama = nama;
		this.luas = luas;
		this.letak = letak;
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
	
}