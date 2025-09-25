import java.util.Scanner;
class elseif2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter math marks: ");
int m = sc.nextInt();

System.out.print("Enter chemistry marks: ");
int c = sc.nextInt();


System.out.print("Enter  physics marks: ");
int p = sc.nextInt();


System.out.print("Enter  english marks: ");
int e = sc.nextInt();


System.out.print("Enter hindi marks: ");
int h = sc.nextInt();


    if(m>=90 && m<=100){
       System.out.println("A+");
    }
   else if(m>=80 && m<=90){
       System.out.println("A");
    } 
   else if(m>=70 && m<=80){
       System.out.println("b+");
   }
   else if(m>=60 && m<=70){
       System.out.println("b");
   }
  else if(m>=50 && m<=60){
       System.out.println("c+");
   }
  else if(m>=40 && m<=50){
     System.out.println("c");
   }
  else if(m<=40){
     System.out.println("f");
   }

    

  if(p>=90 && p<=100){
       System.out.println("A+");
    }
   else if(p>=80 && p<=90){
       System.out.println("A");
    } 
   else if(p>=70 && p<=80){
       System.out.println("b+");
   }
   else if(p>=60 && p<=70){
       System.out.println("b");
   }
  else if(p>=50 && p<=60){
       System.out.println("c+");
   }
  else if(p>=40 && p<=50){
     System.out.println("c");
   }
  else if(p<=40){
     System.out.println("f");
   }


   
  if(c>=90 && c<=100){
       System.out.println("A+");
    }
   else if(c>=80 && c<=90){
       System.out.println("A");
    } 
   else if(c>=70 && c<=80){
       System.out.println("b+");
   }
   else if(c>=60 && c<=70){
       System.out.println("b");
   }
  else if(c>=50 && c<=60){
       System.out.println("c+");
   }
  else if(c>=40 && c<=50){
     System.out.println("c");
   }
  else if(c<=40){
     System.out.println("f");
   }



  if(e>=90 && e<=100){
       System.out.println("A+");
    }
   else if(e>=80 && e<=90){
       System.out.println("A");
    } 
   else if(e>=70 && e<=80){
       System.out.println("b+");
   }
   else if(e>=60 && e<=70){
       System.out.println("b");
   }
  else if(e>=50 && e<=60){
       System.out.println("c+");
   }
  else if(e>=40 && e<=50){
     System.out.println("c");
   }
  else if(e<=40){
     System.out.println("f");
   }


  if(h>=90 && h<=100){
       System.out.println("A+");
    }
   else if(h>=80 && h<=90){
       System.out.println("A");
    } 
   else if(h>=70 && h<=80){
       System.out.println("b+");
   }
   else if(h>=60 && h<=70){
       System.out.println("b");
   }
  else if(h>=50 && h<=60){
       System.out.println("c+");
   }
  else if(h>=40 && h<=50){
     System.out.println("c");
   }
  else if(h<=40){
     System.out.println("f");
   }








  }
}