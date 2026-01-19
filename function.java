/*
import java.util.Scanner;
class function{

   public void add() {
      System.out.println("function is called");
         Scanner sc = new Scanner(System.in);
           System.out.println("Enter first number :");
                 int n1 = sc.nextInt();
           System.out.println("Enter second number :");
                 int n2 = sc.nextInt();
           
           int n3 = n1+n2;
           System.out.println("sum is :"+n3);

   }

public static void main(String args[]){
  function f = new function();
  f.add();
  }
}
*/
// actual argument
class function{
 
   void add(int a ,int b){
     int c = a+b;
      System.out.println("sum is :"+c);
   }

    public static void main(String args[]){
         function obj = new function();
         obj.add(45,5);
  
    }
}