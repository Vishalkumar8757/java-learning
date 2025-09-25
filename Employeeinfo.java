import java.util.Scanner;
class Employeeinfo{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

    System.out.print("Enter name : ");
    String n = sc.next();
  
    System.out.print("Enter salary : ");
    int s = sc.nextInt();

    System.out.print("depertment number : ");
    int d = sc.nextInt();

    System.out.print("Enter job : ");
    String j = sc.next();

    int hra = s*20/100;
    int da =  s*10/100;
    int ta = s*10/100;
 
    int total = (hra+da+ta);

    int gross = (s+total);
   
   System.out.println("name :" +n);
   System.out.println("salary: "+s);
   System.out.println("department name: "+d);
   System.out.println("job : " +j);
   System.out.println( "Hra :" +hra);
   System.out.println("Da : " +da);
   System.out.println("Ta : " +ta);
   System.out.println("Total is :" +total);
   System.out.println("Gross is :" +gross);




  }
}