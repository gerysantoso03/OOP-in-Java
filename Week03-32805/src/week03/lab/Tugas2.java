package week03.lab;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystr, mystr2;
		String[] arrofstr;
		int n, m;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Masukan Nama anda : ");
		String nama = s.nextLine();
		System.out.println("---------------------------------");
		System.out.println("String Anda : " + nama);
		System.out.println("1. charAt\t2. length");
		System.out.println("3. substring(n)\t4. substring(m,n)");
		System.out.println("5. contains\t6. concat");
		System.out.println("7. replace\t8. split");
		System.out.println("9. lowerCase\t10. upperCase");
		System.out.println("---------------------------------");
		
		while(true) {
		System.out.print("Pilih Menu : ");
		int pilihan = s.nextInt();
		s.nextLine();
			switch(pilihan) {
			case 1: 
				System.out.println("-----charAt-----");
				System.out.print("Input : ");
				n = s.nextInt();
				char hasilkata = nama.charAt(n);
				System.out.println("Hasil : " + hasilkata);
				break;
			case 2:
				System.out.println("-----length-----");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.length());
				break;
			case 3:
				System.out.println("-----substring(n)-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input : ");
				n = s.nextInt();
				System.out.println("Hasil : " + nama.substring(n));
				break;
			case 4:
				System.out.println("-----substring(n, m)-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input Mulai: ");
				n = s.nextInt();
				System.out.print("Input Akhir: ");
				m = s.nextInt();
				System.out.println("Hasil : " + nama.substring(n, m));
				break;
			case 5:
				System.out.println("-----contains-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input : ");
				mystr = s.nextLine();
				System.out.println("Hasil : " + nama.contains(mystr));
				break;
			case 6:
				System.out.println("-----concat-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input : ");
				mystr = s.nextLine();
				System.out.println("Hasil : " + nama.concat(mystr));
				break;
			case 7:
				System.out.println("-----replace-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input kata yang diganti : ");
				mystr = s.nextLine();
				System.out.print("Input kata pengganti : ");
				mystr2 = s.nextLine();
				System.out.println("Hasil : " + nama.replace(mystr, mystr2));
				break;
			case 8:
				System.out.println("-----split-----");
				System.out.println("Nama : " + nama);
				System.out.print("Input : ");
				mystr = s.nextLine();
				arrofstr = nama.split(mystr);
		        for (String a: arrofstr)
		            System.out.println("Hasil : " + a);
				break;
			case 9:
				System.out.println("-----lowerCase-----");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.toLowerCase());
				break;
			case 10:
				System.out.println("-----upperCase-----");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.toUpperCase());
				break;
			default:
				System.out.println("Input salah !!");
				break;
			}
		}
		

	}
}
