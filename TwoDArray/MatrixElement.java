package TwoDArray;

import java.util.Scanner;

public class MatrixElement {
  public static void main(String[] args) {
    // print elemens in matrix form
    int a[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=sc.nextInt();
      }

    }
    System.out.println("Array elements in matrix form...");
     for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
