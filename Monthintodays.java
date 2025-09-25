import java.util.Scanner;
class Monthintodays{
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