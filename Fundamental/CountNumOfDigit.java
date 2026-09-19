package Fundamental;

import java.util.Scanner;

public class CountNumOfDigit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if(n==0){
      System.out.println("Count of digit=1");
      return;
    }
    
    int count=0;
    while(n>0){
      n=n/10;
      count++;
    }
    System.out.println("Count of digit "+count);
  }
}
