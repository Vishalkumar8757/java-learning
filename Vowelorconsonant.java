// Q10. Program to Check Whether the Character is Vowel or Consonant

import java.util.Scanner;
class Vowelorconsonant{
public static void main(String args[]){
Scanner sc  = new Scanner(System.in);
System.out.print("Enter any char :");
char c = sc.next().charAt(0);

  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
    System.out.println("Vowel");
    }
    else{
     System.out.println(" Not Vowel");
    }
  }
}