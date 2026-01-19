
import java.util.Scanner;
class student{
  String name;
  String enroll;
  char section;
  int p, c, m, h, e;

void getData(){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter name :");
   name = sc.nextLine();
  
  System.out.print("Enter enroll :");
   enroll = sc.nextLine();

  System.out.print("Enter section :");
   section = sc.next().charAt(0);

  System.out.print("Enter p mark :");
   p = sc.nextInt();

 System.out.print("Enter c mark :");
   c = sc.nextInt();

 System.out.print("Enter m mark :");
   m = sc.nextInt();

 System.out.print("Enter h mark :");
   h = sc.nextInt();

 System.out.print("Enter e mark :");
   e = sc.nextInt();
  }
  
void showData(){
System.out.println("Student name is :"+name);
System.out.println("Student enroll is :"+enroll);
System.out.println("Student section is :"+section);
System.out.println("Student p mark is :"+p);
System.out.println("Student c mark is :"+c);
System.out.println("Student m mark is :"+m);
System.out.println("Student h mark is :"+h);
System.out.println("Student e mark is :"+e);

}
   int getTotalmark(){
   return p+c+m+h+e ;
  }
    float getPer(int t){
    return t/5.0f;
  }
public static void main(String args[]){
student s = new student();
s.getData();
s.showData();
int t = s.getTotalmark();
float pr = s.getPer(t);
System.out.println("Student mark :"+t);
System.out.println("Student percentage :"+pr);


  }

}

 