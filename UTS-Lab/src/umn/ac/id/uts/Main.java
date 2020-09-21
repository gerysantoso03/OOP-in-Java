package umn.ac.id.uts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Food[] foods = new Food[5];
	static Exercise[] exercises = new Exercise[5];
	static ArrayList<Healthy> healthy = new ArrayList<Healthy>();
	static ArrayList<Unhealthy> unhealthy = new ArrayList<Unhealthy>();
	
	static Food keepFood = new Food();
	static Exercise keepExercise = new Exercise();
	
 	// Eat
	public static void seedFood() {
		foods[0] = new Food("Pizza", 3, 10);
		foods[1] = new Food("Risotto", 2, 4);
		foods[2] = new Food("Burger", 4, 9);
		foods[3] = new Food("Noodle", 3, 5);
		foods[4] = new Food("Salad", 1, 1);
	}
	
	public static void showFood() {
		Scanner s = new Scanner(System.in);
		int id = 1, pilFood;
		System.out.println("-------------------------------------------");
		System.out.println("                  Food                     ");
		System.out.println("-------------------------------------------");
		for(Food itemFood : foods) {
				System.out.println("ID             : " + id);
				System.out.println("Nama           : " + itemFood.nama);
				System.out.println("Muscle         : " + itemFood.muscle);
				System.out.println("Fat            : " + itemFood.fat);
				System.out.println("----------------------------------");
				id++;
		}
		System.out.print("Choose your food : ");
	}
	
	public static void userEat() {
		int pilFood, pilKarakter = 0;
		Scanner s = new Scanner(System.in);
		showFood();
		
		while(true) {
			pilFood = s.nextInt();
			
			if(pilFood < 0 || pilFood > 5) {
				System.out.println("Input salah !!");
				continue;
			}else {
				break;
			}
		}
		
		// Makan food
		keepFood = foods[pilFood - 1];
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character : ");
		while(true) {
			pilKarakter = s.nextInt();
			if(pilKarakter == 1) {
				healthy.get(0).eat(keepFood);
				healthy.get(0).activities.add("Eating : " + keepFood.nama);
				break;
			}else if(pilKarakter == 2) {
				unhealthy.get(0).eat(keepFood);
				unhealthy.get(0).activities.add("Eating : " + keepFood.nama);
				break;
			}
		}
	}
	
	// Workout
	public static void seedExercise() {
		exercises[0] = new Exercise("Plank", 1, 2);
		exercises[1] = new Exercise("Crunch", 2, 3);
		exercises[2] = new Exercise("Squat", 3, 3);
		exercises[3] = new Exercise("Pull UP", 2, 2);
		exercises[4] = new Exercise("Comandos", 5, 2);
	}
	
	public static void showExercise() {
		int id = 1;
		System.out.println("-------------------------------------------");
		System.out.println("                  Food                     ");
		System.out.println("-------------------------------------------");
		for(Exercise item : exercises) {
				System.out.println("ID                   : " + id);
				System.out.println("Nama                 : " + item.nama);
				System.out.println("Muscle               : " + item.muscle);
				System.out.println("Fat                  : " + item.fat);
				id++;
		}
		System.out.print("Choose your Exercise : ");
	}
	
	public static void userExercise() {
		int pilExercise, pilKarakter = 0;
		Scanner s = new Scanner(System.in);
		showExercise();
		
		while(true) {
			pilExercise = s.nextInt();
			
			if(pilExercise < 0 || pilExercise > 5) {
				System.out.println("Input salah !!");
				continue;
			}else {
				break;
			}
		}
		
		// Melakukan Exercise 
		keepExercise = exercises[pilExercise - 1];
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character : ");
		while(true) {
			pilKarakter = s.nextInt();
			if(pilKarakter == 1) {
				healthy.get(0).workout(keepExercise);
				healthy.get(0).activities.add("Working out : " + keepExercise.nama);
				break;
			}else if(pilKarakter == 2) {
				unhealthy.get(0).workout(keepExercise);
				unhealthy.get(0).activities.add("Working out : " + keepExercise.nama);
				break;
			}
		}
		
	}
	
	// Input karakter Healthy & Unhealthy
	public static void inputKarakter() {
		String nama;
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("                Living Life                ");
		System.out.println("-------------------------------------------");
		System.out.println("Healthy ");
		System.out.print("Nama  : ");
		nama = s.nextLine();
		System.out.print("Age   : ");
		age = s.nextInt();
		healthy.add(new Healthy(nama, age));
		System.out.println("Healthy character is added");
		System.out.println("-------------------------------------------");
		s.nextLine();
		System.out.println("Unhealthy");
		System.out.print("Nama  : ");
		nama = s.nextLine();
		System.out.print("Age   : ");
		age = s.nextInt();
		unhealthy.add(new Unhealthy(nama, age));
		System.out.println("Unhealthy character is added");
	}
	
	// Menu Utama
	public static void mainMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("                Living Life                ");
		System.out.println("-------------------------------------------");
		System.out.println("1. Your Detail");
		System.out.println("2. Eat");
		System.out.println("3. Workout");
		System.out.println("4. List of activities");
		System.out.println("5. Credits ");
		System.out.println("0. exit");
		System.out.print("Input : ");
	}

	// Detail user Healthy & Unhealthy
	public static void yourDetail() {
		int input;
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("                Living Life                ");
		System.out.println("-------------------------------------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character : ");
		input = s.nextInt();
		if(input == 1) {
			for(Healthy item : healthy) {
				System.out.println("Healthy");
				System.out.println("Nama         : " + item.getNama());
				System.out.println("Age          : " + item.getAge());
				System.out.println("Weight       : " + item.getWeight());
				System.out.println("Muscle       : " + item.getMuscle());
				System.out.println("Fat          : " + item.getFat());
				System.out.println("Stress Level : " + item.getStressLevel());
			}
		}else if(input == 2) {
			for(Unhealthy item : unhealthy) {
				System.out.println("Unhealthy");
				System.out.println("Nama         : " + item.getNama());
				System.out.println("Age          : " + item.getAge());
				System.out.println("Weight       : " + item.getWeight());
				System.out.println("Muscle       : " + item.getMuscle());
				System.out.println("Fat          : " + item.getFat());
				System.out.println("Stress Level : " + item.getStressLevel());
			}
		}else {
			System.out.println("Input salah !!");
		}
	}
	
	// List of Activities
	public static void showActivities() {
		Scanner s = new Scanner(System.in);
		int pilKarakter;
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
		System.out.print("Choose your character : ");
		pilKarakter = s.nextInt();
		if(pilKarakter == 1) {
			System.out.println("Healthy");
			for(String item : healthy.get(0).activities) {
				System.out.println(item);
			}
		}else {
			System.out.println("Unhealthy");
			for(String item : unhealthy.get(0).activities) {
				System.out.println(item);
			}
		}
		
	}
	
	public static void credits() {
		System.out.println("------------------Credits------------------");
		System.out.println("Nama : Bernardus Gery Santoso");
		System.out.println("NIM  : 00000032805");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		inputKarakter();
		while(true){
			mainMenu();
			pilihan = s.nextInt();
			switch(pilihan){
			case 1 :
				yourDetail();
				break;
			case 2:
				seedFood();
				userEat();
				break;
			case 3:
				seedExercise();
				userExercise();
				break;
			case 4:
				showActivities();
				break;
			case 5:
				credits();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Input salah Harap masukan dengan benar !!");
				break;
			}
		}
	}

}
