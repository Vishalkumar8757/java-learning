/* Q12. Menu Based Program in
1- Area of Right Triangle
2- Area of Equilateral Triangle
3- Area of Square
4- Area of Rectangle
5- Area of Circle
*/
import java.util.Scanner;
class Switchquestion{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

 System.out.print("Enter base :");
 double base = sc.nextDouble();

 System.out.print("Enter height :");
 double height = sc.nextDouble();

 System.out.print("Enter side :");
 double side  = sc.nextDouble();

 System.out.print("Enter length:");
 double length  = sc.nextDouble();

 System.out.print("Enter breadth :");
 double breadth  = sc.nextDouble();

 System.out.print("Enter radius :");
 double radius  = sc.nextDouble();

 System.out.print("Enter case :");
  int c = sc.nextInt();
 
 switch(c){
   case 1 :System.out.println("Area of right triangle :"+(base*height*1/2));
   break;

   case 2 : System.out.println("Area of  square :"+ side*side);
   break;

   case 3 : System.out.println("Area of  rectangle :"+ length*breadth);
   break;
   
   case 4 : System.out.println("Area of circle:"+ 3.14*radius*radius);
   break;
   }

  }
}