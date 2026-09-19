import java.util.Scanner;

public class ReverseOfArray {
  public static void main(String[] args) {
    Reverse();
  }
  public static void Reverse(){
    int arr[]=new int[4];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }

    //output of array
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
  }
}
