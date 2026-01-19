// write a java program to print reverse of given number

 import java.util.Scanner;
class  Revsenumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
         int reverse = 0;
         while(n!=0){
             int lastdigit = n%10;
             reverse = reverse*10+lastdigit;
             n=n/10;
         }
         System.out.println(reverse);
    }
}