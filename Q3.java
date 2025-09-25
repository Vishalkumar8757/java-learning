/*Q3. Write a program to take marks of as input and calculate the . if average marks is less than 40 then print Fail otherwise print Pass. (Assume pass mark = 40).
*/

import java.util.Scanner;
class Q3{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter marks :");
  int m = sc.nextInt();
 
  String w = m>40?"pass":"fail";
  System.out.println(w); 
  }
}