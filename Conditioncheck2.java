import java.util.Scanner;
class Conditioncheck2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number :");
int n = sc.nextInt();
  if(n>0){
   System.out.println("number is positive number ");
   System.out.println("this is if - 1");
  }
  if(n<0){
  System.out.println("number is  negative number ");
  System.out.println("this is if - 2");
  }
  if(n==0){
   System.out.println("number is equal ");
   System.out.println("this is if - 3");
  } 

   }
}