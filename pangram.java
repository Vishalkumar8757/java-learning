// check if a given string is pangram in java
import java.util.Scanner;
class pangram{
public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter number :");

  String str = sc.next();
  
     int count = 0;
     for(char c='a';c<'z';c++){
      String x = c+" ";
      if(String indexOf(x)>=0){
      count++;
      }
      else{
       break;
       }
     }

    int i = str.indexOf("e");
    if(count ==26){
      System.out.println("this is pangram");
    }
   else{
   System.out.println("this is not pangram");
      } 
  }
}