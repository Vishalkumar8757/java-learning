import java.util.Scanner;
class Switch3{
public static void main(String args[]){

     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter any number:");
      int n = sc.nextInt();

      
  
     switch(n%2){
       case 0 : System.out.println("This is even number ");
        break;
       case 1 : System.out.println("This is odd number ");
        break;
        
        }
    }
}