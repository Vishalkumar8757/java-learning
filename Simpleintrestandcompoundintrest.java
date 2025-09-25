// 6. Write a Program that accepts principle, rate and time and display simple and compound interest.

import java.util.Scanner;
class  Simpleintrestandcompoundintrest {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
      System.out.print("Enter principle amoumt :");
      double p = sc.nextDouble();
      
      System.out.print("Enter rate of intrest :");
      double r = sc.nextDouble();

      System.out.print("Enter time in month :");
      double t = sc.nextDouble();

      double si = p*r*t/100;
       
    
      System.out.println(si);
  }
}