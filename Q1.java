/*Q1.

Write a program to take as input from the user and print:
Enter Your Name: 
Enter Your Age: 21
---------------------------------------------
Output:


Hello Akash, 
You are  21 years old.
*/
import java.util.Scanner;
class Q1{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.print("Enter name : ");
String n = sc.nextLine();
System.out.print("Enter age : ");
int a = sc.nextInt();
System.out.println(n);
System.out.println(a);


  }
}