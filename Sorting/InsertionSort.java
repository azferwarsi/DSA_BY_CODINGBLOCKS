package Sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int arr[]={50,30,10,60,100,40,20};

    for(int i=1;i<arr.length;i++){
      int temp=arr[i];
      int j=i-1;
      while(  j>=0 && arr[j]>temp){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=temp;
    }

    // print aorted array
    for(int no:arr){
      System.out.print(no+" ");
    }
  }
}
