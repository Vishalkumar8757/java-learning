import java.util.Scanner;
public class LinearSearchDemo{
      public static int linearsearch(int arr[],int k){
       int result = -1;
          for(int i=0;i<arr.length;i++){
             if(k==arr[i]){
              result = i+1;
          }
     }
    return result;
}
 public static void main(String args[]){
   int arr[] = {100,1,90,2,80,3,70,4,60,5,50};
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter key :");
   int key = sc.nextInt();
   int r = linearsearch(arr,key);
     if(r>=0){
      System.out.println("Element fount at position :"+r);
      }
      else{
          System.out.println("Elementnot found");
      }
   }
}