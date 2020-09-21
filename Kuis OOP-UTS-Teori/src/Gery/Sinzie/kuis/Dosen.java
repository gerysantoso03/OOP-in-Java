package Gery.Sinzie.kuis;

public class Dosen extends Karyawan {
	
	protected int jumlahBimbingan;
	
	public Dosen(String nama, int pendapatanTetap, int jumlahBimbingan) {
		this.nama = nama;
		this.pendapatanTetap = pendapatanTetap;
		this.jumlahBimbingan = jumlahBimbingan;
	}
	
	// Overriding untuk metode getPendapatan
	public int getPendapatan() {
		return pendapatanTetap + (jumlahBimbingan * 100000);
	}
}
