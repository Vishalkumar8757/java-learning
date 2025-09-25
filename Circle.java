import java.util.Scanner;
public class Circle{
public static void main(String args[]){
float r,ar,cr;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a radius : ");
 r = sc.nextFloat();
 ar=3.14F*r*r;
 cr=2*3.14F*r;
 System.out.println("area of circle :"+ar);
 System.out.println("circumference of circle :"+cr);
}
}

