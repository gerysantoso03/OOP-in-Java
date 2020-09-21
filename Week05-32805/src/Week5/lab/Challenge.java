package Week5.lab;

import java.util.Scanner;



public class Challenge {
	
//	static Shape[] shapess = new Shape[4];
//	
//	public static void seedData() {
//		shapess[0] = new Shape("Biru");
//		shapess[1] = new Shape("Merah");
//		shapess[2] = new Shape("Ungu");
//		shapess[3] = new Shape("Hitam");
//	} 
	
	public static void mainMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("-----Program Menghitung Bangun Ruang-----");
		System.out.println("1. Lingkaran ");
		System.out.println("2. Persegi ");
		System.out.println("3. Persegi Panjang ");
		System.out.println("4. Segitiga Siku-Siku ");
		System.out.println("5. Keluar ");
		System.out.print("Pilihan : ");
	}
	
	public static void circle() {
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("---------- Lingkaran ----------");
		System.out.print("Masukan Jari-Jari Lingkaran : ");
		Double radius = s.nextDouble();
		System.out.print("Masukan Warna : ");
		String color = s.next();
		Circle circle = new Circle(radius, color);
		System.out.println("Warna              : "+ circle.getColor());
		System.out.println("Jari - jari        : "+ circle.getRadius());
		System.out.println("Keliling Lingkaran : "+ circle.getPerimeter());
		System.out.println("Luas Lingkaran     : "+ circle.getArea());
	}
	
	public static void square() {
		Scanner s = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("---------- Persegi ----------");
		System.out.print("Masukan sisi Persegi : ");
		Double sisi = s.nextDouble();
		System.out.print("Masukan Warna : ");
		String color = s.next();
		Square square = new Square(sisi, color);
		System.out.println("Warna              : "+ square.getColor());
		System.out.println("Sisi               : "+ square.getSisi());
		System.out.println("Keliling Persegi   : "+ square.getPerimeter());
		System.out.println("Luas Persegi       : "+ square.getArea());
	}
	
	public static void rectangle() {
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("---------- Persegi Panjang ----------");
		System.out.print("Masukan Panjang Persegi Panjang : ");
		Double panjang = s.nextDouble();
		System.out.print("Masukan Lebar Persegi Panjang   : ");
		Double lebar = s.nextDouble();
		System.out.print("Masukan Warna : ");
		String color = s.next();
		Rectangle rectangle = new Rectangle(panjang, lebar , color);
		System.out.println("Warna                    : "+ rectangle.getColor());
		System.out.println("Panjang & Lebar          : "+ rectangle.getPanjang() + " & " + rectangle.getLebar());
		System.out.println("Keliling Persegi Panjang : "+ rectangle.getPerimeter());
		System.out.println("Luas Persegi Panjang     : "+ rectangle.getArea());
	}
	
	public static void segitigasiku() {
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("---------- Segitiga Siku-Siku ----------");
		System.out.print("Masukan Alas Segitiga     : ");
		Double alas = s.nextDouble();
		System.out.print("Masukan Tinggi Segitiga   : ");
		Double tinggi = s.nextDouble();
		System.out.print("Masukan Warna : ");
		String color = s.next();
		Segitigasiku segitigasiku = new Segitigasiku(alas, tinggi , color);
		System.out.println("Warna                       : "+ segitigasiku.getColor());
		System.out.println("Alas & Tinggi               : "+ segitigasiku.getAlas() + " & " + segitigasiku.getTinggi());
		System.out.println("Keliling Segitiga Siku-Siku : "+ segitigasiku.getPerimeter());
		System.out.println("Luas Segitiga Siku-SIku     : "+ segitigasiku.getArea());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			mainMenu();
			int pilihan = s.nextInt();
			switch(pilihan){
				case 1:
					circle();
					break;
				case 2:
					square();
					break;
				case 3:
					rectangle();
					break;
				case 4:
					segitigasiku();
					break;
				case 5:
					System.out.println("Keluar dari program ......");
					return;
				default:
					System.out.println("Input tidak valid !!!");
					break;
			}	
		}
	}

}
