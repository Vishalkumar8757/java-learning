/*Q2. Write a program to take as input and display their:

Addition
Subtraction
Multiplication
Division

Enter number 1 : 60
Enter Number 2 : 15

Output:
 Addition : 75
Subtraction: 45
Multiplication: 900
Division: 4
*/

import java.util.Scanner;
class Q2{
      public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first number : ");
           int a = sc.nextInt();
         System.out.print("Enter second number : ");
           int b = sc.nextInt();
    
           int add = a+b;
           System.out.println("Addition : "+add);

           int sub = a-b;
           System.out.println("Subtraction : "+sub);

           int mul = a*b;
           System.out.println("Multiplication : "+mul);

           int div = a/b;
           System.out.println("Division :"+div);

  }
}