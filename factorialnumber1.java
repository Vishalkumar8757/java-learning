// Wap to print fctorial of given number  

import java.util.Scanner;
class factorialnumber1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

   System.out.print("Enter any number :");
   int n = sc.nextInt();

     int fact = 1;
   
   for(int i=1 ; i<=n; i++){
         fact=fact*i;
        }
      System.out.println(fact);

   }
}
