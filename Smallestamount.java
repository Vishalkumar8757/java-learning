//WAP to  convert given amount into smallest possible bank notes
 
import java.util.Scanner;
public class Smallestamount{
public static void main(String args[]){
int a,n,rm;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a amount : ");
 a = sc.nextInt();
 System.out.println("Amount is : "+a);
 n=a/100;
 System.out.println("notes of 100 :"+n);
 rm=a-n*100;
 n=rm/50;
System.out.println("notes of 50 :"+n);
rm=rm-n*50;
n=rm/20;
System.out.println("notes of 20 :"+n);
rm=rm-n*20;
n=rm/10;
System.out.println("notes of 10 :"+n);
rm=rm-n*10;
n=rm/5;
System.out.println("notes of 5 :"+n);
rm=rm-n*5;
n=rm/2;
System.out.println("notes of 2 :"+n);
rm=rm-n*2;
n=rm/1;
System.out.println("notes of 1 :"+n);
System.out.println("remaning amount :"+rm);



  

   }
}