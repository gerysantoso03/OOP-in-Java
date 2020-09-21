package Week5.lab;

public class Segitigasiku extends Shape {
	private Double alas;
	private Double tinggi;
	private Double sisiMiring;
	
	public Segitigasiku() {}
	public Segitigasiku(double alas, double tinggi, String color) {
		super(color);
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public double getAlas() {
		return alas;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getArea() {
		return (alas * tinggi) / 2;
	}
	
	public double getPerimeter() {
		sisiMiring = Math.pow(Math.pow(alas, 2) 
							+ Math.pow(tinggi, 2),0.5);
		return alas + tinggi + sisiMiring;
	}
}
