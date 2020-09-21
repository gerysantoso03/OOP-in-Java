package week03;

public class Latihan3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  float[][] data = { {15, 10, 1}, {-10, 15, 2}, {10, -10, 1}, {-15, -5, 3}, {-5, 5, 2} };
  
  for(int i = 0; i < data.length; ++i) {
   for(int j = 0; j < data[i].length; ++j) {
    System.out.print(data[i][j] + " ");
   }
   System.out.println("");
  }
  
 }
}