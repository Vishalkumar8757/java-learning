import java.util.Scanner;
class Calculator1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number :");
int n1= sc.nextInt();

System.out.print ("enter second number :");
int n2 = sc.nextInt();

char c = sc.next().charAt(0);

switch(c){
case 'a': System.out.println( "Addition is :"+(n1+n2));
  break;
case 'b': System.out.println( "Subtraction is :"+(n1-n2));
  break;
case 'c': System.out.println( "Multiplied is :"+(n1*n2));
  break;
case 'd': System.out.println( "division is :"+(n1/n2));
  break;
case 'e': System.out.println( "Mudolo is : "+(n1%n2)  );
  break;
default : System.out.println( "invalid");
  break;
}

  }
}