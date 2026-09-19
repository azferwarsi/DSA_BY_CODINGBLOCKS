package Fundamental;

import java.util.Scanner;

public class PowerOfThree {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    boolean isPower=true;
    if(n<=0){
      isPower=false;
    }
    else{
      while(n>1){
        if(n%3!=0){
          isPower=false;
          break;
        }
        n=n/3;
      }
    }
    if(isPower)
      System.out.println("The number is power 3");
      else
        System.out.println("Not power of 3");
    

  }
}
