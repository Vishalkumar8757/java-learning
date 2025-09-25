// 7. Write a Program that accepts and displays your name, address and phone on the screen.

import java.util.Scanner;
class   Display1 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter  name:");
      String n = sc.nextLine();
      
      System.out.print("Enter  address :");
       String a = sc.nextLine();

      System.out.print("Enter phone no :");
      long p = sc.nextLong();

      System.out.println(n);
      System.out.println(a);
      System.out.println(p);

  }
}