import java.util.Scanner;
class Check5{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter first number :");
  int a = sc.nextInt();

   

    String r = (a>0)? "positive number" :a==0?"number is zero":"negative number"; 
   System.out.println(r);
    
 }
}  