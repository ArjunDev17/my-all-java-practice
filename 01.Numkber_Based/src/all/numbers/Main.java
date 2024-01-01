package all.numbers;

import java.util.*;
public class Main{
   
   public static void main(String args[]){
      
      int originalNumber = 21;
      
      System.out.println("Given number:"+originalNumber);
      
      int copyOfOriginalNumber = originalNumber;
      
      int sum = 0;
      
      while(originalNumber > 0){
         
         int rem = originalNumber%10;
         
         sum = sum + rem;
         
         originalNumber = originalNumber/10;
      }

      if(copyOfOriginalNumber % sum == 0)
         System.out.println(copyOfOriginalNumber+" is a niven number");
      else
         System.out.println(copyOfOriginalNumber+" is not a niven number");
   }
}