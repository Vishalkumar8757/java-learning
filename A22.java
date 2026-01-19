class A1{
   public A1(){
      System.out.println("A1 default");
   }
  public void a(){
      System.out.println("ts is parent class A1 method");
  }
}

class A22 extends A1{
   public void a1(){
      System.out.println("ts is child class A2 method");
   }
  public A22(){
      System.out.println(" A22 default");
  }

public static void main(String args[]){
  A1 obj = new A1();
  obj.a();
  }
}