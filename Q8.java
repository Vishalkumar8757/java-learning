//Q8. Write a java program to check given number is Positive or Negative Using Ternary Operator?

 import java.util.Scanner;
 class Q8{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number : ");
       int a = sc.nextInt();
      
        String t = a>=0? "positive number": "negative number";
        System.out.println(t);


   }
 }