package Week02.GerySantoso.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Masukan angka :");

		int num = scan.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
	       temp=num%i;
	       
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " adalah bilangan prima");
		else
		   System.out.println(num + " adalah bukan bilangan prima");
	}

}
