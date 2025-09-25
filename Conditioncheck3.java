import java.util.Scanner;
class Conditioncheck3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number :");
int n = sc.nextInt();
  if(n%2==0){
   System.out.println("number is  even number ");
   System.out.println("this is if - 1");
  }
  if(n%2==1){
  System.out.println("number is   odd number ");
  System.out.println("this is if - 2");
  }
  if(n==0){
   System.out.println("number is zero ");
   System.out.println("this is if - 3");
  } 

   }
}