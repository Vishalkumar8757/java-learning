class Swapping{
   public static void main(String args[]){
   int a,b;
   a=7;
   b=5;
   System.out.println("before swapping ");
   System.out.println("A : "+a+" B "+b);
   
   a=a+b;
   b=a-b;
   a=a-b;
   
   System.out.println("after swapping ");
   System.out.println("A : "+a+" B "+b);
  }

}
// a=a*b;
// b=a/b;
 //a=a/b;