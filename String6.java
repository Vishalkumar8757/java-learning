/*
class String6{
public static void main(String args[]){
  StringBuffer sc = new StringBuffer("i like java");
  System.out.println(sc);
  sc.replace(7,11,"python");
  System.out.println(sc);
  }
}


class String6{
public static void main(String args[]){
  StringBuffer sc = new StringBuffer("hello java world");
  System.out.println(sc);
  sc.delete(5,10);
  System.out.println(sc);
  }
}


class String6{
public static void main(String args[]){
  StringBuffer sc = new StringBuffer("hello java world");
  System.out.println(sc);
  sc.deleteCharAt(5);
  System.out.println(sc);
  }
}


class String6{
public static void main(String args[]){
  StringBuffer sc = new StringBuffer("hello java world");
  System.out.println(sc);
  sc.reverse();
  System.out.println(sc);
  }
}


class String6{
public static void main(String args[]){
  StringBuffer sc = new StringBuffer("abcabcabc");
  System.out.println(sc);
   for(int i=0; i<sc.length();i++){
    char c = sc.charAt(i);
       if(c=='a'){
          sc.setCharAt(i,'x');
        }
   }
  System.out.println(sc);
  }
}
*/
class String6{
public static void main(String args[]){
  StringBuilder sc = new StringBuilder("abcabcabc");
  System.out.println(sc);
   for(int i=0; i<sc.length();i++){
    char c = sc.charAt(i);
       if(c=='a'){
          sc.setCharAt(i,'x');
        }
   }
  System.out.println(sc);
  }
}









