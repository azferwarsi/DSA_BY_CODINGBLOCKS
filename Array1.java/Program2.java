import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    //user input array
    

   System.out.println("enter the size of array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter array element");
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
      System.out.println("array element are:");
     for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
     }

  }
}
