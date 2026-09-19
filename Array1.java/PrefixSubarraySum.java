public class PrefixSubarraySum {
  public static void main(String[] args) {
    int a[]={3,2,1,6,5};
    int n=a.length;
    int prefixSum[]=new int[n];

    prefixSum[0]=a[0];
    for(int i=1;i<n;i++){
      prefixSum[i]=prefixSum[i-1]+a[i];
    }
     
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
     for(int i=0;i<n;i++){
      System.out.print(prefixSum[i]+" ");
    }
    System.out.println();


  }
}
