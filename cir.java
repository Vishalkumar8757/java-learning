import java.util.Scanner;
class cir{
int r;


  void acceptData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius :");

    r = sc.nextInt();
    }

    void showData(){
      System.out.println("Enter radius :"+r);
    }
  
    void getArea(){
     System.out.println("Area is : "+ (r*r));
    }
  
   void getcircumference(){
     System.out.println("circumfrence is : "+(2*3.14*r));
    }

   public static void main(String args[]){
     cir c1 = new cir();
     c1.acceptData();
     c1.showData();
     c1.getArea();
     c1.getcircumference();
   } 
}