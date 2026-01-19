class InvalidAgeException extends Exception{
private String msg;
public InvalidAgeException(String msg){
this.msg = msg;
  }
public String getMsg(){
 return msg;
  }
}
class E2{
      public static void main(String args[]){
       int age = 0;

       try{
         age  = Integer.parseInt(args[0]);
         if(age<18){
            InvalidAgeException x = new InvalidAgeException("Invalid age");
            throw x;
               }
          }
        System.out.println("you are eligible for voiting");
     }
      catch(InvalidAgeException aae){
       Sytem.out.println(aae.getMsg());
       }
      catch(NumberFormatException ne){
       System.out.println("only number are allowed");
      }
     catch(ArrayIndexOutBoundException ae){
      System.out.println("please insert at least one value");
      }
  }
}