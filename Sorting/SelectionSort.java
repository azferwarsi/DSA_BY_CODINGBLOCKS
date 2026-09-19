package Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int arr[]={49,74,25,36,88,18,31};
    for(int i=0;i<arr.length;i++){
      int min=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
          min=j;
        }
      }
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
    }
    // print sorted array
    for(int no:arr){
      System.out.print(no+" ");
    }
  }
}
