package CLASS1;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int n,fact=1;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
      fact=i*fact;
    }
    System.out.println("factorial of given number is "+fact);
  }
}
