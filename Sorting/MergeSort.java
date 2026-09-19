package Sorting;

public class MergeSort {
  int array[];
  int tempMergeArr[];
  int length;
  public static void main(String[] args) {
    int arr[]={48,36,13,52,19,94,21};
    MergeSort ms=new MergeSort();
    ms.sort(arr);
    for(int no:arr){
      System.out.print(no+" ");
    }

  }
  public void sort(int arr[]){
    this.array=arr;
    this.length=arr.length;
    this.tempMergeArr=new int[length];
    divideArray(0, length-1);
  }

  public void divideArray(int loweridx,int higheridx){
      if(loweridx<higheridx){
        int middle=loweridx+(higheridx-loweridx)/2;
        divideArray(loweridx, middle);

        divideArray(middle+1, higheridx);

        mergeArray(loweridx, middle, higheridx);
      }
  }

  public void mergeArray(int loweridx,int middle, int higheridx){
      for(int i=loweridx;i<=higheridx;i++){
        tempMergeArr[i]=array[i];
      }

      int i=loweridx;
      int j=middle+1;
      int k=loweridx;
      while(i<=middle && j<=higheridx){
        if(tempMergeArr[i]<=tempMergeArr[j]){
          array[k]=tempMergeArr[i];
          i++;
        }
        else{
          array[k]=tempMergeArr[j];
          j++;
        }
        k++;
      }
      while(i<=middle){
        array[k]=tempMergeArr[i];
        k++;
        i++;
      }
  }
}
