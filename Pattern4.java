/*
A
BB
CCC
DDDD
EEEEE
*/


class Pattern4{
public static void main(String args[]){
         int n= 64;
     for(int r=1; r<=5; r++){
       for(int c=1; c<=r; c++){
          System.out.print((char)(n+r));
         }
     System.out.println();
   }

  }
}