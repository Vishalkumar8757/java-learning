 import java.util.Scanner;
 class Productofdigit{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any digit : ");
      int n = sc.nextInt();
         int product = 1;
        while(n!=0){
        int lastdigit = n%10 ;
         if(lastdigit==0){
            lastdigit=+1;
           }  
         product = product *lastdigit;
         n=n/10;
      }
     System.out.println(product);
 }
}