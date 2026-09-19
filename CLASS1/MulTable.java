package CLASS1;

import java.util.Scanner;

public class MulTable {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=10;i++){
      
      System.out.println(n+ "*"+i+"="+n*i);
    }
    
  }
}
