package Week4.lab;

import java.util.Scanner;

public class Main {
	
	// Membuat static array of object
	static MataKuliah[] matkuls = new MataKuliah[9];
	// Member nilai pada array of object
	public static void seedData() {
		matkuls[0] = new MataKuliah("IF402", "Pemogramman Berorientasi Objek", 3);
		matkuls[1] = new MataKuliah("IF100", "Dasar-Dasar Pemogramman", 3);
		matkuls[2] = new MataKuliah("IF534", "Kecerdasan Buatan", 3);
		matkuls[3] = new MataKuliah("CE121", "Aljabar Linear", 3);
		matkuls[4] = new MataKuliah("CE441", "Jaringan Komputer", 3);
		matkuls[5] = new MataKuliah("CE232", "Sistem Digital", 3);
		matkuls[6] = new MataKuliah("UM162", "Pancasila", 2);
		matkuls[7] = new MataKuliah("UM152", "Agama", 2);
		matkuls[8] = new MataKuliah("UM142", "Bahasa Indonesia", 2);
	}
	
	public static void mainMenu() {
		System.out.println("-------Daftar Mata Kuliah-------");
		System.out.println("1. Lihat semua mata kuliah");
		System.out.println("2. Lihat mata kuliah kode IF");
		System.out.println("3. Lihat mata kuliah kode CE");
		System.out.println("4. Lihat mata kuliah kode UM");
	}
	
	public static void showData() {
		System.out.println("Daftar Mata Kuliah");
		for(MataKuliah matkul: matkuls) {
			System.out.println("---------------------");
			System.out.println("Kode       : " + matkul.getKode());
			System.out.println("Nama       : "+ matkul.getNama());
			System.out.println("Jumlah SKS : "+ matkul.getSKS());
		}
	}
	
	public static void filterData(String kode) {
		for(MataKuliah matkul : matkuls) {
			if(matkul.getKode().contains(kode)) {
				System.out.println("--------------------");
				System.out.println("kode       : " + matkul.getKode());
				System.out.println("Nama       : "+ matkul.getNama());
				System.out.println("jumlah SKS :" + matkul.getSKS());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		seedData();
		int menu;
		
		for(;;) {
			mainMenu();
			System.out.print("Pilihan : ");
			menu = in.nextInt();
			switch(menu) {
			case 1:
				showData();
				break;
			case 2:
				filterData("IF");
				break;
			case 3:
				filterData("CE");
				break;
			case 4:
				filterData("UM");
				break;
			default:
				System.out.println("Input tidak valid !!");
				break;
			}
			
		}
	}

}
