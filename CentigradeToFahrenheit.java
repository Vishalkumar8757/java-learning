//Q16. Write a java program that converts Centigrade to Fahrenheit.

import java.util.Scanner;

public class CentigradeToFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Centigrade: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*9/5)+32;

        System.out.println("Fahrenheit is :"+fahrenheit);
        
    }
}
