import java.util.Scanner;
public class Insertion{
public static void insertionSort(int arr[]){
   int n = arr.length;
   for(int i=1;i<n;i++){
       int key = arr[i];
       int j = i-1;
       while(j>=0 && arr[j]>key){
          arr[j+1]=arr[j];
          j--;
         }
          arr[j+1]=key;
      }
   }
   public static void main(String args[]){
       int arr[]={4,5,10,6};
       System.out.println("before sorted");

       for(int a:arr){
          System.out.println("\t"+a);
        }
        insertionSort(arr);
         System.out.println("\nprint element after sorting");
          for(int a:arr){
              System.out.println("\t"+a);
           }
             System.out.println("");
      }

}