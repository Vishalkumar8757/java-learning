import java.util.Scanner;
class Ifelse1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a  character :");
char c = sc.next().charAt(0);

  if(c=='a'|| c=='e' || c=='i' || c=='o'|| c=='u'){
   System.out.println(" this is vowel");
  }
  else{
  System.out.println("not vowel");
  }
 }

}