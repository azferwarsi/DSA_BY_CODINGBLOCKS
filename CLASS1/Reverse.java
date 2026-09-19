package CLASS1;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    // reverse a number;
    int n,rem;
    System.out.println("Enter any number ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    while(n>0){
      rem=n%10;  //remendir
      System.out.print(rem);
      n=n/10;

    }
  }
}
