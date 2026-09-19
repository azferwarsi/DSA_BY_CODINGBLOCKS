package SlidingWindowTechnique;

public class MaxSumSubarray {
  public static void main(String[] args) {
    
  
  int arr[]={100,48,82,57,34,112,65};
    int k=3;

    int windowSum=0,max=0;
    for(int i=0;i<k;i++){
      windowSum+=arr[i];
    }
   max=windowSum;

   for(int i=1;i<arr.length-k;i++){
      windowSum=windowSum-arr[i-1]+arr[i+k-1];
      if(windowSum>max){
        max=windowSum;
      }
   }
   System.out.println(max);
    }
  }


