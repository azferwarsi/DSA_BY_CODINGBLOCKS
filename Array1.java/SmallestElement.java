public class SmallestElement {
  public static void main(String[] args) {
    int arr[]={1,2,0,8,6};
     int smallest=arr[0];

    for(int i=1;i<arr.length;i++){
      if(arr[i]<smallest){
        smallest=arr[i];
      }
    }
    System.out.println("The smallest elemnt is "+smallest);

  }
}
