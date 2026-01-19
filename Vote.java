// Q15.  Voting Age Program
import java.util.Scanner;
class Vote{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter age :");
int age  = sc.nextInt();

 if(age>=18){
    System.out.println("You are eligible for vote ");
    }
 else{
     System.out.println("You are  not eligible for vote ");
    }
  }
}