//Q5.Write a program to demonstrate (++, --). Show the difference between and .
  
 import java.util.Scanner;
 class Q5{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number :");
    int n = sc.nextInt();
    
    System.out.println("pre Increment : " +(++n));
    System.out.println("pre Decrement : " +(--n));
    System.out.println("post Increment : " +(n++));
    System.out.println("post Decrement : " +(n--));

  }
}