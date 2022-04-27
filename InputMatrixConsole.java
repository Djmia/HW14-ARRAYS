import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи брой редове на матрицата  < 10 ");
        int rows = input.nextInt();
        System.out.println("Въведи брой колони на матрицата  < 10 ");
        int cols = input.nextInt();
        
        if (rows >=10 || cols >=10) {
          System.out.println("Грешен размер на редове и колони, следва да са < 10 ");
        } 
        
        
        //ЦИКЪЛ ЗА ВЪВЕЖДАНЕ ПРЕЗ КОНЗОЛАТА И ПЕЧАТ
        
        System.out.println("Въведи последователно стойности на матрицата за: " + "\nбр.редове: " + rows + "\nбр.колони: " + cols);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
          for (int col = 0; col < cols; col++) {
          matrix[row][col] = input.nextInt();
      }
    }
        System.out.println(Arrays.deepToString(matrix) + "\n ");
        
        
        

        // ЦИКЪЛ ЗА ПЕЧАТ КАТО МАТРИЦА
        
        for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[0].length; col++) {
        System.out.printf("%d ", matrix[row][col]);
      }
        System.out.println();
    }
    
    

  }
}
