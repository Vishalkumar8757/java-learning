/*Q3. Problem Statement
Implement a program to display the geometric sequence as given below for a given
value n, where n is the number of elements in the sequence.
1, 2, 4, 8, 16, 32, 64, ......, 1024
*/

import java.util.Scanner;
class  Geometicsequence{
public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter  starting number :");
   int n = sc.nextInt();
  
   int a = 1;
   int r = 2;

   for(int i=1; i<=n; i++){
       System.out.print(a+" ");
       a*= r;
      }
   }
}