package umn.ac.id.uts;

import java.util.ArrayList;

public class Unhealthy extends Human {
	
	//Object
	private int muscle = 25;
	private int fat = 50;
	private int stressLevel = 4;
	private double weight;
	public ArrayList<String> activities = new ArrayList<String>();
	
	// Method
	public Unhealthy () {}
	public Unhealthy (String nama, int age) {
		super(nama, age);
	}
	
	public double getWeight() {
		return (fat * 0.3) + (muscle * 0.6);
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getMuscle() {
		return muscle;
	}
	
	public int getStressLevel() {
		return stressLevel;
	}
	
	public void UpdateWeight() {
		weight =  (fat * 0.3) + (muscle * 0.6);
	}
	
	public void eat(Food food) {
		if(this.getMuscle() >= food.muscle) {
			System.out.println(this.getNama() + " loves it!");
			this.stressLevel -= 2;
			this.fat += food.fat;
			this.muscle -= food.muscle;
			this.UpdateWeight();
		}else if(this.getMuscle() < food.muscle) {
			System.out.println(this.getNama() + " is way too unhealthy!");
		}else {
			System.out.println("Something went wrong");
		}
	}
	
	public void workout(Exercise exercise) {
		if(this.getStressLevel() <= 10) {
			System.out.println(this.getNama() + " Doesn't really like it!");
			this.stressLevel += 2;
			this.fat -= exercise.fat;
			this.muscle += exercise.muscle;
			this.UpdateWeight();
		}else if(this.getStressLevel() < 10) {
			System.out.println(this.getNama() + " is stressed out");
		}else {
			System.out.println("Something went wrong");
		}
	}
}
