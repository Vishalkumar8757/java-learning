//Q6.Write a program to take two numbers and demonstrate (&, |, ^, ~, <<, >>).

import java.util.Scanner;
class Q6{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a first number :");
  int a = sc.nextInt();//2
 
 System.out.print("Enter a second number :");
  int b = sc.nextInt();//3

  int c = a&b; //2
  int d = a|b; //3
  int e =a^b;  //1
  int f = ~a;  //1
  int g = ~b;  //0
  int h = a>>2; //0
  int i = b>>2; //0
  int j = a<<1; //6
  int k = b<<1; //4

  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
  System.out.println(f);
  System.out.println(g);
  System.out.println(h);
  System.out.println(i);
  System.out.println(j);
  System.out.println(k);


  
  }
}