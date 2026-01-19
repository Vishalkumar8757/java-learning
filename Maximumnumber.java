//Q1. Implement a program to find and display the maximum number out of the given three numbers.
 
import java.util.Scanner;
class Maximumnumber{
public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter first number :");
   int a = sc.nextInt();

    System.out.print("Enter second number :");
    int b = sc.nextInt();

    System.out.print("Enter third number :");
    int c = sc.nextInt();

     if(a>b && a>c){
       System.out.println(a+" is maximum number");
     }
     else if(b>a && b>c){
       System.out.println(b+" is maximum number");
      }
     else{
       System.out.println(c+" is maximum number");
      }
      
   }
}