package CLASS1;

import java.util.Scanner;

public class PowerOfNum {
  public static void main(String[] args) {
    int n,p,result=1;
    System.out.println("Enter number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("Enter power");
    p=sc.nextInt();

    for(int i=1;i<=p;i++){
      result=n*result;
    }
    System.out.println("Power "+result);
  }
}
