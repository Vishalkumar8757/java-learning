import java.util.Scanner;
class Condition5{
public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
     
       System.out.print("Enter first number :");
       int a = sc.nextInt();

       System.out.print("Enter second number :");
       int b = sc.nextInt();

       System.out.print("Enter third number :");
       int c = sc.nextInt();

       System.out.print("Enter forth number :");
       int d = sc.nextInt();

            if(a>b && a>c && a>d){
              System.out.println(a+ " A is greater");
            }
            
            if(b>a && b>c && b>d){
              System.out.println(b+ " B is greater");
            }

            if(c>a && c>b && c>d){
              System.out.println(c+ " C is greater");
            }

            if(d>a && d>b && d>c){
             System.out.println(d+ " D is greater");
            }
  }
}