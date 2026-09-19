package RECURSION;

public class Array_is_sorted {

  public static boolean isSorted(int arr[], int index){

    // base case
    if(index==arr.length-1){
      return true;
    }

    // check current pair
    if(arr[index]>arr[index+1]){
      return false;
    }

    //recursive call
    return isSorted(arr, index+1);

  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    System.out.println(isSorted(arr, 0));
  }
}
