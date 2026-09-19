public class TwoSum {
  public static void main(String[] args) {
    int arr[]={2,3,4,7,11,15};
    int target=11;
    int left=0;
    int right=arr.length-1;
    boolean found=false;

    while(left<right){
      int sum=arr[left]+arr[right];

      if(sum==target){
        System.out.println(left+","+right);
        right--;
        left++;
        found=true;
      }
      else if(sum>target){
        right--;
      }
      else{
        left++;
      }
    }
    if(!found){
      System.out.println("pair not found");
    }

  }
}
