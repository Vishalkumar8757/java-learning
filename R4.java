import java.util.Scanner;
class R4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

            System.out.print("Enter student roll number: ");
            int r = sc.nextInt();

            System.out.print("Enter student name : ");
            String n = sc.next();

            System.out.print("Enter student percentage : ");
            double per = sc.nextDouble();

            System.out.print("Enter student enrollement : ");
            String enroll = sc.next();

            System.out.print("Enter student age : ");
            int age = sc.nextInt();

            System.out.print("Enter student grade : ");
            char g = sc.next().charAt(0);

            System.out.println("roll number : "+r);

            System.out.println("name : "+n);

            System.out.println("percentage : "+per);

            System.out.println("enrollment is : "+enroll);

            System.out.println("age is : "+age);

            System.out.println("grade : "+g);

    }

}








