package week03;

import java.util.Random;

public class Latihan5 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int[][] sudoku = new int[3][3];
  Random random = new Random();
  boolean check = true;
  
  for(int i = 0; i < 3; i++) {
   for(int j = 0; j < 3; j++) {
    sudoku[i][j] = random.nextInt(3) + 1;
   }
  }
  

  // First column.
  for(int x = 0; x < sudoku.length; x++) {
   if(sudoku[x][0] == sudoku[x][1] || sudoku[x][0] == sudoku[x][2] || sudoku[x][1] == sudoku[x][2]) {
    check = false;
    break;
   }
   if(sudoku[0][x] == sudoku[1][x] || sudoku[0][x] == sudoku[2][x] || sudoku[1][x] == sudoku[2][x]) {
    check = false;
    break;
   }
  }
  
  for(int x = 0; x < sudoku.length; x++) {
   for(int y = 0; y < sudoku[x].length; y++) {
    System.out.print(sudoku[x][y] + " ");
   }
   System.out.println("");
  }
  
  if(check == true) {
   System.out.println("Sudoku");
  }
  
 }

}