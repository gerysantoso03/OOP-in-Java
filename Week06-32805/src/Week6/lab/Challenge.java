package Week6.lab;

import java.util.Scanner;
import java.util.ArrayList;

public class Challenge {
	
	static ArrayList<Voucher> voucher = new ArrayList<Voucher>();
	static ArrayList<Handphone> handphone = new ArrayList<Handphone>();
	static ArrayList<Order> daftarorder = new ArrayList<Order>();
	
	
	public static void mainMenu(){
		System.out.println("------------Menu Toko Voucher & HP------------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan Handphone");
		System.out.println("3. Lihat Pesanan Voucher");
		System.out.println("4. Barang Baru ");
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
			System.out.println("ID     : " + item.getID());
			System.out.println("Nama   : " + item.getHandphone().nama);
			System.out.println("Jumlah : " + item.getJumlah());
			System.out.println("Total  : " + item.getJumlah() * item.getHandphone().harga);
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public static void daftarPesananVC(){
		System.out.println("Daftar Pesanan Voucher Multiguna");
		for(Order item: daftarorder) {
			System.out.println("ID     : " + item.getID());
			System.out.println("Nama   : " + item.getVoucher().nama);
			System.out.println("Jumlah : " + item.getJumlah());
			System.out.println("Total  : " + item.getJumlah() * (item.getVoucher().harga + (item.getVoucher().harga * item.getVoucher().getPajak())));
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public static void pesanHP(){
		int id, jumlah, bayar;
		Scanner s = new Scanner(System.in);
		for(Handphone item : handphone){
			System.out.println("ID    : " + item.getID());
			System.out.println("Nama  : " + item.getNama() + " " + item.getWarna());
			System.out.println("Stok  : " + item.getStock());
			System.out.println("Harga : " + item.getHarga());
			System.out.println("------------------------------------------------");
			System.out.println("Ketik 0 untuk batal !!");
			System.out.print("Pesan Barang (ID) : ");
			id = s.nextInt();
			if(id < 1){
				return;
			}else if(id == item.getID()){
				System.out.print("Masukan Jumlah : ");
				jumlah = s.nextInt();
				if(jumlah > item.getStock()) {
					System.out.println("Stok tidak mencukupi !!");
					return;
				}else {
					item.minusStock(jumlah);
					System.out.println(jumlah + " @ " + item.getNama() + " dengan total harga : " + item.getHarga() * jumlah);
					System.out.print("Masukan Jumlah Uang : ");
					bayar = s.nextInt();
					daftarorder.add(new Order(id, new Handphone(item.getID(), item.getNama(), item.getHarga(), item.getStock(), item.getWarna()), jumlah));
					if(bayar == item.getHarga() * jumlah) {
						System.out.println("Berhasil dipesan !!");
						break;
					}else {
						System.out.println("Masukan jumlah uang dengan pas EH BANGSAT BISA UANG PAS GAK :)");
					}
				}
			}
			
		}
		
	}
	
	public static void pesanVC(){
		int id, jumlah, bayar;
		Scanner s = new Scanner(System.in);
		for(Voucher item : voucher) {
			System.out.println("ID      : " + item.getID());
			System.out.println("Nama    : " + item.getNama());
			System.out.println("Nominal : " + item.getHarga());
			System.out.println("Stok    : " + item.getStock());
			System.out.println("Harga   : " + (item.getHarga() + (item.getHarga()*item.getPajak())));
			System.out.println("-----------------------------------------------");
			System.out.println("Ketik 0 untuk batal !!");
			System.out.print("Pesan Barang (ID) : ");
			id = s.nextInt();
			if(id < 1){
				return;
			}else if(id == item.getID()){
				System.out.print("Masukan Jumlah : ");
				jumlah = s.nextInt();
				if(jumlah > item.getStock()) {
					System.out.println("Stok tidak mencukupi !!");
					return;
				}else {
					item.minusStock(jumlah);
					System.out.println(jumlah + " @ " + item.getNama() + " dengan total harga : " + ((item.getHarga()*item.getPajak() + item.getHarga())* jumlah));
					System.out.print("Masukan Jumlah Uang : ");
					bayar = s.nextInt();
					daftarorder.add(new Order(id, new Voucher(item.getID(), item.getNama(), item.getHarga(), item.getStock(), item.getPajak()), jumlah));
					if(bayar == ((item.getHarga()*item.getPajak() + item.getHarga())* jumlah)) {
						System.out.println("Berhasil dipesan !!");
						break;
					}else {
						System.out.println("Masukan jumlah uang dengan pas, INI TOKO ONLINE BANGSAT GAUSAH BIKIN SUSAH");
					}
				}
			}
			
		}
		
	}
	
	public static void barangBaru(){
		String nama, pil, warna;
		int harga, stok;
		double ppn;
		Scanner s = new Scanner(System.in);
		System.out.print("Voucher / Handphone (V/H) : ");
		pil = s.nextLine();
		if(pil.contains("v") || pil.contains("V")){
			System.out.print("Nama  : ");
			nama = s.nextLine();
			System.out.print("Harga : ");
			harga = s.nextInt();
			System.out.print("Stok  : ");
			stok = s.nextInt();
			System.out.print("PPN   : ");
			ppn = s.nextDouble();
			voucher.add(new Voucher(voucher.size() + 1, nama, harga, stok, ppn));
			System.out.println("Voucher telah berhasil diinput !!");
			
		}else if(pil.contains("h") || pil.contains("H")){
			System.out.print("Nama    : ");
			nama = s.nextLine();
			System.out.print("Harga   : ");
			harga = s.nextInt();
			System.out.print("Stok    : ");
			stok = s.nextInt();
			s.nextLine();
			System.out.print("Warna   : ");
			warna = s.nextLine();
			handphone.add(new Handphone(handphone.size() + 1, nama, harga, stok, warna));
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
			default:
				System.out.println("Masukan Input dengan Benar, GAUSAH SOK ASIK DEH LU NGENTOTT :)");
				break;
			}
		}
	}

}