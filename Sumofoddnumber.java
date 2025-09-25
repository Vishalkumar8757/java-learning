/*Q10. Write a java program that read 5 numbers and sum of all odd values between them
Test Data :
Input the first number:
11Input the second number:
17Input the third number:
13Input the fourth number:
12Input the fifth number:
5Expected Output:
Sum of all odd values: 46
*/
import java.util.Scanner;
class  Sumofoddnumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter first numbar :");
      int a = sc.nextInt();

      System.out.print("Enter Second number :");
      int b = sc.nextInt();


      System.out.print("Enter  third number :");
      int c = sc.nextInt();


      System.out.print("Enter  forth number :");
      int d = sc.nextInt();


      System.out.print("Enter  fifth number :");
      int e = sc.nextInt();
 
      int sum = a+b+c+d+e;
     
      System.out.println("sum of all odd number is :"+sum);
   }
}

