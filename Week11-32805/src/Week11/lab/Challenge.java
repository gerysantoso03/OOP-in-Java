package Week11.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
	
	static ArrayList<Item> item = new ArrayList<Item>();
	static ArrayList<Payment> payment = new ArrayList<Payment>();
	static int counterCash = 0;
	
	public static void mainMenu(){
		System.out.println("------------Menu Toko Elektronik------------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan ");
		System.out.println("3. Exit ");
		System.out.print("Pilihan : ");
	}
	
	public static void menuBayar() {
		System.out.println("------------Tipe Pembayaran------------");
		System.out.println("1. Cash");
		System.out.println("2. Credits");
		System.out.print("Pilihan : ");
	}
		
	public static void seedData() {
		item.add(new Item("Kulkas", "Electronic", 4800000));
		item.add(new Item("TV", "Electronic", 12800000));
		item.add(new Item("Laptop", "Computer", 6000000));
		item.add(new Item("PC", "Computer", 12000000));
	}
	
	public static void showItem() {
		int id = 1;
		for(Item isiItem: item) {
			System.out.println("ID    : " + id);
			System.out.println("Nama  : " + isiItem.getNama());
			System.out.println("Tipe  : " + isiItem.getTipe());
			System.out.println("Harga : " + isiItem.getHarga());
			System.out.println("-------------------------------");
			id++;
		}
		System.out.print("Pilih Item : ");
	}
	
	public static void tampilPesanan() {
		int id = 1;
		for(Payment isiPayment: payment) {
			System.out.println("ID               : " + id);
			System.out.println("Nama             : " + isiPayment.getItem().getNama());
			System.out.println("Tipe             : " + isiPayment.getItem().getTipe());
			System.out.println("Status           : " + isiPayment.getStatus());
			System.out.println("Sisa Pembayaran  : " + isiPayment.getRemainingAmount());
			id++;
		}
	}
	
	public static void pesanBarang() {
		Scanner s = new Scanner(System.in);
		int pilBayar, pilItem, bayar, lamaCicilan;
		String konfirmBayar;
		showItem();
		pilItem = s.nextInt();
		System.out.println("Nama  : " + item.get(pilItem - 1).getNama());
		System.out.println("Tipe  : " + item.get(pilItem - 1).getTipe());
		System.out.println("Harga : " + item.get(pilItem - 1).getHarga());
		menuBayar();
		pilBayar = s.nextInt();
		switch(pilBayar) {
		case 1:
			System.out.print("Bayar (Y/N) : ");
			konfirmBayar = s.next();
			if(konfirmBayar.contains("y") || konfirmBayar.contains("Y")) {
				System.out.println("Harga Pembayaran : " + item.get(pilItem - 1).getHarga());
				System.out.print("Bayar : ");
				bayar = s.nextInt();
				if(bayar != item.get(pilItem - 1).getHarga()) {
					System.out.println("Harap Masukan pembayaran dengan benar, silahkan pesan ulang !!");
					return;
				}else {
					payment.add(new Cash(new Item(item.get(pilItem - 1).getNama(), item.get(pilItem - 1).getTipe(), item.get(pilItem - 1).getHarga())));
					payment.get(counterCash).pay();
					System.out.println("Transaksi telah dibayar dengan lunas");
				}
			}else if(konfirmBayar.contains("n") || konfirmBayar.contains("N")) {
				payment.add(new Cash(new Item(item.get(pilItem - 1).getNama(), item.get(pilItem - 1).getTipe(), item.get(pilItem - 1).getHarga())));
				counterCash++;
				//payment.get(payment.size() - 1);
				System.out.println("Transaksi Telah disimpan");
			}
			break;
		case 2:
			System.out.print("Lama Cicilan (3/6/9/12)  : ");
			lamaCicilan = s.nextInt();
			if(lamaCicilan != 3 && lamaCicilan != 6 && lamaCicilan != 9 && lamaCicilan != 12) {
				return;
			}else {
				Credit credit = new Credit(new Item(item.get(pilItem - 1).getNama(), item.get(pilItem - 1).getTipe(), item.get(pilItem - 1).getHarga()), lamaCicilan);
				credit.setInstallment();
				System.out.println("Harga Pembayaran : " + credit.getInstallment());
				System.out.print("Bayar : ");
				bayar = s.nextInt();
				if(bayar != credit.getInstallment()) {
					System.out.println("Harap masukan uang dengan benar, silahkan pesan ulang !!");
					return;
				}else {
					System.out.println("Transksi telah dibayar");
					credit.pay();
					payment.add(credit);
					counterCash++;
				}
			}
			break;
		}
	}
	
	public static void lihatPesanan() {
		Scanner s = new Scanner(System.in);
		int pilPesanan, id = 1, bayar;
		for(Payment isiPayment: payment) {
			System.out.println("ID               : " + id);
			System.out.println("Nama             : " + isiPayment.getItem().getNama());
			System.out.println("Tipe             : " + isiPayment.getItem().getTipe());
			System.out.println("Status           : " + isiPayment.getStatus());
			System.out.println("Sisa Pembayaran  : " + isiPayment.getRemainingAmount());
			System.out.println("--------------------------------------------------------");
			id++;
		}
		System.out.print("Pilih No Transaksi : ");
		pilPesanan = s.nextInt();
		if(payment.get(pilPesanan - 1).getClassName() == "CASH") {
			if(payment.get(pilPesanan - 1).isPaidOff) {
				System.out.println("Nama             : " + payment.get(pilPesanan - 1).getItem().getNama());
				System.out.println("Tipe             : " + payment.get(pilPesanan - 1).getItem().getTipe());
				System.out.println("Status           : " + payment.get(pilPesanan - 1).getStatus());
				System.out.println("Sisa Pembayaran  : " + payment.get(pilPesanan - 1).getRemainingAmount());
				System.out.println("Transaksi sudah Lunas");
			}else {
				System.out.println("Nama             : " + payment.get(pilPesanan - 1).getItem().getNama());
				System.out.println("Tipe             : " + payment.get(pilPesanan - 1).getItem().getTipe());
				System.out.println("Status           : " + payment.get(pilPesanan - 1).getStatus());
				System.out.println("Sisa Pembayaran  : " + payment.get(pilPesanan - 1).getRemainingAmount());
				System.out.print("Bayar : ");
				bayar = s.nextInt();
				if(bayar != payment.get(pilPesanan - 1).getRemainingAmount()) {
					System.out.println("Harap masukan uang dengan benar, silahkan ulang untuk penyelesaian transaksi !!");
					return;
				}else if(bayar == payment.get(pilPesanan - 1).getItem().getHarga()){
					System.out.println("Transaksi Telah dibayar lunas");
					payment.get(pilPesanan - 1).pay();
				}
			}
		}else if(payment.get(pilPesanan - 1).getClassName() == "CREDITS") {
			Credit credit = (Credit) payment.get(pilPesanan - 1);
			if(payment.get(pilPesanan - 1).isPaidOff) {
				System.out.println("Nama             : " + payment.get(pilPesanan - 1).getItem().getNama());
				System.out.println("Tipe             : " + payment.get(pilPesanan - 1).getItem().getTipe());
				System.out.println("Status           : " + payment.get(pilPesanan - 1).getStatus());
				System.out.println("Sisa Pembayaran  : " + payment.get(pilPesanan - 1).getRemainingAmount());
				System.out.println("Harga Pembayaran : " + credit.getInstallment());
				System.out.println("Transaksi Sudah Lunas");
			}else {
				System.out.println("Nama             : " + payment.get(pilPesanan - 1).getItem().getNama());
				System.out.println("Tipe             : " + payment.get(pilPesanan - 1).getItem().getTipe());
				System.out.println("Status           : " + payment.get(pilPesanan - 1).getStatus());
				System.out.println("Sisa Pembayaran  : " + payment.get(pilPesanan - 1).getRemainingAmount());
				System.out.println("Harga Pembayaran : " + credit.getInstallment());
				System.out.print("Bayar : ");
				bayar = s.nextInt();
				if(bayar != credit.getInstallment()) {
					System.out.println("Harap masukan uang dengan benar, silahkan ulang untuk penyelesaian transaksi !!");
					return;
				}else if(bayar == credit.getInstallment() && payment.get(pilPesanan - 1).getItem().getHarga() != 0) {
						credit.pay();
						//payment.get(pilPesanan - 1).getItem().Bayar(bayar);
						System.out.println("Cicilan telah dibayar");
						if(payment.get(pilPesanan - 1).getItem().getHarga() == 0) {
							System.out.println("---------------------");
							System.out.println("Transaksi Lunas");
						}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pil;
		seedData();
		while(true) {
			mainMenu();
			pil = s.nextInt();
			switch(pil) {
			case 1:
				pesanBarang();
				break;
			case 2:
				lihatPesanan();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Input salah !!");
				break;
			}
		}
	}

}
