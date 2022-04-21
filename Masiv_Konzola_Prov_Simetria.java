import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //1. Въвеждане на масив през кознолата
        Scanner input = new Scanner(System.in);
        System.out.println("Въведи число");
        int n = input.nextInt();
        int [] array = new int[n];
        
        for (int i = 0; i < n; i++){
        array [i] = input.nextInt();
    }
      System.out.println("\n1. Нововъведения масив през конзлата е:\n" + Arrays.toString(array));
    
    
        
        //2. Проверка за симетрия на масива
      boolean symetric = true;
      for (int j = 0; j < (array.length + 1)/2; j++) {
        if (array [j] != array[n-j-1])
        symetric = false;
        
      }
    System.out.printf("\n2. Симетричен ли е масива? ==> %b%n", symetric);
    
       
       
        //3. Интерация на масива - и различни действия с него
      for (int index = 0; index < array.length; index++) {
        array [index] = 2 * array[index];
      }   
      System.out.println("\n3. Обхождаме масива и умножаваме всеки елемент *2:\n" + Arrays.toString(array));
    
    
    
    
    //4. Интерация на масива - и различни действия с него
    // Обхождаме само четните позиции (места) на масива \nи ги повдигаме на квадрат:
      for (int index = 0; index < array.length; index+=2) {
        array [index] = array[index]*array[index];
      }   
      System.out.println("\n4. Обхождаме само четните позиции (места) на масива \nи ги повдигаме на квадрат:\n" + Arrays.toString(array));
    
    
     //5. Интерация на масива - и различни действия с него
     //Ревърс на масива (обикаляме цъкъла наобратно)
      System.out.print("\n5. Ревърс на масива (обикаляме цъкъла наобратно):\n");
      for (int index = array.length - 1; index >= 0; index--) {
        System.out.print((array[index])+ " ");
      }   
      
     //6. Итерация с разширен for цикъл (for-each) – пример
      System.out.println("\n\n6. Итерация с разширен for цикъл (for-each) – пример ");
      String[] capitals = {"Sofia", "Washington", "London", "Paris"};
      for (String stolitsi : capitals) {
      System.out.println(stolitsi);
}
    
    
  }

}