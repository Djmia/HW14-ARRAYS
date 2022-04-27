import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 1. Създаване на матрица -пример
        int [][] matrix = {
       //  0, 1, 2, 3
          {1, 3, 5, 7},  // 0
          {0, 2, 4, 6},  // 1
          {9, 8, 7 ,6}   // 2
          
        };
        
        // 2. Дължина на матрицата - пример
        System.out.println("Дължина на масива по редове и брой измерения: " + matrix.length); // дължина по редове, брой на измеренията
        System.out.println("Дължна на масива по колони: " + matrix[0].length); // дължина по колони
        System.out.println("================");
        
        
        // 3. Отпечатване на матрицата чрез цикъл
        System.out.println("\nОтпечатване на матрицата чрез цикъл");
        for (int row = 0; row < matrix.length; row++) {
          for (int cow = 0; cow < matrix[0].length; cow++) {
            System.out.printf("%d ",matrix[row][cow]);
          }
          System.out.println();
        }
       
       
       // 4. Отпечатване на матрицата чрез метода Arrays.deepToString(matrix)
        System.out.println("\n================");
        System.out.println("Отпечатване на матрицата чрез метода \nArrays.deepToString(matrix):\n" + Arrays.deepToString(matrix));
        
        
        
        // 5. Въвеждане на матрица от конзолата
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
              System.out.printf("matrix[%d,%d] = ", row, col);
            matrix[row][col] = input.nextInt();
         }
        }
        System.out.println(Arrays.deepToString(matrix));        
        
    }
}
