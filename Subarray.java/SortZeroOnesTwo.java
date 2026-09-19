public class SortZeroOnesTwo{

  public static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    

  }
  public static void Printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
     }
  }
  public static void main(String[] args) {
     int arr[]={2,0,1,1,2,0,1,0};
     int n=arr.length;
     for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
     }
     System.out.println();
     int beg=0;
     int mid=0;
     int end=n-1;

     while(mid<=end){
      if(arr[mid]==0){
        swap(arr,mid,beg);
        mid++;
        beg++;
      }
      else if(arr[mid]==1){
        mid++;
        continue; // not mandatory
      }
      else{
        // case arr[]
        swap(arr,mid,end);
        end--;
      }
     }
     Printarray(arr);
  }
}