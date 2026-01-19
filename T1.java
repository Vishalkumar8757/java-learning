class T1{
  int a;
  static int count;
  static{
    count = 0;
    System.out.println("This is static block 1");
    }

    public T1(){
    System.out.println("Default contructor");
     count++; 
    }
  
    public T1(int a){
      this.a=a;
      System.out.println("parameterized contructor");
      count++;
     }
   
    public void show(){
     System.out.println("number of created :"+count);
     }

  public static int getCount(){
   return count;
   }

public static void main(String args[]){
 System.out.println("main method is executed");
 T1 obj1 = new T1();
 T1 obj2 = new T1();
 T1 obj3 = new T1(10);

 obj1.show();
 obj2.show();
 obj3.show();

  System.out.println("number of object"+getCount());
  System.out.println(""+ T1.getCount());
  System.out.println(""+obj1.getCount());

   }
 }