package Gery.Sinzie.kuis;

import java.util.Scanner;

public class Soal1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String nama;
		int input, nilai;
		while(true) {
			System.out.print("Masukan Nama       : ");
			nama = s.nextLine();
			System.out.print("Masukan Nilai Anda : ");
			nilai  = s.nextInt();
			if(nilai > 100) {
				System.out.println("Input nilai anda salah !!");
			}else if(nilai >= 90) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " istimewa || A || LULUS");
			}else if(nilai >= 80) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " Amat Baik || B || LULUS");
			}else if(nilai >= 70) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " Baik || B || LULUS");
			}else if(nilai >= 60) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " Cukup || C || LULUS" );
			}else if(nilai >= 50) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " Kurang || D || TIDAK LULUS");
			}else if(nilai < 50) {
				System.out.println("Nama : " + nama + " " + "Dengan nilai : " + nilai + " Sangat Kurang || E || TIDAK LULUS");
			}
		System.out.println("---------------------------------------------------------------");
		s.nextLine();
		}
	}

}
