package oplet;

import java.util.Scanner;



public class Myclass {
	
	static boolean isPalindrome(String kata) 
    { 
  
        int i = 0, j = kata.length() - 1; 
  
        while (i < j) { 
  
            if (kata.charAt(i) != kata.charAt(j)) 
                return false; 
  
            i++; 
            j--; 
        } 

        return true; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Myobj = new Scanner(System.in);
		System.out.println("Masukan Kata");
		
		String kata  = Myobj.nextLine();
		
		if(isPalindrome(kata))
			System.out.println("Palindrome");
		else
			System.out.println("Bukan Palindrome");
	}
}
