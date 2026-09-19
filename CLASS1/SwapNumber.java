package CLASS1;

import java.util.Scanner;

public class SwapNumber {
  public static void main(String[] args) {
    // swap of two number
    System.out.println("Enter two number");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Before swapping "+a+" "+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swaping "+a+" "+b);


  }
}
