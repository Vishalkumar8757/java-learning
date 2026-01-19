 import java.util.Scanner;
 class Sumofdigit{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any digit :   ");
      int n = sc.nextInt();
         int sum = 0;
         int count = 0;
        while(n!=0){
        int lastdigit = n%10 ;
         sum = sum +lastdigit;
         n=n/10;
         count++;
      }
     System.out.println(sum);
 }
}