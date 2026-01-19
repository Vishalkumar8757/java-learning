/*
A
BC
DEF
GHIJ
KLMNO
*/

class Pattern6{
public static void main(String args[]){
         int n= 64;
         int x= 1;
     for(int r=1; r<=5; r++){
       for(int c=1; c<=r; c++){
          System.out.print((char)(n+x));
            x++; 
         }
     System.out.println();
   }

  }
}