package oplet;

import java.util.Scanner;

public class Myclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number , tempNumber, checker, result = 0, n = 0;
		 Scanner Mynum = new Scanner(System.in);
		 System.out.println("Masukan Angka : ");
		 
		 number = Mynum.nextInt();
		 
	        tempNumber = number;
	        for (;tempNumber != 0; tempNumber /= 10, ++n);
	        tempNumber = number;
	        for (;tempNumber != 0; tempNumber /= 10)
	        {
	            checker = tempNumber % 10;
	            result += Math.pow(checker, n);
	        }
	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");

	}

}
