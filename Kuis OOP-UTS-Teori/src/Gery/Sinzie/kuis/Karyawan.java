package Gery.Sinzie.kuis;

public class Karyawan {
	protected String nama;
	protected int pendapatanTetap;
	
	public Karyawan() {}
	public Karyawan(String nama, int pendapatanTetap) {
		this.nama = nama;
		this.pendapatanTetap = pendapatanTetap;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getPendapatan() {
		return pendapatanTetap;
	}
}
