package Week10.lab;

import Mypackage.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Challenge {
	
	static ArrayList<Voucher> voucher = new ArrayList<Voucher>();
	static ArrayList<Handphone> handphone = new ArrayList<Handphone>();
	static ArrayList<Order> daftarorder = new ArrayList<Order>();
	static ArrayList<Barang> barang = new ArrayList<Barang>();
	
	
	public static void mainMenu(){
		System.out.println("------------Menu Toko Voucher & HP------------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan Handphone");
		System.out.println("3. Lihat Pesanan Voucher");
		System.out.println("4. Barang Baru ");
		System.out.println("5. Exit ");
		System.out.print("Pilihan : ");
	}
	
	public static void menuPesan(){
		System.out.println("Daftar Barang Toko Voucher dan HP");
		System.out.println("1. Handphone ");
		System.out.println("2. Voucher ");
		System.out.print("Pilihan : ");
	}
	

	public static void daftarPesananHP(){
		System.out.println("Daftar Pesanan HP Multiguna");
		for(Order item: daftarorder) {
			if(item.getID().contains("H") || item.getID().contains("h")) {
				System.out.println("ID     : " + item.getID());
				System.out.println("Nama   : " + item.getHandphone().getNama());
				System.out.println("Jumlah : " + item.getJumlah());
				System.out.println("Total  : " + item.getJumlah() * item.getHandphone().getHarga());
				System.out.println("----------------------------------------------------------");
			}
		}
	}
	
	public static void daftarPesananVC(){
		System.out.println("Daftar Pesanan Voucher Multiguna");
		for(Order item: daftarorder) {
			if(item.getID().contains("V") || item.getID().contains("v")){
				System.out.println("ID     : " + item.getID());
				System.out.println("Nama   : " + item.getVoucher().getNama());
				System.out.println("Jumlah : " + item.getJumlah());
				System.out.println("Total  : " + item.getJumlah() * (item.getVoucher().getHarga() + (item.getVoucher().getHarga() * item.getVoucher().getPajak())));
				System.out.println("----------------------------------------------------------");
			}
		}
	}
	
	public static void tampilHandphone() {
		for(Barang item: barang) {
			if(item.getID().contains("H") || item.getID().contains("h")) {
				Handphone itemhp = (Handphone) item;
				System.out.println("ID    : " + itemhp.getID());
				System.out.println("Nama  : " + itemhp.getNama() + " " + itemhp.getWarna());
				System.out.println("Stok  : " + itemhp.getStock());
				System.out.println("Harga : " + itemhp.getHarga());
				System.out.println("------------------------------------------------");
			}
		}
	}
	
	public static void pesanHP(){
		String id;
		int jumlah, bayar;
		Scanner s = new Scanner(System.in);
		tampilHandphone();
		System.out.println("Ketik 0 untuk batal !!");
		System.out.print("Pesan Barang (ID) : ");
		id = s.nextLine();
		for(Barang item : barang){
			if(item.getID().contains("H") || item.getID().contains("h")){
				Handphone itemhp = (Handphone) item;
				if(id.equals("0")){
					return;
				}else if(id.equals(itemhp.getID())){
					System.out.print("Masukan Jumlah : ");
					jumlah = s.nextInt();
					if(jumlah > itemhp.getStock()) {
						System.out.println("Stok tidak mencukupi !!");
						return;
					}else {
						itemhp.minusStock(jumlah);
						System.out.println(jumlah + " @ " + itemhp.getNama() + " dengan total harga : " + itemhp.getHarga() * jumlah);
						System.out.print("Masukan Jumlah Uang : ");
						bayar = s.nextInt();
						daftarorder.add(new Order(id, new Handphone(itemhp.getID(), itemhp.getNama(), itemhp.getHarga(), itemhp.getStock(), itemhp.getWarna()), jumlah));
						if(bayar == itemhp.getHarga() * jumlah) {
							System.out.println("Berhasil dipesan !!");
							break;
						}else {
							System.out.println("Masukan jumlah uang dengan pas !!");
						}
					}
				}
			}
		}
		
	}
	
	public static void tampilVoucher() {
		for(Barang item : barang) {
			if(item.getID().contains("V") || item.getID().contains("v")) {
				Voucher itemvoucher = (Voucher) item; 
				System.out.println("ID      : " + itemvoucher.getID());
				System.out.println("Nama    : " + itemvoucher.getNama());
				System.out.println("Nominal : " + itemvoucher.getHarga());
				System.out.println("Stok    : " + itemvoucher.getStock());
				System.out.println("Harga   : " + (itemvoucher.getHarga() + (itemvoucher.getHarga()*itemvoucher.getPajak())));
				System.out.println("-----------------------------------------------");
			}
		}
	}
	
	public static void pesanVC(){
		String id; 
		int jumlah, bayar;
		Scanner s = new Scanner(System.in);
		tampilVoucher();
		System.out.println("Ketik 0 untuk batal !!");
		System.out.print("Pesan Barang (ID) : ");
		id = s.nextLine();
		for(Barang item : barang) {
			if(item.getID().contains("V") || item.getID().contains("v")) {
				Voucher itemvoucher = (Voucher) item; 
				if(id.equals("0")){
					return;
				}else if(id.equals(itemvoucher.getID())){
					System.out.print("Masukan Jumlah : ");
					jumlah = s.nextInt();
					if(jumlah > itemvoucher.getStock()) {
						System.out.println("Stok tidak mencukupi !!");
						return;
					}else {
						itemvoucher.minusStock(jumlah);
						System.out.println(jumlah + " @ " + itemvoucher.getNama() + " dengan total harga : " + ((itemvoucher.getHarga()*itemvoucher.getPajak() + itemvoucher.getHarga())* jumlah));
						System.out.print("Masukan Jumlah Uang : ");
						bayar = s.nextInt();
						daftarorder.add(new Order(id, new Voucher(itemvoucher.getID(), itemvoucher.getNama(), itemvoucher.getHarga(), itemvoucher.getStock(), itemvoucher.getPajak()), jumlah));
						if(bayar == ((itemvoucher.getHarga()*itemvoucher.getPajak() + itemvoucher.getHarga())* jumlah)) {
							System.out.println("Berhasil dipesan !!");
							break;
						}else {
							System.out.println("Masukan jumlah uang dengan pas!!");
						}
					}
				}
			}
		}
		
	}
	
	public static void barangBaru(){
		String id, nama, pil, warna;
		int harga, stok;
		double ppn;
		Scanner s = new Scanner(System.in);
		System.out.print("Voucher / Handphone (V/H) : ");
		pil = s.nextLine();
		if(pil.contains("v") || pil.contains("V")){
			System.out.print("ID    : ");
			id = s.nextLine();
			System.out.print("Nama  : ");
			nama = s.nextLine();
			System.out.print("Harga : ");
			harga = s.nextInt();
			System.out.print("Stok  : ");
			stok = s.nextInt();
			System.out.print("PPN   : ");
			ppn = s.nextDouble();
			barang.add(new Voucher(id, nama, harga, stok, ppn));
			System.out.println("Voucher telah berhasil diinput !!");	
		}else if(pil.contains("h") || pil.contains("H")){
			System.out.print("ID    : ");
			id = s.nextLine();
			System.out.print("Nama  : ");
			nama = s.nextLine();
			System.out.print("Harga : ");
			harga = s.nextInt();
			System.out.print("Stok  : ");
			stok = s.nextInt();
			s.nextLine();
			System.out.print("Warna : ");
			warna = s.nextLine();
			barang.add(new Handphone(id, nama, harga, stok, warna));
			System.out.println("Handphone telah berhasil diinput !!");
		}
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		while(true){
			mainMenu();
			pilihan = s.nextInt();
			switch(pilihan){
			case 1 :
				menuPesan();
				pilihan = s.nextInt();
				if(pilihan == 1) {
					pesanHP();
				}else {
					pesanVC();
				}
				break;
			case 2:
				daftarPesananHP();
				break;
			case 3:
				daftarPesananVC();
				break;
			case 4:
				barangBaru();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Masukan Input dengan Benar !!");
				break;
			}
		}
	}

}