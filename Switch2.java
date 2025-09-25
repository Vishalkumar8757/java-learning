import java.util.Scanner;
class Switch2{
    public static void main(String args[]){
   
    int choice;
    int l,b;
    double r;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Choice:");
    
    System.out.println("Press 1 For Area of rectangle");
    System.out.println("Press 2 For  perimeter of rectangle");
    System.out.println("Press 3 For  area of circle");
    System.out.println("Press 4 For  circumference of circle");
     
    choice = sc.nextInt();
   
     if(choice==1 || choice==2){
       System.out.println("Enter length:");
        l = sc.nextInt();

      System.out.println("Enter breath : ");
        b = sc.nextInt();
     }
     else if(choice==3 || choice==4){
       System.out.println("Enter radius:");
       r = sc.nextDouble();
     }
     else{
       System.out.println("invalid");
      }
    switch(choice){
    case 1:
        System.out.println(" Area of rectangle"+(l*b));
        break;
    case 2: System.out.println("perimeter of rectangle"+(2*(l+b)));
        break;
    case 3: System.out.println("Area of circle"+(3.14*r*r));
        break;
    case 4: System.out.println("circumfrence of circle"+(2*3.14*r));
        break;
    default: System.out.println("Invalid");
    }
  }
}   



