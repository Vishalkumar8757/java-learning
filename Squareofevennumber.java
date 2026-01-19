// Q4. Write a program to print Sqaure of Even number from 10 To 20
import java.util.Scanner;
class  Squareofevennumber{
public static void main(String args[]){
        
      int n = 10;
       while(n<=20){
         if(n%2==0){
          System.out.println(n*n);
         }
          n++;
       }    
  }
}