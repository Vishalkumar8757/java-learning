class Test{
      public void add(){
            int a,b,c;
            a = 10;
            b = 20;
            c = a+b;
           System.out.println("addition is :"+c);
       }
       
      public void add(int a ,int b){
           int c;
           c= a+b; 
           System.out.println("addition is :"+c);
      }
   
       public void add(float a ,float b){
           float c;
           c= a+b; 
           System.out.println("addition is :"+c);
      }

       public void add(int a ,float b){
           float c;
           c= a+b; 
           System.out.println("addition is :"+c);
      }

      public void add(float a ,int b){
           float c;
           c= a+b; 
           System.out.println("addition is :"+c);
      }
    
     public static void main(String args[]){
      Test o = new Test();
      o.add();
      o.add(10,20);
      o.add(1.0,2.0);
      }
}