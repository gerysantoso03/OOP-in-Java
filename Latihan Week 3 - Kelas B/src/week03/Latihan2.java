package week03;

import java.util.Random;
import java.util.Arrays;


public class Latihan2 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Random random = new Random();
  int[] tinggi_badan = new int[10];
  float rata_rata = 0, std_dev = 0;
  float temp = 0;
  
  for(int i = 0; i < 10; i++) {
   tinggi_badan[i] = 145 + random.nextInt(180 - 145 + 1);
   System.out.println("Number " + i + " value: " + tinggi_badan[i]);
  }
  
  for(int i = 0; i < 10; i++) {
   temp = temp + tinggi_badan[i];
  }
  
  rata_rata = temp / 10;
  
  for(float num : tinggi_badan) {
   std_dev += Math.pow(num - rata_rata, 2);
  }
  
  std_dev = (float) Math.sqrt(std_dev/tinggi_badan.length);
  
  System.out.println("Rata-rata tinggi badan: " + rata_rata);
  System.out.println("Standar deviasi tinggi badan: " + std_dev);

 }

}