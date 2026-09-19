package Searching;

public class LinearSearch2 {
  public static void main(String[] args) {
    String arr[]={"deepak","azfer","rohit","gaurav","amit"};
    String item="azfer";
    int temp=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i].equals(item)){
        System.out.println("Item found at index "+i);
        temp++;
      }
    }
    if(temp==0){
      System.out.println("Item not found");
    }
  }
}
