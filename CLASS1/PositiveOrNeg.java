package CLASS1;

import java.util.Scanner;

public class PositiveOrNeg {
  public static void main(String[] args) {
    int num;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    if(num>0){
      System.out.println("+Ve number");
    }
    else if(num<0){
      System.out.println("-Ve  number");
    }
    else{
      System.out.println("Nither +ve nor -Ve number");
    }
  }
}
