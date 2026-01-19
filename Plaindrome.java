// write a java program to check given number id palindrome or not

import java.util.Scanner;
class   Plaindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
         int reverse = 0;
          int m = n;
         while(n!=0){
             int lastdigit = n%10;
             reverse = reverse*10+lastdigit;
             n=n/10;
         }
          if(m==reverse){
         System.out.println( "This is plaindreom ");
         }
         else{
          System.out.println( "This is not plaindreom ");
         }
    }
}