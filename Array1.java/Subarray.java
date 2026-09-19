import java.util.Scanner;

public class Subarray {
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
        for(int k=i;k<=j;k++){
          System.out.print(a[k]+" ");
        }
        System.out.println();
      }
    }
    System.out.println();
  }
  }

