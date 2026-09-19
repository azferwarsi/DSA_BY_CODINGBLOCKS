

public class TwoSumInputArrayisSorted {
  int n=numbers.length;
  int left=0,right=n-1;
  while(left<right){
    int sum=numbers[left]+numbers[right];
    if(sum<target){
      left++;
    }
    else if(sum>target){
      right--;
    }
    else{
      return new int[]{left+1,right+1};
    }
  }
  return {-1,-1};
}
}
  public static void main(String[] args) {
    
  }
}
