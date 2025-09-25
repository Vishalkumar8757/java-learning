  //Q10. Write a java Program to Calculate Simple and compound Interest?

import java.util.Scanner;
class Siandci{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter principle:");
int p = sc.nextInt();
System.out.print("Enter rate:");
int r = sc.nextInt();
System.out.print("Enter time:");
int t = sc.nextInt();

    int si = (p*t*r)/100;

   System.out.print("Enter amount:");
   int a = sc.nextInt();

       int ci = a-p;
   System.out.println("Simple intrest is :"+si);
   System.out.println("compound intrest is :"+ci);

  }
}