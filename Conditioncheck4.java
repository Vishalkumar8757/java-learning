import java.util.Scanner;
class Conditioncheck4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number :");
int a = sc.nextInt();

 System.out.print("Enter number :");
int b = sc.nextInt();

 System.out.print("Enter number :");
int c = sc.nextInt();

  if(a>b && a>c){
   System.out.println(" a is greater ");
   System.out.println("this is if - 1");
  }
  if( b>a && b>c){
  System.out.println(" b is greater ");
  System.out.println("this is if - 2");
  }
  if(c>a && c>b){
   System.out.println(" c  is greater");
   System.out.println("this is if - 3");
  }  
  
  if(a==b && b==c){
   System.out.print(" all are equal ");
   System.out.println("this is if -4");
  }

   }
}