package CLASS1;

import java.util.Scanner;

public class MonthDays {
  public static void main(String[] args) {
    //month no and its days

    int n;
    System.out.println("Enter month number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n==4 || n==6 || n==9 || n==11){
      System.out.println("Given month number has 30 days");
    }
    else if(n==2){
      System.out.println("Its february month having either 28 days or 29 days");
    }
    else if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
      System.out.println("Given month numer has 31 days");
    }
    else{
      System.out.println("Invalid month number");
    }
  }
}
