package Week5.lab;

import java.util.Scanner;


public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Masukan Jari-Jari lingkaran : ");
		double radius = s.nextDouble();
		System.out.print("Masukan Warna : ");
		String color = s.next();
		
		Circle circle = new Circle(radius, color);
		System.out.println("----------Lingkaran----------");
		System.out.println("Warna              : "+ circle.getColor());
		System.out.println("Jari - jari        : "+ circle.getRadius());
		System.out.println("Keliling Lingkaran : "+ circle.getPerimeter());
		System.out.println("Luas Lingkaran     : "+ circle.getArea());
		
	}

}
