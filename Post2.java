class Post2{
public static void main(String args[]){
int a,b,c,d,e,f,g;
     a=10;
     b=20;
     c=30;
     d=40;
     e=50;
     f=60;
     g=a++ + ++b - ++c + d++ * ++e + f--;
    //10 + 21 - 31 + 40 * 51 + 60
    //10 + 21 - 31 + 2040 + 60=2100
    System.out.println("A : "+a);//11
    System.out.println("B : "+b);//21
    System.out.println("C : "+c);//31
    System.out.println("D : "+d);//41
    System.out.println("E : "+e);//51
    System.out.println("F : "+f);//59
    System.out.println("G : "+g);//2100

  }
}