package umn.ac.id.tigaduadelapannollima;

public class Celebgram extends MediaPromosi {
	
	// Attribute
	private int umur;
	private int tinggiBadan;
	private int beratBadan;
	private int followers;
	private String akunMedia;
	private String bidang;
	private String id;
	
	// Metode
	public Celebgram() {}
	
	public Celebgram(String id,String nama, int umur, int tinggiBadan, int beratBadan, int followers, String akunMedia, String bidang) {
		this.id = id;
		this.nama = nama;
		this.umur = umur;
		this.tinggiBadan = tinggiBadan;
		this.beratBadan = beratBadan;
		this.followers = followers;
		this.akunMedia = akunMedia;
		this.bidang = bidang;
	}
	
	public String getID() {
		return id;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public int getTinggiBadan() {
		return tinggiBadan;
	}
	
	public int getBeratBadan() {
		return beratBadan;
	}
	
	public int getFollowers() {
		return followers;
	}
	
	public String getAkunMedia() {
		return akunMedia;
	}
	
	public String getBidang() {
		return bidang;
	}

}
