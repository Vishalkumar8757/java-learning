class Pattern17{
public static void main(String args[]){
          
          
     for(int r=1; r<=5; r++){
         for( int c=5; c>r; c--){
          System.out.print(" ");
          }
       for(int c=1; c<=2*r-1; c++){
          System.out.print("*");  
         }
     System.out.println();
   }  
for(int r=4; r>=1; r--){
         for( int c=5; c>r; c--){
          System.out.print(" ");
          }
       for(int c=1; c<=2*r-1; c++){
          System.out.print("*");  
         }
     System.out.println();
   }

  }
}