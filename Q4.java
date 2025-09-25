//Q4. Write a program to take two numbers as input and demonstrate the use of (>, <, ==, !=).


import java.util.Scanner;
class Q4{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter first number : ");
   int a = sc.nextInt();

   System.out.print("Enter second number : ");
   int b = sc.nextInt();
  
   System.out.println(a>b);
   System.out.println(a<b);
   System.out.println(a==b);
   System.out.println(a!=b);


  }
}
