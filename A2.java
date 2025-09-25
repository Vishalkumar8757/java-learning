// write a java program to calculate area and parameter of a rectangle
import java.util.Scanner;
public class A2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length : ");
int l = sc.nextInt();
System.out.println("Enter breath : ");
int b = sc.nextInt(); 
int ar = l*b;
int parameter = 2*(l+b);
System.out.println("Area : "+ar);
System.out.println("parameter : "+parameter);
  }
}

