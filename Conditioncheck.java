import java.util.Scanner; 
class  Conditioncheck{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter first number :");
   int a = sc.nextInt();
  System.out.print("Enter second number :");
   int b = sc.nextInt();
   

     if(a>=b)
     System.out.println("A is greater");
     System.out.println("this is if 1");

     if(a<=b)
      System.out.println("b is greater");
      System.out.println("this is if 2");

     if(a==b)
      System.out.println("a  and b are equal");
      System.out.println("this is if 3");

    

  }
}