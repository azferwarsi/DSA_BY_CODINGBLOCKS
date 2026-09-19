import java.util.Scanner;

public class SubarraySum {
  public static void main(String[] args) {
     int a[]=new int[5];
    System.out.println("ENTER ARRAY ELEMENT");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Printing all subarray");
    for(int i=0;i<5;i++){
      for(int j=i;j<5;j++){
        int subArraySum=0;
        for(int k=i;k<=j;k++){
          System.out.print(a[k]+" ");
          subArraySum+=a[k];
        }
        System.out.println("->"+subArraySum);
        System.out.println();
      } 
    }
    System.out.println(); 
  }
  }

