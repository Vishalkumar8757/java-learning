import java.util.Scanner;
class Check2{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter number :");
  int n = sc.nextInt();

   String r = n%2==0? "even number": "odd number";
  System.out.println(r);
}
}  