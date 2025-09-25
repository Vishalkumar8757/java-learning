import java.util.Scanner;
class Check1{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  System.out.print("Enter number :");
  int n = sc.nextInt();

   String r = n>=0? "positive number": "negative number";
  System.out.println(r);
}
}