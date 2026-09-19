package TwoDArray;

import java.util.Scanner;

public class MirrorMatrix {
  public static void main(String[] args) {
    int a[][]=new int[2][2];
    System.out.println("Enter array element...");
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
      }
    }

    System.out.println("Matrix element");
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println("Mirror matrix");
    for(int i=0;i<2;i++){
      for(int j=1;j>=0;j--){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }

  }
}
