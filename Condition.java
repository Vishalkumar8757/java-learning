import java.util.Scanner;
class Condition{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter age : ");
int a = sc.nextInt();
String v=a>18? "Eligible for voting":"not elegible for vote";
System.out.println(v);
  }
}