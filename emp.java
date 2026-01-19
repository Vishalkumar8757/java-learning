import java.util.Scanner;
class emp{
int empno ;
String empname;
float sal;
String job;
int departno;
String hiredate;

void getData(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter empno :");
empno = sc.nextInt();

System.out.print("Enter sal :");
sal = sc.nextFloat();

 

System.out.print("Enter departno :");
departno = sc.nextInt();


System.out.print("Enter hiredate :");
hiredate = sc.nextLine();

System.out.print("Enter job :");
job = sc.nextLine();

}

void showData(){
System.out.println("empno is :"+empno);
System.out.println("empsal is :"+sal);
System.out.println("empjob is :"+job);
System.out.println("empdepartno is :"+departno);
System.out.println("emp hiredate is :"+hiredate);

}

float getHRA(){
return sal*20/100;
}

float getDA(){
return sal*10/100;
}
 
float getTA(){
return sal*10/100;
}

float getALLIncentive(){
return getHRA()+getDA()+getTA();
}
float getGrossSalary(){
return getALLIncentive()+sal;
}

public static void main(String args[]){
emp e = new emp();

e.getData();
e.showData();
System.out.println(+e.getHRA());
System.out.println(e.getDA());
System.out.println(e.getTA());
System.out.println(e.getGrossSalary());
System.out.println(e.getALLIncentive());

 
}

}