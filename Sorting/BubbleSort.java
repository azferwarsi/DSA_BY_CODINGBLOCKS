package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int arr[]={55,32,44,25,16,22};
    int len=arr.length;
    int temp;
    for(int i=1;i<len;i++){
      boolean swapped=false;
      for(int j=0;j<len-i;j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped=true;
        }
      }
      if(swapped==false){
        break;
      }
    }
    // print of sorted array
    for(int no:arr){
      System.out.print(no+" ");
    }
  }
}
