// 2. Write a Program that accepts 2 numbers and display theirsum, product, difference,and quotient of the two numbers

import java.util.Scanner;
class SODQ{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number :");
     int a = sc.nextInt();

    System.out.print("Enter second number :");
     int b = sc.nextInt();

    int sum = a+b;
    int pro = a*b;
    int diff = a-b;
    int quo = a/b;

    System.out.println(sum); 
    System.out.println(pro); 
    System.out.println(diff); 
    System.out.println(quo); 

  }
}