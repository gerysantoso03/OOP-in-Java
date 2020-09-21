package Week12.tugas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import exceptions.AuthenticationException;
import exceptions.ExcessiveFailedLoginException;

public class Challenge {
	
	static ArrayList<User> user = new ArrayList<User>();
	
	public static void mainMenu() {
		System.out.println("1. Login");
		System.out.println("2. Sign UP");
		System.out.println("3. Exit");
		System.out.print("Pilihan : ");
	}
	
	public static void initiallize() {
		user.add(new User("John", "Doe", 'L', "Jl. Merpati No 1, RT 1, RW 1, Banten", "admin", "admin"));
	}
	
	public static boolean isValid(String password) {

	    
	    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
	    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
	    Pattern digitCasePatten = Pattern.compile("[0-9 ]");


	    if (password.length() < 6 || password.length() > 16) {
	        return false;
	    }else {
	        if (!UpperCasePatten.matcher(password).find()) {
	        	return false;
		    }
		    if (!lowerCasePatten.matcher(password).find()) {
		    	return false;
		    }
		    if (!digitCasePatten.matcher(password).find()) {
		    	return false;
		    }
		    return true;
	    }

	}
	public static void handleLogin() throws AuthenticationException, ExcessiveFailedLoginException {
		boolean sudahLogin = false;
		String username, password;
		Scanner s = new Scanner(System.in);
		
		while(sudahLogin == false) {
			System.out.print("Username : ");
			username = s.nextLine();
			System.out.print("Password : ");
			password = s.nextLine();
			
			try {
				for(User isiUser : user) {
					sudahLogin = isiUser.login(username, password);
					
					if(sudahLogin == true) {
						System.out.println(isiUser.greeting());
						break;
					}
					else {
						continue;
					}	
				}
				
				if(sudahLogin == false) {
					throw new AuthenticationException("Username atau password salah!");
				}
			}
			catch (ExcessiveFailedLoginException ExcessiveMessage) {
				System.out.println(ExcessiveMessage.getMessage());
				break;
			}
			catch (AuthenticationException AuthMessage) {
				System.out.println(AuthMessage.getMessage());
				continue;
			}
		}
	}

	
	public static void handleSignUP() {
		Scanner s = new Scanner(System.in);
		String namaDepan, namaBelakang, alamat, username, password;
		Character gender;
		System.out.print("Nama Depan : ");
		namaDepan = s.nextLine();
		System.out.print("Nama Belakang : ");
		namaBelakang = s.nextLine();
		System.out.print("Gender : ");
		gender = s.next().charAt(0);
		s.nextLine();
		System.out.print("Alamat : ");
		alamat = s.nextLine();
		System.out.print("Username : ");
		username = s.nextLine();
		if(username.length() <= 9) {
			System.out.println("Username harus lebih dari 8 karakter !!");
			return;
		}
		System.out.print("Password : ");
		password = s.nextLine();
		if(isValid(password)) {
			user.add(new User(namaDepan, namaBelakang, gender, alamat, username, password));
		}else {
			System.out.println("password harus mengandung Huruf besar, Angka, minimal 6 character dan maksimal 16 character");
			return;
		}
		
	}

	public static void main(String[] args) throws AuthenticationException, ExcessiveFailedLoginException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		initiallize();
		while(true) {
			mainMenu();
			pilihan = s.nextInt();
			switch(pilihan) {
			case 1 :
				handleLogin();
				break;
			case 2 :
				handleSignUP();
				break;
			case 3:
				System.exit(0);
				break;
			}
		}
		
	}

}
