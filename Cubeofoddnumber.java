// Q5. Write a program to print cube of odd number from 1 to 10.

import java.util.Scanner;
class  Cubeofoddnumber{
public static void main(String args[]){
        
      int n = 1;
       while(n<=10){
         if(n%2==1){
          System.out.println(n*n*n);
         }
          n++;
       }    
  }
}