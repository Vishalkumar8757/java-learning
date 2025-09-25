import java.util.Scanner;
class Switch1{
public static void main(String args[]){

     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter length :");
     int l = sc.nextInt();

     System.out.print("Enter breath :");
     int b = sc.nextInt();

     System.out.print("Enter radius :");
     double r = sc.nextDouble();

     int n = sc.nextInt();
  
     switch(n){
       case 1 : System.out.println("Area of rectangle is :"+(l*b));
        break;
       case 2 : System.out.println("perimeter of rectangle is :"+(2*(l+b)));
        break;
       case 3 : System.out.println("Area of circle is :"+(3.14*r*r));
        break;
       case 4 :System.out.println("Circumfrence of circle is :"+(2*3.14*r));
        break;
       default: System.out.println("Invalid");
     }
  }
}