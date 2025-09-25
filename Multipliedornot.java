/*Q11.Write a Java program that reads two integers and checks whether they are multipliedor not.
Test Data :
Input the first number: 5
Input the second number: 15
Expected
*/

 import java.util.Scanner;
class    Multipliedornot {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number:");
      int a = sc.nextInt();
      
      System.out.print("Enter second number :");
       int b = sc.nextInt();

       if(a%b==0){
         System.out.println("mlutiplied");
       }
       else{ 
       System.out.println(" Not mlutiplied"); 
       }
  }
}