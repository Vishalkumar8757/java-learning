class Error{
      public static void main(String args[]){
      int a,b,c=0;
      System.out.println("after");
      a=10;
      b=0;
      System.out.println("before");
     try{
      c= a/b;
     System.out.println("inside try");
        }catch(ArithmeticException ae){
     System.out.println("Denominitor should not be zero");
          //ae.printStackTrace();
        }
      System.out.println("result"+c);

     }
} 