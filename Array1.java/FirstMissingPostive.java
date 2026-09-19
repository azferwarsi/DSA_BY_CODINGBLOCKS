public class FirstMissingPostive {
  public static void main(String[] args) {
    int nums[]={3,4,-1,1};
    System.out.println(firstMissingPositive(nums));
  }
  public static int firstMissingPositive(int[] nums) {
        // step-1 
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                nums[i]=n+1;
            }
        }

        //step-2
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])<=n){
                
                nums[Math.abs(nums[i])-1]= -1 *Math.abs(nums[Math.abs(nums[i])-1]);
            }
        }

        //step 3
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
