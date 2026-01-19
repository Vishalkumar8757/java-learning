 //Q14.  Given the Cost Price(CP) and Selling Price(SP) of a product. The task is to Calculate the Profit or Loss.

import java.util.Scanner;
class Profitloss{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter cost price :");
int cp = sc.nextInt();

System.out.print("Enter selling price :");
int sp = sc.nextInt();

int profit = sp-cp;
int loss = cp-sp;

 if(sp>cp){
  System.out.print("your profit is :");
  System.out.println(sp-cp);
  }

 else{
   System.out.print("your loss is :");
   System.out.println(cp-sp);
  }

  }
}



 

   

