public class MaxSubarraySum {
  public static void main(String[] args) {
    // maximum subarray sum using Kadans algorithm
    int arr[]={2,-5,1,7,-3,4,-6};
    MaxSubarray(arr);
  }
  public static void MaxSubarray(int arr[]){
    int maxSum=arr[0];
    int currentSum=arr[0];
    for(int i=1;i<arr.length;i++){
      currentSum=Math.max(arr[i],currentSum+arr[i]);
      maxSum=Math.max(maxSum,currentSum);
    }
    System.out.println(maxSum);
  }
}
