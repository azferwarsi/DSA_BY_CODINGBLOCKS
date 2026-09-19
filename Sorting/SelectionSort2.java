package Sorting;

public class SelectionSort2 {
  public static void main(String[] args) {
    String arr[]={"rahul","azfer","warsi","zafar","deepak"};

     for(int i=0;i<arr.length;i++){
      int min=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min].compareTo(arr[j])>0){
          min=j;
        }
      }
      String temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
    }
    // print sorted array
    for(String no:arr){
      System.out.print(no+" ");
    }
  }
}
