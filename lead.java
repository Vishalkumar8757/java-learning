/*write a java program to leading 0from the string
int string =  0000123
*/
import java.util.Scanner;
class lead{
public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter number :");

  String num = sc.next();
  for(int i=0 ;i<num.length(); i++){
    char ch = num.charAt(i);
      if(ch!='0'){
       System.out.print(ch);
       }
  }

  
  }
}

// check if a given string is pangram in java

 