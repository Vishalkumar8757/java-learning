class Exit{
public static void abc(int x){
System.out.println("ENter abc");
  if(x==10){
    System.exit(0);
    } 

    System.out.println("Exit abc"); 
}
public static void main(String args[]){
  System.out.println("Enter main");
  abc(10);
System.out.println("Exit main");
}
}