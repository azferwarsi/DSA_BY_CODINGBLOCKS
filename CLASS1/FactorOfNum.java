package CLASS1;

import java.util.Scanner;

public class FactorOfNum {
  public static void main(String[] args) {
    //factor of a number
    int n;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("Fcator of given number is ");
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.print(i+" ");
      }
    }
  }
}
