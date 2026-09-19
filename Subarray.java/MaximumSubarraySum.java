import java.util.Scanner;

public class MaximumSubarraySum {

  public static int MaxSum(int a[]){
    int currentSubarraySum=Integer.MIN_VALUE;
    int MaxSubarraySum=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
      currentSubarraySum=Math.max(a[i],currentSubarraySum+a[i]);
      MaxSubarraySum=Math.max(MaxSubarraySum,currentSubarraySum);
    }
    return MaxSubarraySum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter array element");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    MaxSum(a);
  }
}
