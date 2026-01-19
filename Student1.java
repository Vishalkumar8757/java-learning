class Student1{
public String name;
public Student1(){
System.out.println("This is default constuuctor");
  }
public Student1(String name){
this();
this.name = name ;
System.out.println("TRhis is parameterize");
  }
public void show(){
System.out.println("Name:"+name);
  }
public void display(){
show();
}
public static void main(String args[]){
Student1 s = new Student1("Vishal");
s.display();
}

}