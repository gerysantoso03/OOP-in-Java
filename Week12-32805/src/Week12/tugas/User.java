package Week12.tugas;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;

public class User {
	
	private String firstName;
	private String lastName;
	private Character gender;
	private String address;
	private String username;
	private String password;
	private MessageDigest digest;
	
	private static final int maxLoginAttempts = 3;
	private static int LoginAttempts;
	
	public User(String firstName, String lastName, Character gender, String address, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	
	public boolean login(String username, String password) throws ExcessiveFailedLoginException {
		if(this.username.equals(username)) {
			if(LoginAttempts == maxLoginAttempts) {
				LoginAttempts++;
				throw new ExcessiveFailedLoginException();
			}else if(LoginAttempts > maxLoginAttempts) {
				throw new ExcessiveFailedLoginException("Anda telah mencapai batas login");
			}
			if(this.password.equals(password)) {
				LoginAttempts = 0;
				return true;
			}else {
				LoginAttempts++;
			}
		}
		return false;
	}
	
	public String greeting() {
		String greet = "Selamat Datang ";
		switch(gender) {
		case 'M' :
			greet += "Tuan ";
			break;
		case 'N' :
			greet += "Nona ";
			break;
		}
		greet += this.firstName + " " + this.lastName;
		
		return greet;
	}
	
	public String getUsername() {
		return username;
	}
	
}
