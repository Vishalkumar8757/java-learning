// WAp to perfect number

import java.util.Scanner;
class Perfectnumber.{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=n){
            if(i%n==0){
              sum=+i;
            }
           i++;
         }
         if(sum==n){
         System.out.println("This number is perfect :");
        }
       else{
         System.out.println("This number is not perfect :");
        }


  }
}