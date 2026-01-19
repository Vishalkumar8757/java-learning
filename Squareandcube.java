//Q6. Write a program to take from the user (value of n is also given by user) and display their square and Cube

import java.util.Scanner;
class Squareandcube{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number :");
int n = sc.nextInt();
int sq = n*n;
int cube = n*n*n;
System.out.println("Square is :"+sq);
System.out.println("Cube is :"+cube);
  }
} 
