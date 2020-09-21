package Week7.lab;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class Challenge {
	
	// Make ArrayOfList to insert data
	static ArrayList<Manager> manager = new ArrayList<Manager>();
	static ArrayList<Tetap> tetap = new ArrayList<Tetap>();
	static ArrayList<Magang> magang = new ArrayList<Magang>();
	
	
	public static void mainMenu() {
		System.out.println("-----Program Data Karyawan-----");
		System.out.println("1. Lihat Karyawan");
		System.out.println("2. Tambah Karyawan");
		System.out.println("3. Keluar");
		System.out.print("Pilih : ");
	}
	
	public static void tambahKaryawan() {
		System.out.println("-----Tambah Karyawan-----");
		System.out.println("1. Manager");
		System.out.println("2. Karyawan Tetap");
		System.out.println("3. Karyawan Magang");
		System.out.print("Pilih : ");
	}
	
	public static void showKaryawan() {
		System.out.println("-----Daftar Karyawan-----");
		System.out.println("1. Manager");
		System.out.println("2. Karyawan Tetap");
		System.out.println("3. Karyawan Magang");
		System.out.print("Pilih : ");
	}
	
	public static void showManager() {
		// Format String For Kurs Indonesia 
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
		for(Manager item: manager) {
			System.out.println("ID   : " + item.getID());
			System.out.println("Nama : " + item.getNama());
			System.out.println("Gaji : " + kursIndonesia.format(item.getGaji()));
			System.out.println("---------------------------");
		}
	}
	
	public static void showTetap() {
		// Format String For Kurs Indonesia 
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
		for(Tetap item: tetap) {
			System.out.println("ID   : " + item.getID());
			System.out.println("Nama : " + item.getNama());
			System.out.println("Gaji : " + kursIndonesia.format(item.getGaji()));
			System.out.println("---------------------------");
		}
	}
	
	public static void showMagang() {
		// Format String For Kurs Indonesia 
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
		for(Magang item: magang) {
			System.out.println("ID   : " + item.getID());
			System.out.println("Nama : " + item.getNama());
			System.out.println("Gaji : " + kursIndonesia.format(item.getGaji()));
			System.out.println("---------------------------");
		}
	}
	
	public static void seedManager() {
		String nama, id;
		Scanner s = new Scanner(System.in);
		System.out.print("ID     : ");
		id = s.nextLine();
		System.out.print("Nama   : ");
		nama = s.nextLine();
		manager.add(new Manager(id, nama));
		System.out.println("Manager baru telah ditambahkan !!");
	}
	
	public static void seedTetap() {
		String nama, id;
		Scanner s = new Scanner(System.in);
		System.out.print("ID     : ");
		id = s.nextLine();
		System.out.print("Nama   : ");
		nama = s.nextLine();
		tetap.add(new Tetap(id, nama));
		System.out.println("Karyawan Tetap baru telah ditambahkan !!");
	}
	
	public static void seedMagang() {
		String nama, id;
		Scanner s = new Scanner(System.in);
		System.out.print("ID     : ");
		id = s.nextLine();
		System.out.print("Nama   : ");
		nama = s.nextLine();
		magang.add(new Magang(id, nama));
		System.out.println("Karyawan Magang baru telah ditambahkan !!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int pilihan;
		Scanner s = new Scanner(System.in);
		while(true){
			mainMenu();
			pilihan = s.nextInt();
			switch(pilihan) {
			case 1:
				showKaryawan();
				pilihan = s.nextInt();
				if(pilihan == 1) {
					showManager();
				}else if(pilihan == 2) {
					showTetap();
				}else {
					showMagang();
				}
				break;
			case 2:
				tambahKaryawan();
				pilihan = s.nextInt();
				if(pilihan == 1) {
					seedManager();
				}else if(pilihan == 2) {
					seedTetap();
				}else {
					seedMagang();
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Masukan Input dengan benar !!");
				break;
			}
		}
	}

}
