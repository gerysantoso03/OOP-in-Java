package week03;

import java.util.Scanner;

public class Latihan4 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  float[][] data = { {15, 10, 1}, {-10, 15, 2}, {10, -10, 1}, {-15, -5, 3}, {-5, 5, 2} };
  float i, j, res;
  
  Scanner s = new Scanner(System.in);
  System.out.print("Input atribut 1: ");
  i = s.nextFloat();
  System.out.print("Input atribut 2: ");
  j = s.nextFloat();
  
  res = j - i;
  res = Math.abs(res);
  System.out.println("Jarak antara dua variabel (atribute ke-3): " + res);

  for(int x = 0; x < data.length; ++x) {
   for(int y = 0; y < data[x].length; ++y) {
    System.out.print(data[x][y] + " ");
   }
   System.out.println("");
  }
  
  System.out.print(i + " " + j + " " + res);
  
 }

}