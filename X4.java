// WAP a java program delete first and last digit of given number 

import java.util.Scanner;
class X4{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter a  number :");
   int n = sc.nextInt();
   int m = n/10%10;
   int o = n/100%10;
    String r = o+""+m;
    System.out.println(r);
 }
}