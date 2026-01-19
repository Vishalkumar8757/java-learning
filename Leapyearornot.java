// Q9.  Program to Find if a Given Year is a Leap Year
 
import java.util.Scanner;
 class  Leapyearornot{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any digit :   ");
      int n = sc.nextInt();
     
       if(n%4==0){
         System.out.println("leap year");
       }
       else{
          System.out.println("Not leap year");
       }

  }
}