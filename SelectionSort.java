import java.util.Scanner;
public class SelectionSort{
  public static void selectionSort(int arr[]){
     int n = arr.length;
         for(int i=0;i<n-1;i++){
            int minindex = i;
             for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                  minindex=j;
                 }
              }
               int tem=arr[minindex];
               arr[minindex]=arr[i];
               arr[i]=tem;
          }
     }
      public static void main(String args[]){
       int arr[]={7,10,4,8,3,1};
       System.out.println("before sorted");

       for(int a:arr){
          System.out.println("\t"+a);
        }
        selectionSort(arr);
         System.out.println("\nprint element after sorting");
          for(int a:arr){
              System.out.println("\t"+a);
           }
             System.out.println("");
      }
}