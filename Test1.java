interface IA{
       void a();
}
interface IB{
       void b();
}
interface IC extends IA,IB{
       void c();
}
class Test1 implements IC{
          public void a(){
            System.out.println("This is IA interface method");
          }
           public void b(){
            System.out.println("This is IB interface method");
          }
           public void c(){
            System.out.println("This is IC interface method");
          }
           public void hello(){
            System.out.println("This is test  class owm  method");
          }

   public static void main(String args[]){
   IC obj = new Test1();
   obj.a();
   obj.b();
   obj.c();

   Test1 t = new Test1();
   t.a();
   t.b();
   t.c();
   t.hello();

   }


}