import java.util.Scanner;
class Elseif{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter character:");
char c = sc.next().charAt(0);
 
 if(c>='A' && c<='Z'){
   System.out.println("Upper case");
  }
else if(c>='a' && c<='z'){
  System.out.println("lower case");
 }
else if(c>='0' && c<='9'){
 System.out.println("digit");
 }
else{
 System.out.println(" special charater");
 }




  }
}

