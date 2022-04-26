import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int [] myNum = {2,5,7,9,11,6,3};
        String [] myDays = {"Понеделник", "Вторник", "Сряда", "Четвъртък", "Петък", "Събота", "Неделя"};
        
        System.out.println(myNum[1]);
         System.out.println(myDays[6]);
         System.out.println(Arrays.toString(myNum));
           System.out.println(Arrays.toString(myDays));
         System.out.println("================\n");
                 
     
         
         int [] myNum2 = new int [6];
         myNum2 [1] = 100;
         myNum2 [4] = 200;
         System.out.println(Arrays.toString(myNum2));
         System.out.println("================\n");
                   
         
         int [] myNum3 = {2,4,6,8,10};
         int broi = myNum3.length;
         System.out.println(broi);
         
         int [] reversed = new int [broi];
         
         for (int i = 0; i < broi; i++)  {
           reversed [broi - i - 1] = myNum3[i];
         }
        
       System.out.println(Arrays.toString(reversed));
        System.out.println("================\n");
        
        // 1. Намиране на най-дългото име от масов
        String [] names = {"Milen", "Stela", "Michail"};
        int size = names.length;
        System.out.println(size);
        String longestName = names[0];
        for (int i = 1; i < size; i++) {
          if (names[i].length() > longestName.length()) {
            longestName = names[i];
          }
        }
        System.out.println(longestName);
        
    }
    
}
