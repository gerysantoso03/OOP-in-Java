package week03;

import java.util.Random;
import java.util.Arrays;

public class Latihan1 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Random random = new Random();
  int[] list_score = new int[10];
  int min_score, max_score;
  
  for(int i = 0; i < 10; i++) {
   list_score[i] = random.nextInt(100);
   System.out.println("Number " + i + " value: " + list_score[i]);
  }
  
  Arrays.sort(list_score);
  
  min_score = list_score[0];
  max_score = list_score[9];
  
  System.out.println("\n\nLowest number: " + min_score);
  System.out.println("Highest number: " + max_score);

 }

}