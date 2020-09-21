package umn.ac.id.uts;

public class Human {
	
	
	// Object
	private String nama;
	private int age;
	public Food food;
	public Exercise exercise;
	
	// Method
	public Human () {}
	public Human (String nama, int age) {
		this.nama = nama;
		this.age = age;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getAge() {
		return age;
	}
	
	public Food eat() {
		return food;
	}
	
	public Exercise workout() {
		return exercise;
	}
	
	
	
	
}
