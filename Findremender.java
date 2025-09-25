import java.util.Scanner;
class Findremender{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    
        int b = sc.nextInt();
        int q = a/b;
        int r = a-(b*q);
        System.out.println(r);
    }
}