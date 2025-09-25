/*Q10. Write a java Program to take Radius from the user and calculate area and Circumference of Circle?
Enter Radius : 2.0
Area of  Circle:  12.56
Circumference of Circle: 12.56
*/

 import java.util.Scanner;
 class Q10{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter radius :");
   double r = sc.nextDouble();
  
   double ar = 3.14*r*r;
   double cr =2*3.14*r;

   System.out.println(ar);
   System.out.println(cr);
   }
 }