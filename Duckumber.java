import java.util.Scanner;
 class Duckumber{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any digit :   ");
      int n = sc.nextInt();
       int count= 0;
 
       for(;n!=0;){
          int r = n%10;
         if(r==0){
                count++;
            }
           n=n/10;
         }
         if(count>=1){
          System.out.println("this is duck numbar");
           }
          else{
            System.out.println("this is  not duck numbar");
           }
 }
}