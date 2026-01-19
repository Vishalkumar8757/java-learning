// Q1. Write a java program to print number from -5 to 5
 
import java.util.Scanner;
class Negativetopositive {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number");
int a = sc.nextInt();
    int n = -5;
       while(n<=a){
          
          System.out.println(n);
         
          n++;
        }
   }
}