// Wap to print fctorial of given number using while or dowhile

import java.util.Scanner;
class factorialnumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

   System.out.print("Enter any number :");
   int n = sc.nextInt();

     int fact = 1;
     int i = 1;
   
     while(i<=n){
         fact= fact*i;
        i++;
        }
      System.out.println(fact);
  }
}