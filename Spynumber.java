/* Q6. A spy number is a number where the sum of its digits equals the product of its digits. For example, 1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
*/

import java.util.Scanner;
 class Spynumber{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any digit :   ");
      int n = sc.nextInt();
         int sum = 0;
          int product = 1;
        while(n!=0){
        int lastdigit = n%10 ;
         sum = sum +lastdigit;
         product = product*lastdigit;
         n=n/10;
          
      }
      if(sum==product){
         System.out.println("Spy number");
      }
      else{
         System.out.println(" Not Spy number");
       }
   } 
}