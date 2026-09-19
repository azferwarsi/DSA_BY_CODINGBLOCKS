package Searching;

public class BinarySearch {
  public static void main(String[] args) {
    int a[]={2,5,7,9,12,14,16,17,19,20,24,28};
    int item=12;
    int li=0;
    int hi=a.length-1;
    int mi=(li+hi)/2;

    while(li<=hi)
    {
     if(a[mi]==item){
      System.out.println("Item found at "+mi);
       break;
     }
     else if(a[mi]<item){
      li=mi+1;
     }
     else{
      hi=mi-1;
     }
     mi=(li+hi)/2;
    }
  if(li>hi){
    System.out.println("Item not found");
  }
  }
}

  


