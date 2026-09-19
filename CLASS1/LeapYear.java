package CLASS1;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    // leap year program
    //1. centuray (100%=0 and 400%=0)   2000 2400
    //2. yearly (100%!=0 and 4%=0)  2020 2024

    int y;
    System.out.println("Enter any year");
     Scanner sc=new Scanner(System.in);
     y=sc.nextInt();
    if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
      System.out.println("Leap year");
    }
    else{
      System.out.println("Not leap year");
    }

  }
}
