package Gery.Sinzie.kuis;

public class StaffAkademik extends Karyawan{
	
	public StaffAkademik(String nama, int pendapatanTetap) {
		this.nama = nama;
		this.pendapatanTetap = pendapatanTetap;
	}
	
	// Overloading untuk mendapat attribute int FlatBonus
	public int getPendapatan(int flatBonus) {
		return pendapatanTetap * flatBonus;
	}
}


