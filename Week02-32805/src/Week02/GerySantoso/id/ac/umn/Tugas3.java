package Week02.GerySantoso.id.ac.umn;

import java.util.Scanner;

public class Tugas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, i, j, temp, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan angka terkecil : ");
		num1 = scanner.nextInt();
		System.out.println("Masukan angka terbesar : ");
		num2 = scanner.nextInt();
		
		
		for(i = num1; i <= num2; i++) {
			
			temp = 0;
			for(j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					temp++;
					break;
				}
			}
			
			if(temp == 0 && i != 1) {
				sum = sum + i;
			}
		}
		System.out.println("jumlah dari semua nilai prima " + num1 + " dan " + num2 + " adalah " + sum);
	}
}
