import java.util.Scanner;
class cir1{
float r;


  void acceptData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius :");

    r = sc.nextFloat();
    }

    void showData(){
      System.out.println("Enter radius :"+r);
    }
  
    float getArea(){
      return 3.14f*r*r;
    }
  
   float getcircumference(){
     return 2*3.14f*r;
    }

   public static void main(String args[]){
     cir1 c1 = new cir1();
     c1.acceptData();
     c1.showData();
      System.out.println("area of circle :"+c1.getArea());
      System.out.println("area of circumfrence :"+c1.getcircumference());

   } 
}