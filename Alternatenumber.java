// Q3. Write a program to  print alternate number from 80 To 70.

import java.util.Scanner;
class Alternatenumber{
public static void main(String args[]){
        
      int n = 80;
       while(n>=70){
         if(n%2==0){
          System.out.println(n);
         }
          n--;
       }    
  }
}