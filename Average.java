/*Q13. Write a program to calculate average and Percentage of the Students
Enter marks out of 100
Enter marks of math=45
Enter marks of English=68
Enter marks of science=78
Enter marks of art=48
Enter marks of computer=78
Total marks out of 500=317
Percent of marks=63*/

import java.util.Scanner;
class Average{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);

     System.out.print("Enter math mark : ");
     int m = sc.nextInt();

      System.out.print("Enter english mark : ");
      int e = sc.nextInt();


       System.out.print("Enter science mark : ");
       int s = sc.nextInt();


       System.out.print("Enter arts mark : ");
       int a = sc.nextInt();


        System.out.print("Enter computer mark : ");
        int c = sc.nextInt();

          int totalmark = m+e+s+a+c;

          int percent = (totalmark*100)/(5*100);

          System.out.println("percentage :"+percent);
  }
 }
