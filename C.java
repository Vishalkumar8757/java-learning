// 4. Write a Program that accepts a float variable by radius anddisplay the area and circumference.
import java.util.Scanner;
class C {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius :");
float r = sc.nextFloat();
 
float ar = 3.14f*r*r;
float cr = 2*3.14f*r;

 System.out.println(ar);
 System.out.println(cr);

   }
}