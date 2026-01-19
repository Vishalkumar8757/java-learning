/*Q4. Problem Statement
Implement a program to display the sum of two given numbers if the
numbers are same. If the numbers are not same, display the double of the
sum.
*/

import java.util.Scanner;
class Problem{
public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter  first number :");
   int a = sc.nextInt();

   System.out.print("Enter  second number :");
   int b = sc.nextInt();
  
   if(a==b){
     System.out.println(a+b);
    }
   else{
      System.out.println((a+b)*2);
    }

   }
}