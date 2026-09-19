public class TwoSumBruteForce{
  public static void main(String[] args) {
    int arr[]={1,2,3,4,7,9,11,15};
    int target=11;
    boolean found=false;
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==target){
          System.out.println(i+ ","+j);
          found=true;
        }
      }
     
    }
    if(found==false){
      System.out.println("Pair not found");
    }
  }

}