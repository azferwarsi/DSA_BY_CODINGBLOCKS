public class LargestElement {
  public static void main(String[] args) {
    int arr[]={10,20,80,60};

    //assume largest element
    int largest=arr[0];

    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        largest=arr[i];
      }
    }
    System.out.println("The largest elemnt is "+largest);

  }
}
