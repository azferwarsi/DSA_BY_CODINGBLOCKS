package CLASS1;

import java.util.Scanner;

public class SwapNumber2 {
  public static void main(String[] args) {
    int a,b;
    System.out.println("Enter any two number");
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("Before swaping "+a+" "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swaping "+a+" "+b);

  }
}
