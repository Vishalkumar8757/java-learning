/*Q16. Salary Program
Basic Salary: The foundational amount. 
HRA (House Rent Allowance): Typically a percentage of the basic salary. 
DA (Dearness Allowance): Again, usually a percentage of the basic. 
Tax Deduction: A certain percentage deducted from the gross salary (Basic + HRA + DA). 
*/
 
import java.util.Scanner;
class Employeesalary{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

     
  
    System.out.print("Enter salary : ");
    int s = sc.nextInt();

    int hra = s*10/100;
    int da =  s*5/100;
    int pf = s*12/100;
 
    int total = (hra+da+pf);

    int gross = (s+total);
   
    
   System.out.println("salary: "+s);
   System.out.println( "Hra :" +hra);
   System.out.println("Da : " +da);
   System.out.println("Pf : " +pf);
   System.out.println("Total is :" +total);
   System.out.println("Gross is :" +gross);

  }
}