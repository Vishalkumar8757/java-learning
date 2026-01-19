class Person{
public Person(){
   System.out.println("person class default contructor is called");
  } 
public void talk(){
   System.out.println("person can talk");
  }
public void walk(){
 System.out.println("person can walk");
  }
}
class Teacher extends Person{
public Teacher(){
   System.out.println("teacher class default contructor is called");
  } 
public void teach(){
   System.out.println("teacher can teach");
  }
}
class Professor extends Teacher{
public Professor(){
   System.out.println("professor class default contructor is called");
  } 
public void research(){
   System.out.println("professor does research");
  }
public static void main(String args[]){
Professor p = new Professor();
p.talk();//from person
p.walk();// from person
p.teach();// from teacher
p.research();//from professor
}

}