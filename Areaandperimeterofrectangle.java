// 5. Write a Program that accepts width and height of a Rectangle and display its area and perimeter

import java.util.Scanner;
class Areaandperimeterofrectangle {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter  length :");
      int l = sc.nextInt();

       System.out.print("Enter  width :");
       int b = sc.nextInt();
 
      int ar = l*b;
      int per = 2*(l+b);

      System.out.println(ar);
      System.out.println(per);


  }
}