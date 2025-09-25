/* 9. Write a java program to convert a given integer (in days) to years, months and
days,assumes that all months have 30 days and all years have 365 days.Test Data
:Input no. of days: 2535
Expected Output:
6 Year(s)
11 Month(s)
15 Day(s)
*/
 
import java.util.Scanner;
class Daysinyearormonth{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 
       System.out.print("amount :");
       int a = sc.nextInt();
    
       int y = a/365;

       int rm = a-y*365;
       System.out.println("year: "+y);

    
      int m =rm/30;
       System.out.println("month: "+m);

      rm= rm-m*30;
     System.out.println("day: "+rm);


  }
}
