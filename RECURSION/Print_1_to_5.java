package RECURSION;

import java.util.Scanner;

public class Print_1_to_5 {

  public static void Print1toN(int n){
    if(n==0){
      return;
    }

    Print1toN(n-1);
    System.out.print(n+" ");
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println();
    Print1toN(n);
  }
}
