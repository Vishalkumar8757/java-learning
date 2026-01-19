import java.util.Scanner;
class Primenumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :");
        int n = sc.nextInt();
    
        int count = 0;
        int i = 1;
        while(i<=n){
          if(n%i==0){
           count++;  
            }
           i++;
         }
       if(count==2){
         System.out.println("This number is prime :");
        }
       else{
         System.out.println("This number is not prime :");
        }

  }
}