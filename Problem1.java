/*Q5. Problem Statement
Implement a program to calculate the product of three positive integer
values. However, if one of the integers is 7, consider only the values to the
right of 7 for calculation. If 7 is the last integer, then display -1.
Note: Only one of the three values can be 7.
*/

import java.util.Scanner;
class Problem1{
public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter  first number :");
   int a = sc.nextInt();

   System.out.print("Enter  second number :");
   int b = sc.nextInt();
 
   System.out.print("Enter Third number :");
   int c = sc.nextInt();
 
   if(a==7){
     System.out.println(b*c);
    }
   else if(b==7){
     System.out.println(c);
   }
   else if(c==7){
     System.out.println("-1");
    }
  else{
    System.out.println(a*b*c);
    }

    
  }
}