package Week5.lab;

public class Rectangle extends Shape {
	private double panjang;
	private double lebar;
	
	public Rectangle() {}
	public Rectangle(double panjang, double lebar, String color) {
		super(color);
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public double getPanjang() {
		return panjang;
	}
	
	public double getLebar() {
		return lebar;
	}
	
	public double getArea() {
		return panjang * lebar;
	}
	
	public double getPerimeter() {
		return (2 * panjang) + (2 * lebar);
	}
}
