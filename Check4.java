import java.util.Scanner;
class Check4{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter first number :");
  int a = sc.nextInt();

  System.out.print("Enter second number :");
  int b = sc.nextInt();

  System.out.print("Enter third number :");
  int c = sc.nextInt();

//int r = (a>b)? ((a>c)?a:c):((b>c)?b:c);  

   if(a>b && a>c){
     System.out.println(a+ " is greatest number ");
   }
   else if(b>a && b>c){
     System.out.println(b+ " is greatest number ");
   }
   else{
      System.out.println(c+ " is greatest number ");
   }
 }
}  