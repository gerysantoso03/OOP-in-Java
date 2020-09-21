package Week4.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
	
	static Barang[] items = new Barang[5];
	static ArrayList<Order> daftarorder = new ArrayList<Order>();
	
	// Mengisi Barang
	public static void seedItem() {
		items[0] = new Barang(1, "Pulpen Easy Gel 0.5mm", 120, 2000);
		items[1] = new Barang(2, "Penggaris 30cm", 30, 5000);
		items[2] = new Barang(3, "Tipe-x Roller", 30,7000);
		items[3] = new Barang(4, "Pensil Mekanik", 50, 5000);
		items[4] = new Barang(5, "Buku Tulis", 100, 6000);
	}
	
	// Menampilkan Barang
	public static void showItem() {
		System.out.println("-------Daftar Barang Toko Multiguna-------");
		for(Barang item : items) {
			System.out.println("---------------------");
			System.out.println("ID    :" + item.getID());
			System.out.println("Nama  :" + item.getNama());
			System.out.println("Stock :" + item.getStock());
			System.out.println("Harga :" + item.getHarga());
			System.out.println("---------------------");
		}
	}
	
	// Order Barang
	public static void orderBarang() {
		Scanner s = new Scanner(System.in);
		int bayar, id, jumlah;
		
		System.out.println("Ketik 0 untuk batal!!");
		System.out.print("Pesan Barang (ID) : ");
		id = s.nextInt();		
		if(id > 5 || id < 1) {
			return;
		}
		System.out.print("Masukan Jumlah    : ");
		jumlah = s.nextInt();
		
		for(Barang item : items) {
			if(item.getID() == id && jumlah <= item.getStock()) {
				
				if(item.getStock() < jumlah || jumlah < 0) {
					System.out.println("JUMLAH STOCK TIDAK MENCUKUPI !!!");
					return;
				}
				
				System.out.println(jumlah + " @ " + item.getNama() + " Dengan Total harga: " + item.getHarga() * jumlah);
				
				System.out.print("Masukkan jumlah uang: ");
				bayar = s.nextInt();
								
				if(item.getHarga() * jumlah == bayar) {
					System.out.println("Berhasil dipesan!");
					daftarorder.add(new Order(id, item.getHarga() * jumlah, new Barang(item.getID(), item.getNama(), jumlah, item.getHarga())));
					item.minusStock(jumlah);
				}
				else {
					System.out.println("Uang kurang");
					return;
				}
			}
		}
	}
	
	public static void daftarPesanan(){
		for(Order orders : daftarorder) {
			System.out.println("---------------------");
			System.out.println("ID     :" + orders.getID());
			System.out.println("Nama   :" + orders.getBarang().getNama());
			System.out.println("Jumlah :" + orders.getBarang().getStock());
			System.out.println("Harga  :" + orders.getJumlah());
			System.out.println("---------------------");
		}
	}
	
	
	public static void mainMenu() {
		System.out.println("-------Menu Toko Multiguna-------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesan");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		seedItem();
		int pilihan;
		while(true) {
			mainMenu();
			System.out.print("Pilih Menu : ");
			pilihan = in.nextInt();
			switch(pilihan) {
			case 1:
				showItem();
				orderBarang();
				break;
			case 2:
				daftarPesanan();
				break;
			}
		}
	}

}