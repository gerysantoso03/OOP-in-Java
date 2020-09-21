package umn.ac.id.tigaduadelapannollima;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Celebgram> celebgrams = new ArrayList<Celebgram>();
	static ArrayList<Aktor> aktors = new ArrayList<Aktor>();
	static ArrayList<Baliho> balihos = new ArrayList<Baliho>();
	static ArrayList<Majalah> majalahs = new ArrayList<Majalah>();
	static ArrayList<Order> orders = new ArrayList<Order>();
	
	
	// Credits
	public static void Credits() {
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		System.out.println("Nama : Bernardus Gery Santoso ");
		System.out.println("NIM  : 00000032805");
	}
	
	// Seed Menu
	public static void seedData() {
		// Adding Aktor
		aktors.add(new Aktor("A1","Chris Evans", 30, 170, 60, 100000, "Captains America Lovers"));
		aktors.add(new Aktor("A2","Robert Downey JR", 31, 171, 61, 120000, "Ironman Lovers"));
		aktors.add(new Aktor("A3","Chris Hemsworth", 32, 172, 62, 140000, "Thor Lovers"));
		// Adding Celebgram
		celebgrams.add(new Celebgram("C1","Awkarin", 25, 165, 45, 100000, "Instagram", "Furnitur"));
		celebgrams.add(new Celebgram("C2","Anya Geraldine", 26, 166, 46, 120000, "Twitter", "Makanan"));
		celebgrams.add(new Celebgram("C3","Devina Aurel", 27, 167, 47, 140000, "Youtube", "Tanaman"));
		// Adding Baliho
		balihos.add(new Baliho("B1","Baliho Jakarta Pusat", 6, "Jakarta Pusat"));
		balihos.add(new Baliho("B2","Baliho Jakarta Barat", 8, "Jakarta Barat"));
		balihos.add(new Baliho("B3","Baliho Jakarta Utara", 9, "Jakarta Utara"));
		// Adding Majalah
		majalahs.add(new Majalah("M1","Home Decor", 15, "Halaman 2", "Furnitur"));
		majalahs.add(new Majalah("M2","Sedap", 18, "Halaman 3", "Makanan"));
		majalahs.add(new Majalah("M3","Otomotif", 21, "Halaman 4", "Tanaman"));
	}
	
	// Menu Utama
	public static void mainMenu() {
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		System.out.println("1. Penambahan Media");
		System.out.println("2. Penyewaan Media");
		System.out.println("3. Check Employement / Rental");
		System.out.println("4. Credits");
		System.out.println("5. Exit");
		System.out.println("==============================");
		System.out.print("Pilih Menu (1-5) : ");
	}
	
	// Menu Tambah Media
	public static void menuTambahMedia() {
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		System.out.println("1. Celebgram");
		System.out.println("2. Majalah");
		System.out.println("==============================");
		System.out.print("Pilih Media (1-2) : ");
	}
	
	// Menu Kategori
	public static void menuKategori() {
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		System.out.println("1. Furnitur");
		System.out.println("2. Makanan");
		System.out.println("3. Tanaman");
		System.out.println("4. Otomotif");
		System.out.println("5. Musik");
		System.out.println("==============================");
		System.out.print("Pilih Kategori (1-5) : ");
	}
	

	// Tambah Media Baru
	public static void tambahMedia() {
		int pilMedia, pilKategori, umur, tinggibadan, beratbadan, followers, luas;
		String nama, akunmedia, letak, id;
		Scanner s = new Scanner(System.in);
		menuTambahMedia();
		pilMedia = s.nextInt();
		if(pilMedia == 1) {
			menuKategori();
			pilKategori = s.nextInt();
			s.nextLine();
			if(pilKategori == 1) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Umur             : ");
				umur = s.nextInt();
				System.out.print("Masukan Tinggi Badan     : ");
				tinggibadan = s.nextInt();
				System.out.print("Masukan Berat Badan      : ");
				beratbadan = s.nextInt();
				System.out.print("Masukan Jumlah Followers : ");
				followers = s.nextInt();
				System.out.print("Masukan Social Media     : ");
				akunmedia = s.next();
				s.nextLine();
				celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Furnitur"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 2) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Umur             : ");
				umur = s.nextInt();
				System.out.print("Masukan Tinggi Badan     : ");
				tinggibadan = s.nextInt();
				System.out.print("Masukan Berat Badan      : ");
				beratbadan = s.nextInt();
				System.out.print("Masukan Jumlah Followers : ");
				followers = s.nextInt();
				System.out.print("Masukan Social Media     : ");
				akunmedia = s.next();
				s.nextLine();
				celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Makanan"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 3) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Umur             : ");
				umur = s.nextInt();
				System.out.print("Masukan Tinggi Badan     : ");
				tinggibadan = s.nextInt();
				System.out.print("Masukan Berat Badan      : ");
				beratbadan = s.nextInt();
				System.out.print("Masukan Jumlah Followers : ");
				followers = s.nextInt();
				System.out.print("Masukan Social Media     : ");
				akunmedia = s.next();
				s.nextLine();
				celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Tanaman"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 4) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Umur             : ");
				umur = s.nextInt();
				System.out.print("Masukan Tinggi Badan     : ");
				tinggibadan = s.nextInt();
				System.out.print("Masukan Berat Badan      : ");
				beratbadan = s.nextInt();
				System.out.print("Masukan Jumlah Followers : ");
				followers = s.nextInt();
				System.out.print("Masukan Social Media     : ");
				akunmedia = s.next();
				s.nextLine();
				celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Otomotif"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 5){
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Umur             : ");
				umur = s.nextInt();
				System.out.print("Masukan Tinggi Badan     : ");
				tinggibadan = s.nextInt();
				System.out.print("Masukan Berat Badan      : ");
				beratbadan = s.nextInt();
				System.out.print("Masukan Jumlah Followers : ");
				followers = s.nextInt();
				System.out.print("Masukan Social Media     : ");
				akunmedia = s.next();
				s.nextLine();
				celebgrams.add(new Celebgram(id, nama, umur, tinggibadan, beratbadan, followers, akunmedia, "Musik"));
				System.out.println("Media Baru Telah ditambahkan");
			}
		}else if(pilMedia == 2) {
			menuKategori();
			pilKategori = s.nextInt();
			s.nextLine();
			if(pilKategori == 1) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Luas             : ");
				luas = s.nextInt();
				System.out.print("Masukan Letak Majalah    : ");
				s.nextLine();
				letak = s.nextLine();
				majalahs.add(new Majalah(id, nama, luas, letak, "Furnitur"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 2) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Luas             : ");
				luas = s.nextInt();
				System.out.print("Masukan Letak Majalah    : ");
				s.nextLine();
				letak = s.nextLine();
				majalahs.add(new Majalah(id, nama, luas, letak, "Makanan"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 3) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Luas             : ");
				luas = s.nextInt();
				System.out.print("Masukan Letak Majalah    : ");
				s.nextLine();
				letak = s.nextLine();
				majalahs.add(new Majalah(id, nama, luas, letak, "Tanaman"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 4) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Luas             : ");
				luas = s.nextInt();
				System.out.print("Masukan Letak Majalah    : ");
				s.nextLine();
				letak = s.nextLine();
				majalahs.add(new Majalah(id, nama, luas, letak, "Otomotif"));
				System.out.println("Media Baru Telah ditambahkan");
			}else if(pilKategori == 5) {
				System.out.print("Masukan ID               : ");
				id = s.nextLine();
				System.out.print("Masukan Nama             : ");
				nama = s.nextLine();
				System.out.print("Masukan Luas             : ");
				luas = s.nextInt();
				System.out.print("Masukan Letak Majalah    : ");
				s.nextLine();
				letak = s.nextLine();
				majalahs.add(new Majalah(id, nama, luas, letak, "Musik"));
				System.out.println("Media Baru Telah ditambahkan");
			}
		}
	}
	
	// Menu Order Media
	public static void menuOrderMedia() {
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		System.out.println("1. Aktor");
		System.out.println("2. Celebgram");
		System.out.println("3. Majalah");
		System.out.println("4. Baliho");
		System.out.println("==============================");
		System.out.print("Pilih Media (1-4) : ");
	}
	
	// Show Media Majalah, Celebgram, Aktor, Baliho
	public static void showBaliho() {
		int id = 1;
		for(Baliho item: balihos) {
			System.out.println("No    : " + item.getID());
			System.out.println("Nama  : " + item.getNama());
			System.out.println("Luas  : " + item.getLuas());
			System.out.println("Letak : " + item.getLetak());
			System.out.println("Harga : " + item.getLuas()*3000000);
			System.out.println("==============================");
//			id++;
		}
	}
	
	public static void showMajalah() {
		int id = 1;
		for(Majalah item: majalahs) {
			System.out.println("No     : " + item.getID());
			System.out.println("Nama   : " + item.getNama());
			System.out.println("Luas   : " + item.getLuas());
			System.out.println("Letak  : " + item.getLetak());
			System.out.println("Bidang : " + item.getBidang());
			System.out.println("Harga  : " + item.getLuas()*50000);
			System.out.println("==============================");
//			id++;
		}
	}
	
	public static void showAktor() {
		int id = 1;
		for(Aktor item: aktors) {
			System.out.println("No            : " + item.getID());
			System.out.println("Nama          : " + item.getNama());
			System.out.println("Umur          : " + item.getUmur());
			System.out.println("Tinggi Badan  : " + item.getTinggiBadan());
			System.out.println("Berat Badan   : " + item.getBeratBadan());
			System.out.println("Fans          : " + item.getFans());
			System.out.println("Fans Club     : " + item.getFansClub());
			System.out.println("Harga         : " + item.getFans() * 2000);
			System.out.println("==============================");
//			id++;
		}
	}
	
	public static void showCelebgram() {
		int id = 1;
		for(Celebgram item: celebgrams) {
			System.out.println("No            : " + item.getID());
			System.out.println("Nama          : " + item.getNama());
			System.out.println("Umur          : " + item.getUmur());
			System.out.println("Tinggi Badan  : " + item.getTinggiBadan());
			System.out.println("Berat Badan   : " + item.getBeratBadan());
			System.out.println("Followers     : " + item.getFollowers());
			System.out.println("Social Media  : " + item.getAkunMedia());
			System.out.println("Bidang        : " + item.getBidang());
			System.out.println("Harga         : " + item.getFollowers() * 1000);
			System.out.println("==============================");
//			id++;
		}
	}
	
	// Order Media 
	public static void orderMedia() {
		Scanner s = new Scanner(System.in);
		int pilKategori, jangkawaktu, pilOrderMedia, uang;
		String tanggal, idMedia;
		menuKategori();
		pilKategori = s.nextInt();
		switch(pilKategori) {
		case 1:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			menuOrderMedia();
			pilOrderMedia = s.nextInt();
			if(pilOrderMedia == 1) {
				showAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Aktor item: aktors) {
					Aktor itemAktor = (Aktor) item;
					if(idMedia.equals(item.getID())) {
						System.out.println("Harga  : " + ((itemAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Jumlah Uang sesuai Pilihan Media : ");
						uang = s.nextInt();
						if(uang != ((itemAktor.getFans()*2000)*jangkawaktu) || uang < ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemAktor.getNama(), ((itemAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(pilOrderMedia == 2) {
				showCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram itemCeleb = (Celebgram) item;
					if(idMedia.equals(itemCeleb.getID())) {
						if(itemCeleb.getBidang().equals("Furnitur")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), ((itemCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 3) {
				showMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah itemMajalah = (Majalah) item;
					if(idMedia.equals(itemMajalah.getID())) {
						if(itemMajalah.getBidang().equals("Furnitur")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != ((itemMajalah.getLuas()*50000)*jangkawaktu) || uang < ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), ((itemMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 4) {
				showBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Baliho item: balihos) {
					Baliho itemBaliho = (Baliho) item;
					if(idMedia.equals(itemBaliho.getID())) {
						System.out.println("Harga  : " + ((itemBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan jumlah uang sesuai dengan menu : ");
						uang = s.nextInt();
						if(uang != ((itemBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemBaliho.getNama(), ((itemBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 2:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			menuOrderMedia();
			pilOrderMedia = s.nextInt();
			if(pilOrderMedia == 1) {
				showAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Aktor item: aktors) {
					Aktor itemAktor = (Aktor) item;
					if(idMedia.equals(item.getID())) {
						System.out.println("Harga  : " + ((itemAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Jumlah Uang sesuai Pilihan Media : ");
						uang = s.nextInt();
						if(uang != ((itemAktor.getFans()*2000)*jangkawaktu) || uang < ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemAktor.getNama(), ((itemAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(pilOrderMedia == 2) {
				showCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram itemCeleb = (Celebgram) item;
					if(idMedia.equals(itemCeleb.getID())) {
						if(itemCeleb.getBidang().equals("Makanan")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), ((itemCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 3) {
				showMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah itemMajalah = (Majalah) item;
					if(idMedia.equals(itemMajalah.getID())) {
						if(itemMajalah.getBidang().equals("Makanan")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != ((itemMajalah.getLuas()*50000)*jangkawaktu) || uang < ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), ((itemMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 4) {
				showBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Baliho item: balihos) {
					Baliho itemBaliho = (Baliho) item;
					if(idMedia.equals(itemBaliho.getID())) {
						System.out.println("Harga  : " + ((itemBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan jumlah uang sesuai dengan menu : ");
						uang = s.nextInt();
						if(uang != ((itemBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemBaliho.getNama(), ((itemBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 3:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			menuOrderMedia();
			pilOrderMedia = s.nextInt();
			if(pilOrderMedia == 1) {
				showAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Aktor item: aktors) {
					Aktor itemAktor = (Aktor) item;
					if(idMedia.equals(item.getID())) {
						System.out.println("Harga  : " + ((itemAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Jumlah Uang sesuai Pilihan Media : ");
						uang = s.nextInt();
						if(uang != ((itemAktor.getFans()*2000)*jangkawaktu) || uang < ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemAktor.getNama(), ((itemAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(pilOrderMedia == 2) {
				showCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram itemCeleb = (Celebgram) item;
					if(idMedia.equals(itemCeleb.getID())) {
						if(itemCeleb.getBidang().equals("Tanaman")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), ((itemCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 3) {
				showMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah itemMajalah = (Majalah) item;
					if(idMedia.equals(itemMajalah.getID())) {
						if(itemMajalah.getBidang().equals("Tanaman")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != ((itemMajalah.getLuas()*50000)*jangkawaktu) || uang < ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), ((itemMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 4) {
				showBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Baliho item: balihos) {
					Baliho itemBaliho = (Baliho) item;
					if(idMedia.equals(itemBaliho.getID())) {
						System.out.println("Harga  : " + ((itemBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan jumlah uang sesuai dengan menu : ");
						uang = s.nextInt();
						if(uang != ((itemBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemBaliho.getNama(), ((itemBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 4:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			menuOrderMedia();
			pilOrderMedia = s.nextInt();
			if(pilOrderMedia == 1) {
				showAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Aktor item: aktors) {
					Aktor itemAktor = (Aktor) item;
					if(idMedia.equals(item.getID())) {
						System.out.println("Harga  : " + ((itemAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Jumlah Uang sesuai Pilihan Media : ");
						uang = s.nextInt();
						if(uang != ((itemAktor.getFans()*2000)*jangkawaktu) || uang < ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemAktor.getNama(), ((itemAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(pilOrderMedia == 2) {
				showCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram itemCeleb = (Celebgram) item;
					if(idMedia.equals(itemCeleb.getID())) {
						if(itemCeleb.getBidang().equals("Otomotif")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), ((itemCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 3) {
				showMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah itemMajalah = (Majalah) item;
					if(idMedia.equals(itemMajalah.getID())) {
						if(itemMajalah.getBidang().equals("Otomotif")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != ((itemMajalah.getLuas()*50000)*jangkawaktu) || uang < ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), ((itemMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 4) {
				showBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Baliho item: balihos) {
					Baliho itemBaliho = (Baliho) item;
					if(idMedia.equals(itemBaliho.getID())) {
						System.out.println("Harga  : " + ((itemBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan jumlah uang sesuai dengan menu : ");
						uang = s.nextInt();
						if(uang != ((itemBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemBaliho.getNama(), ((itemBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		case 5:
			s.nextLine();
			System.out.print("Tanggal Mulai (DDMMYYYY) : ");
			tanggal = s.nextLine();
			System.out.print("Banyak Hari Penyewaan    : ");
			jangkawaktu = s.nextInt();
			menuOrderMedia();
			pilOrderMedia = s.nextInt();
			if(pilOrderMedia == 1) {
				showAktor();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Aktor item: aktors) {
					Aktor itemAktor = (Aktor) item;
					if(idMedia.equals(item.getID())) {
						System.out.println("Harga  : " + ((itemAktor.getFans()*2000)*jangkawaktu));
						System.out.print("Masukan Jumlah Uang sesuai Pilihan Media : ");
						uang = s.nextInt();
						if(uang != ((itemAktor.getFans()*2000)*jangkawaktu) || uang < ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemAktor.getFans()*2000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemAktor.getNama(), ((itemAktor.getFans()*2000)*jangkawaktu)), "Aktor", tanggal, jangkawaktu));
						}
						break;
					}
				}
			}else if(pilOrderMedia == 2) {
				showCelebgram();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Celebgram item: celebgrams) {
					Celebgram itemCeleb = (Celebgram) item;
					if(idMedia.equals(itemCeleb.getID())) {
						if(itemCeleb.getBidang().equals("Musik")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), (((itemCeleb.getFollowers()*1000)*jangkawaktu) + (500000 * jangkawaktu))), "Celebgram", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemCeleb.getFollowers()*1000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemCeleb.getFollowers()*1000)*jangkawaktu)) || uang < (((itemCeleb.getFollowers()*1000)*jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemCeleb.getFollowers()*1000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemCeleb.getNama(), ((itemCeleb.getFollowers()*1000)*jangkawaktu)), "Celebgram", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 3) {
				showMajalah();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Majalah item: majalahs) {
					Majalah itemMajalah = (Majalah) item;
					if(idMedia.equals(itemMajalah.getID())) {
						if(itemMajalah.getBidang().equals("Musik")) {
							System.out.println("Jumlah Uang yang Dibayar Bila Sesuai dengan Kategori : " + (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu)) || uang < (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), (((itemMajalah.getLuas()*50000)*jangkawaktu)+ (200000 * jangkawaktu))), "Majalah", tanggal, jangkawaktu));
							}
						}else {
							System.out.println("Harga : " + ((itemMajalah.getLuas()*50000)*jangkawaktu));
							System.out.print("Masukan jumlah uang : ");
							uang = s.nextInt();
							if(uang != ((itemMajalah.getLuas()*50000)*jangkawaktu) || uang < ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Input Uang Tidak SESUAI !!!");
							}else if(uang == ((itemMajalah.getLuas()*50000)*jangkawaktu)) {
								System.out.println("Pemesanan Berhasil dipesan");
								orders.add(new Order(new MediaPromosi(itemMajalah.getNama(), ((itemMajalah.getLuas()*50000)*jangkawaktu)), "Majalah", tanggal, jangkawaktu));
							}
						}
						break;
					}
				}
			}else if(pilOrderMedia == 4) {
				showBaliho();
				s.nextLine();
				System.out.print("Masukan ID Media : ");
				idMedia = s.nextLine();
				for(Baliho item: balihos) {
					Baliho itemBaliho = (Baliho) item;
					if(idMedia.equals(itemBaliho.getID())) {
						System.out.println("Harga  : " + ((itemBaliho.getLuas()*3000000)*jangkawaktu));
						System.out.print("Masukan jumlah uang sesuai dengan menu : ");
						uang = s.nextInt();
						if(uang != ((itemBaliho.getLuas()*3000000)*jangkawaktu) || uang < ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Input Uang Tidak SESUAI !!!");
						}else if(uang == ((itemBaliho.getLuas()*3000000)*jangkawaktu)) {
							System.out.println("Pemesanan Berhasil dipesan");
							orders.add(new Order(new MediaPromosi(itemBaliho.getNama(), ((itemBaliho.getLuas()*3000000)*jangkawaktu)), "Baliho", tanggal, jangkawaktu));
						}
					break;
					}
				}
			}
			break;
		}
	}
	
	// Show Order
	public static void showOrder() {
		int no = 1;
		System.out.println("==============================");
		System.out.println("     Wemen Marketing Agent    ");
		System.out.println("==============================");
		for(Order itemOrder: orders) {
			System.out.println("No          : " + no);
			System.out.println("Media       : " + itemOrder.getBidang());
			System.out.println("Nama        : " + itemOrder.getMediaPromosi().getNama());
			System.out.println("Tanggal     : " + itemOrder.getTanggal());
			System.out.println("Durasi Sewa : " + itemOrder.getJangkaWaktu());
			System.out.println("Harga       : " + itemOrder.getMediaPromosi().getHarga());
			System.out.println("==============================");
			no++;
		}
	}
	
	// SELESAIKAN ORDER
		public static void endOrder() {
			Scanner s = new Scanner(System.in);
			int pilihan;
			
			if(orders.isEmpty()) {
				System.out.println("Anda BELUM memesan media!");
				return;
			}
			
			showOrder();
			
			System.out.print("Pilih ID yang akan dibatalkan: ");
			pilihan = s.nextInt();
			pilihan = pilihan - 1;
			
			Order cancel = orders.get(pilihan);
			
			if(cancel.getMediaPromosi().getNama().contains("DIBATALKAN")) {
				System.out.println("Pesanan ini SUDAH DIBATALKAN!");
				return;
			}
			
			if(cancel.getTanggal().equals("03062020")) {
				System.out.println("TIDAK BISA BATAL KARENA TANGGAL INI TANGGAL UJIAN");
				return;
			}
			
			cancel.cancelOrder(cancel.getMediaPromosi().getNama());
			System.out.println("Pesanan Berhasil Dibatalkan !!");

		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		seedData();
		while(true) {
			mainMenu();
			pilihan = s.nextInt();
			switch(pilihan) {
			case 1:
				tambahMedia();
				break;
			case 2:
				orderMedia();
				break;
			case 3:
				endOrder();
				break;
			case 4:
				Credits();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}

}