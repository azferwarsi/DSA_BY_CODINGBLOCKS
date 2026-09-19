package Fundamental;

import java.util.Scanner;

public class ReverseAnumber {

  public static int reverseDigits(int n){
    int reverseNo=0;
    while(n>0){
      int rem=n%10;
      reverseNo=reverseNo*10+rem;
      n=n/10;
    }
    return reverseNo;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("Reverse of number is "+reverseDigits(n));
  }
}
