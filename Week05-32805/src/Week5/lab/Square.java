package Week5.lab;

public class Square extends Shape{
	private Double sisi;
	
	public Square() {}
	public Square(double sisi, String color) {
		super(color);
		this.sisi = sisi;
	}
	
	public double getSisi() {
		return sisi;
	}
	
	
	public double getArea() {
		return sisi * sisi;
	}
	
	public double getPerimeter() {
		return sisi * 4;
	}

}
