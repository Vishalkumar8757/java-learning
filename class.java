import java.util.Scanner;
class Rec{
int l;
int b;

  void acceptData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length :");

    l = sc.nextInt();

    System.out.println("Enter bredth :");

    b = sc.nextInt();

    }

    void showData(){
      System.out.println("Enter length :"+l);
      System.out.println("Enter bredth :"+b);
  
    }
  
    void getArea(){
     System.out.println("Area is"+ (l*b));
    }
  
   void getPara(){
     System.out.println("paramet is"+2*(l+b));
    }

   public static void main(String args[]){
     Rec r1 = new Rec();
     r1.accepData();
     r1.showData();
     r1.getArea();
     r1.getPara();
   }

   
}