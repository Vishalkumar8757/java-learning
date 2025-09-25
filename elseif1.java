import java.util.Scanner;
class   {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter any number :");
int n = sc.nextInt();

   if(n>=0 && n<=9){
     System.out.println("Single digit");
    }
  else if(n>=10 && n<=99){
     System.out.println("double digit");
    }
  else if(n>=100 && n<=999){
   System.out.println("triple digit");
   }
 else if(n>=999){
  System.out.println("more than three digit");
  }
else{
  System.out.println("negative number")
   }
  }
}
