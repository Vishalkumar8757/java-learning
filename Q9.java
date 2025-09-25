//Q9. Write a java Program to check given Number is Even or Odd Using Ternary Operator?

import java.util.Scanner;
class Q9{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter number :");
   int a = sc.nextInt();
    
    String b = a%2==0? "even number": "odd number";
      System.out.println(b);

  }

}