package RECURSION;

public class Sum_of_array {

  public static int SumOfArray(int arr[],int index){
    if(index==arr.length){
      return 0;
    }

    return arr[index]+SumOfArray(arr, index+1);
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    System.out.println(SumOfArray(arr, 0));
  }
}
