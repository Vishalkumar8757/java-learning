// 3. Write a Program that accepts a String by your name anddisplay it on the screen.

import java.util.Scanner;
class Display{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name :");

String n = sc.nextLine();
System.out.println("Welcome :"+n);
  }
}