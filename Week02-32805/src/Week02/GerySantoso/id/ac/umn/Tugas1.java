package Week02.GerySantoso.id.ac.umn;

import java.util.Scanner;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pilih bulan (1 - 12) :");
		System.out.println("Pilih : ");
		input = scanner.nextInt();
		
		switch(input) {
			case 1: System.out.println("Bulan januari memiliki 31 hari"); break;
			case 2: System.out.println("Bulan febuari memiliki 28 hari"); break;
			case 3: System.out.println("Bulan maret memiliki 31 hari"); break;
			case 4: System.out.println("Bulan april memiliki 30 hari"); break;
			case 5: System.out.println("Bulan mei memiliki 31 hari"); break;
			case 6: System.out.println("Bulan juni memiliki 30 hari"); break;
			case 7: System.out.println("Bulan juli memiliki 31 hari"); break;
			case 8: System.out.println("Bulan agustus memiliki 31 hari"); break;
			case 9: System.out.println("Bulan september memiliki 30 hari"); break;
			case 10: System.out.println("Bulan oktober memiliki 31 hari"); break;
			case 11: System.out.println("Bulan november memiliki 30 hari"); break;
			case 12: System.out.println("Bulan december memiliki 31 hari"); break;
			default: System.out.println("pilihan salah !");
		}
	}
}
