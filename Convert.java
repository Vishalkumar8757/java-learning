/* 8 . Write a Java program to convert a given integer (in seconds) to hours, minutes
andseconds.
Test Data :
Input seconds:
25300Expected
Output:
There are:
H:M:S - 7:1:40
*/

import java.util.Scanner;
class Convert{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter Seconds :");
      int a = sc.nextInt();

      int h = a/3600;

      int rm = a-h*3600;
      System.out.println("Hour :"+h);

      int m = rm/60;
      System.out.println(" Minute :"+m);

      rm= rm-m*60;
      System.out.println(" Second :"+rm);
      
  }
}
 